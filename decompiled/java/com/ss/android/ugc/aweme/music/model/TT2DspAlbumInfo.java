package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TT2DspAlbumInfo implements Serializable {

    @C09CT("linked_platform")
    public Integer linkedDsp;

    @C09CT("pre_save_info")
    public PreSaveInfo preSaveInfo;

    @C09CT("token")
    public DspAuthToken token;

    public TT2DspAlbumInfo() {
    }

    public final String getMetaAlbumId() {
        List<DspEntityInfo> list;
        DspEntityInfo next;
        PreSaveInfo preSaveInfo = this.preSaveInfo;
        if (preSaveInfo == null || (list = preSaveInfo.dspEntityInfoList) == null) {
            return null;
        }
        Iterator<DspEntityInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            String str = next.sourceEntityId;
            if (str != null && str.length() != 0) {
                break;
            }
        }
        DspEntityInfo dspEntityInfo = next;
        if (dspEntityInfo != null) {
            return dspEntityInfo.sourceEntityId;
        }
        return null;
    }

    public TT2DspAlbumInfo(PreSaveInfo preSaveInfo, DspAuthToken dspAuthToken, Integer num) {
        this.preSaveInfo = preSaveInfo;
        this.token = dspAuthToken;
        this.linkedDsp = num;
    }
}
