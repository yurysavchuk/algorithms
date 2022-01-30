package com.github.yurysavchuk.linkedlists.deletenode;

public class DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        if (nextNode.next != null) {
            deleteNode(nextNode);
        } else {
            node.next = null;
        }
    }

}
