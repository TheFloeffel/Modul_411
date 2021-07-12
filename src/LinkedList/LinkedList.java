package LinkedList;

public class LinkedList {

    private Node firstNode;

// Get last element of list
    public Node getLastNode() {

        Node templast = firstNode;

        while (templast.getNext() != null) {

            templast = templast.getNext();

        }
        return templast;
    }

// Output all list values
    public void outWholeList() {

        Node temp = firstNode;
        int nodecount = 0;
        int listlength = this.getLength();

        while (nodecount < listlength) {

            System.out.println(temp.getValue());

            if (nodecount < listlength)
            temp = temp.getNext();

            nodecount++;

        }

    }

// Add list element
    public void add(int value) {

        if (this.firstNode == null) {

            this.firstNode = new Node(value);

        } else {

            Node tempnode = new Node(value);

            this.getLastNode().setNext(tempnode);

        }

    }

    public boolean delete(int value) {

        Node tempnode;
        Node previousNode;

        boolean deleted = false;

        if (firstNode.getValue() == value && firstNode != null) {
            firstNode = firstNode.getNext();

            deleted = true;
        } else {

            previousNode = firstNode;
            tempnode = firstNode.getNext();

            while (tempnode != null) {

                if (tempnode.getNext() == null && tempnode.getValue() == value) {

                    tempnode = null;

                    previousNode.setNext(null);
                }else {

                    if (tempnode.getValue() == value) {

                        previousNode.setNext(tempnode.getNext());

                        tempnode = null;

                        return true;

                    } else {

                        previousNode = tempnode;
                        tempnode = tempnode.getNext();

                    }

                }

            }

        }
        return deleted;
    }

// Get element with specific value
    public Node getNode(int value) {

        Node tempnode = this.firstNode;

        while (tempnode.getValue() != value && tempnode.getNext() != null) {

            tempnode = tempnode.getNext();

        }
        return tempnode;
    }

// Get list length
    public int getLength() {

        int length = 0;

        if (this.firstNode == null) {
            return 0;
        } else {

            Node tempnode = this.firstNode;
            length++;

            while (tempnode.getNext() != null) {

                tempnode = tempnode.getNext();
                length++;

            }
            return length;
        }

    }
}

