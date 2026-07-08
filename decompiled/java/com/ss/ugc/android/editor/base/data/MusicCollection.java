package com.ss.ugc.android.editor.base.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicCollection implements Serializable {
    public final String id;
    public final String name;

    @C09CT("name_en")
    public final String nameEn;

    public MusicCollection(String str, String str2, String str3) {
        this.id = str;
        this.name = str2;
        this.nameEn = str3;
    }
}
