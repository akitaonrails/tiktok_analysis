package com.ss.android.ugc.aweme.openshare;

import X.C1B40;
import X.C786410Ut5;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest;
import com.ss.android.ugc.aweme.openshare.entity.DYMediaContent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes35.dex */
public final class Share$Request extends DYBaseRequest {
    public ArrayList<String> mHashTagList = new ArrayList<>();
    public DYMediaContent mMediaContent;
    public MusicContent mMusicContent;
    public int mTargetSceneType;

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest, X.C1B3T
    public int getType() {
        return 3;
    }

    public Share$Request() {
    }

    @Override // X.C1B3T
    public boolean checkArgs() {
        super.checkArgs();
        DYMediaContent dYMediaContent = this.mMediaContent;
        if (dYMediaContent == null) {
            return false;
        }
        return dYMediaContent.checkArgs();
    }

    public final ArrayList<String> getMHashTagList() {
        return this.mHashTagList;
    }

    public final DYMediaContent getMMediaContent() {
        return this.mMediaContent;
    }

    public final MusicContent getMMusicContent() {
        return this.mMusicContent;
    }

    public final int getMTargetSceneType() {
        return this.mTargetSceneType;
    }

    public Share$Request(Bundle bundle) {
        fromBundle(bundle);
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest, X.C1B3T
    public void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene", 0);
        this.mHashTagList = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
        DYMediaContent dYMediaContent = new DYMediaContent();
        String string = bundle.getString("_dyobject_identifier_");
        if (string != null && string.length() > 0) {
            try {
                dYMediaContent.setMMediaObject((C1B40) Class.forName(string).newInstance());
                dYMediaContent.getMMediaObject().LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.mMediaContent = dYMediaContent;
    }

    public final void setMHashTagList(ArrayList<String> arrayList) {
        this.mHashTagList = arrayList;
    }

    public final void setMMediaContent(DYMediaContent dYMediaContent) {
        this.mMediaContent = dYMediaContent;
    }

    public final void setMMusicContent(MusicContent musicContent) {
        this.mMusicContent = musicContent;
    }

    public final void setMTargetSceneType(int i) {
        this.mTargetSceneType = i;
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest, X.C1B3T
    public void toBundle(Bundle bundle) {
        Bundle bundle2;
        super.toBundle(bundle);
        DYMediaContent dYMediaContent = this.mMediaContent;
        if (dYMediaContent != null) {
            bundle2 = new Bundle();
            if (dYMediaContent.getMMediaObject() != null) {
                C786410Ut5.LJJJI("_dyobject_identifier_", dYMediaContent.getMMediaObject().getClass().getName(), bundle2);
                dYMediaContent.getMMediaObject().serialize();
            }
        } else {
            bundle2 = null;
        }
        C786410Ut5.LJJIIJZLJL(bundle, bundle2);
        bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
        C786410Ut5.LJJJIL(bundle, "_aweme_open_sdk_params_hashtag_list", this.mHashTagList);
    }
}
