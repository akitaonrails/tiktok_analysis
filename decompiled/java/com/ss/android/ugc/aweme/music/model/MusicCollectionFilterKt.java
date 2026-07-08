package com.ss.android.ugc.aweme.music.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicCollectionFilterKt {
    public static final List<MusicCollectionItem> distinctByName(List<? extends MusicCollectionItem> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (MusicCollectionItem musicCollectionItem : list) {
            if (hashSet.add(musicCollectionItem.mcName)) {
                arrayList.add(musicCollectionItem);
            }
        }
        return arrayList;
    }
}
