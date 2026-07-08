package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PersonaTaskProgress {

    @C09CT("current_node")
    public PersonaTaskNode currentNode;

    @C09CT("undo_nodes")
    public List<PersonaTaskNode> undoNodes = new ArrayList();

    @C09CT("done_nodes")
    public List<PersonaTaskNode> doneNodes = new ArrayList();
}
