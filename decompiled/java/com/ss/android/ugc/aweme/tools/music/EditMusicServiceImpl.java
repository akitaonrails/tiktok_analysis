package com.ss.android.ugc.aweme.tools.music;

import X.C0PEM;
import X.C11NZ;
import X.C1446210njn;
import X.C1458410o3T;
import X.C19482711Kf;
import X.C2275708vr;
import X.C2296808zG;
import X.C23250099c;
import X.C527630Kmf;
import X.C533510Kw9;
import X.InterfaceC1478005qU;
import android.app.Activity;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParamKt;
import com.ss.android.ugc.aweme.music.model.SimpleMusicRequestParam;
import com.ss.android.ugc.aweme.shortvideo.model.AutoApplyMusicResponse;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class EditMusicServiceImpl implements IEditMusicServiceApi {
    @Override // com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi
    public final List<MusicModel> LIZ() {
        C533510Kw9.LIZ.getClass();
        return C533510Kw9.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi
    public final List<MusicModel> LIZIZ() {
        C533510Kw9.LIZ.getClass();
        return C533510Kw9.LJ();
    }

    @Override // com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi
    public final void LJ() {
        C533510Kw9.LIZ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C527630Kmf(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi
    public final String LIZJ() {
        return C2275708vr.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi
    public final void LJFF(Long l, Activity activity) {
        C533510Kw9.LIZ.getClass();
        C533510Kw9.LJII(l, activity);
    }

    @Override // com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi
    public final C11NZ LJI(long j, SimpleMusicRequestParam simpleMusicRequestParam) {
        return C1458410o3T.LJ(C1458410o3T.LIZ, 0, 1, j, simpleMusicRequestParam);
    }

    @Override // com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi
    public final C19482711Kf LIZLLL(final float f, final float f2, final float f3, final String str, final C1446210njn c1446210njn) {
        C1458410o3T.LIZ.getClass();
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0tKu
            public final /* synthetic */ String LJ = "";

            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<AutoApplyMusicResponse> c09aj) {
                C1C7U.LIZ("AIChooseMusicManager@73c4.getAedAutoApplyMusic$1");
                float f4 = f;
                float f5 = f2;
                float f6 = f3;
                String str2 = str;
                String str3 = this.LJ;
                IMusicRequestParam iMusicRequestParam = c1446210njn;
                ChooseMusicApi.API api = ChooseMusicApi.LIZ;
                String shootWay = iMusicRequestParam.getShootWay();
                String contentType = iMusicRequestParam.getContentType();
                String contentSource = iMusicRequestParam.getContentSource();
                String infoStickerList = iMusicRequestParam.getInfoStickerList();
                String mvId = iMusicRequestParam.getMvId();
                String challengeId = iMusicRequestParam.getChallengeId();
                String textContent = iMusicRequestParam.getTextContent();
                String effectId = iMusicRequestParam.getEffectId();
                String creationId = iMusicRequestParam.getCreationId();
                Long lValueOf = Long.valueOf(iMusicRequestParam.getVideoDuration());
                Long replaceMusicIndex = iMusicRequestParam.getReplaceMusicIndex();
                Boolean boolValueOf = Boolean.valueOf(iMusicRequestParam.getUnlimitedOnly());
                int musicTag = iMusicRequestParam.getMusicTag();
                Map<String, Object> recommendExtra = iMusicRequestParam.getRecommendExtra();
                JSONObject jSONObject = null;
                if (recommendExtra != null) {
                    jSONObject = IMusicRequestParamKt.toJSONObject(recommendExtra, null);
                }
                api.LJIIIIZZ(f4, f5, f6, str2, str3, 0, 2, null, 1, shootWay, contentType, contentSource, infoStickerList, mvId, challengeId, textContent, effectId, creationId, lValueOf, replaceMusicIndex, boolValueOf, musicTag, jSONObject).LIZLLL(new C1466870oH7((C19482611Ke) c09aj, 13));
                C1C7U.LIZIZ("AIChooseMusicManager@73c4.getAedAutoApplyMusic$1");
            }
        });
    }
}
