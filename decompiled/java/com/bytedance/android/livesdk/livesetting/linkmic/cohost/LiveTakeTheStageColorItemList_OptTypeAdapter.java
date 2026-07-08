package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveTakeTheStageColorItemList_OptTypeAdapter extends TypeAdapter<LiveTakeTheStageColorItemList> {
    public final Gson LIZ;

    public LiveTakeTheStageColorItemList_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveTakeTheStageColorItemList read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveTakeTheStageColorItemList liveTakeTheStageColorItemList = new LiveTakeTheStageColorItemList();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 48:
                        if (strLJJJJ.equals(CardStruct.IStatusCode.DEFAULT)) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColorItemList.item0 = (LiveTakeTheStageColorItem) this.LIZ.LJIIJ(LiveTakeTheStageColorItem.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 49:
                        if (strLJJJJ.equals("1")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColorItemList.item1 = (LiveTakeTheStageColorItem) this.LIZ.LJIIJ(LiveTakeTheStageColorItem.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                        if (strLJJJJ.equals("2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColorItemList.item2 = (LiveTakeTheStageColorItem) this.LIZ.LJIIJ(LiveTakeTheStageColorItem.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 51:
                        if (strLJJJJ.equals("3")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColorItemList.item3 = (LiveTakeTheStageColorItem) this.LIZ.LJIIJ(LiveTakeTheStageColorItem.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveTakeTheStageColorItemList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveTakeTheStageColorItemList liveTakeTheStageColorItemList) {
        LiveTakeTheStageColorItemList liveTakeTheStageColorItemList2 = liveTakeTheStageColorItemList;
        if (liveTakeTheStageColorItemList2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL(CardStruct.IStatusCode.DEFAULT);
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(LiveTakeTheStageColorItem.class);
        typeAdapterLJIIJ.write(c09dl, liveTakeTheStageColorItemList2.item0);
        c09dl.LJIILLIIL("1");
        typeAdapterLJIIJ.write(c09dl, liveTakeTheStageColorItemList2.item1);
        c09dl.LJIILLIIL("2");
        typeAdapterLJIIJ.write(c09dl, liveTakeTheStageColorItemList2.item2);
        c09dl.LJIILLIIL("3");
        typeAdapterLJIIJ.write(c09dl, liveTakeTheStageColorItemList2.item3);
        c09dl.LJII();
    }
}
