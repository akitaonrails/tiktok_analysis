package com.ss.android.ugc.aweme.config;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchVerticalChunkSizeListSettings {
    public static final ECSearchVerticalChunkSizeListModel LIZ;

    static {
        new ECSearchVerticalChunkSizeListSettings();
        LIZ = new ECSearchVerticalChunkSizeListModel(C1697810uHb.LJIIJJI(6L, 6L));
    }

    public static final ECSearchVerticalChunkSizeListModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECSearchVerticalChunkSizeListModel eCSearchVerticalChunkSizeListModel = LIZ;
        ECSearchVerticalChunkSizeListModel eCSearchVerticalChunkSizeListModel2 = (ECSearchVerticalChunkSizeListModel) settingsManagerLIZLLL.LJIIIIZZ("ec_search_vertical_chunk_size_list", ECSearchVerticalChunkSizeListModel.class, eCSearchVerticalChunkSizeListModel);
        return eCSearchVerticalChunkSizeListModel2 != null ? eCSearchVerticalChunkSizeListModel2 : eCSearchVerticalChunkSizeListModel;
    }

    public static final class ECSearchVerticalChunkSizeListModel {

        @C09CT("chunk_size_list")
        public final List<Long> chunkSizeList;

        public ECSearchVerticalChunkSizeListModel(List<Long> list) {
            this.chunkSizeList = list;
        }
    }
}
