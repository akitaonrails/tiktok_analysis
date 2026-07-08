package com.ss.android.ugc.effectmanager.effect.model;

import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class ComposerNode {
    public String UI_name;
    public List<ComposerNode> children;
    public float default_value;
    public Effect effect;
    public String file;
    public String icon;
    public float max_value;
    public float min_value;
    public ComposerNode parent;
    public int switch_mode;
    public String tag_name;
    public int type;

    public boolean isLeaf() {
        int i = this.type;
        return (i == 4 || i == 1) ? false : true;
    }
}
