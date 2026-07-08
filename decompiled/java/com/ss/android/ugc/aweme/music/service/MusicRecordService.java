package com.ss.android.ugc.aweme.music.service;

import X.C0FNV;
import X.C0LD3;
import X.C0LEP;
import X.C0MVY;
import X.C1399150mVt;
import X.C15L7;
import X.C15L9;
import X.C194353111z;
import X.C785410UrT;
import X.C786410Ut5;
import X.EnumC1399740mWq;
import X.InterfaceC1399770mWt;
import X.ProgressDialogC1399760mWs;
import Y.ARunnableS39S0400000_31;
import Y.ARunnableS64S0300000_31;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicRecordService implements IMusicRecordService {
    public long LIZIZ;
    public ProgressDialogC1399760mWs LIZJ;
    public ProgressDialogC1399760mWs LIZLLL;
    public C15L9 LJ;
    public boolean LJFF;
    public boolean LJII;
    public boolean LIZ = true;
    public boolean LJI = true;

    public static ArrayList LIZ(String str) {
        if (str != null && !str.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : str.split(",")) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static void LIZJ(boolean z) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZJ(1025, c0mvy, C0LD3.DUAL_BALL, C0LEP.CLOSE_GONE, true);
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            this.LJFF = false;
            ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LIZLLL;
            if (progressDialogC1399760mWs != null) {
                C0FNV.LIZ(progressDialogC1399760mWs);
                LIZJ(false);
            }
            this.LIZLLL = null;
        }
        ProgressDialogC1399760mWs progressDialogC1399760mWs2 = this.LIZJ;
        if (progressDialogC1399760mWs2 != null) {
            progressDialogC1399760mWs2.dismiss();
            C785410UrT.LIZ(progressDialogC1399760mWs2);
            LIZJ(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(Activity activity, final MusicModel musicModel, C15L7 c15l7, Boolean bool) {
        if (bool.booleanValue() && (activity instanceof LifecycleOwner)) {
            this.LJFF = true;
            new SafeHandler((LifecycleOwner) activity).postDelayed(new ARunnableS64S0300000_31(activity, musicModel, this, 4), 300L);
            return;
        }
        if (c15l7 != null) {
            c15l7.LIZ();
            if (c15l7.LJ()) {
                this.LIZJ = null;
                return;
            }
        }
        this.LIZJ = C1399150mVt.LIZIZ(activity, EnumC1399740mWq.VISIBLE_AFTER_5S, new InterfaceC1399770mWt() { // from class: X.15L6
            @Override // X.InterfaceC1399770mWt
            public final void LIZ() {
                MusicRecordService musicRecordService = this.LIZ;
                MusicModel musicModel2 = musicModel;
                musicRecordService.LJII = true;
                musicRecordService.LJ.LIZ(musicModel2.getMusicId());
            }
        });
        LIZJ(true);
    }

    public final void LJ(Activity activity, MusicModel musicModel, C15L7 c15l7, boolean z, boolean z2, String str) {
        if (!z) {
            if (!z2) {
                LIZLLL(activity, musicModel, c15l7, Boolean.FALSE);
            } else {
                C786410Ut5.LJLIIL(3000L, new BPEAHandler(), new ARunnableS39S0400000_31(this, activity, musicModel, c15l7, str, 1));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, C15L7 c15l7, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, String str10) {
        startRecord(lifecycleOwner, activity, musicModel, str, str2, c15l7, i, z, str3, i2, str4, str5, str6, bool, str7, bool2, bool3, str8, str9, shootExtraData, true, str10);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, C15L7 c15l7, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2, String str10) {
        startRecord(lifecycleOwner, activity, musicModel, str, str2, c15l7, i, z, str3, i2, str4, str5, str6, bool, str7, bool2, bool3, str8, str9, shootExtraData, z2, Boolean.FALSE, str10);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, C15L7 c15l7, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2, Boolean bool4, String str10) {
        startRecord(lifecycleOwner, activity, musicModel, null, str, str2, c15l7, i, z, str3, i2, str4, str5, str6, bool, str7, bool2, bool3, str8, str9, shootExtraData, z2, bool4, null, str10);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, MusicStickerStruct musicStickerStruct, String str, String str2, C15L7 c15l7, int i, boolean z, String str3, int i2, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, String str8, String str9, ShootExtraData shootExtraData, boolean z2, Boolean bool4, TtsVoiceInfo ttsVoiceInfo, String str10) {
        startRecord(lifecycleOwner, activity, musicModel, musicStickerStruct, str, str2, c15l7, i, z, str3, i2, str4, str5, str6, bool, str7, bool2, bool3, str8, str9, shootExtraData, z2, bool4, ttsVoiceInfo, false, str10, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startRecord(androidx.lifecycle.LifecycleOwner r33, final android.app.Activity r34, final com.ss.android.ugc.aweme.shortvideo.model.MusicModel r35, com.ss.android.ugc.aweme.music.model.MusicStickerStruct r36, final java.lang.String r37, java.lang.String r38, X.C15L7 r39, final int r40, final boolean r41, java.lang.String r42, int r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.Boolean r47, java.lang.String r48, java.lang.Boolean r49, java.lang.Boolean r50, java.lang.String r51, java.lang.String r52, com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData r53, boolean r54, java.lang.Boolean r55, com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo r56, boolean r57, java.lang.String r58, java.lang.String r59, java.lang.String r60) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.service.MusicRecordService.startRecord(androidx.lifecycle.LifecycleOwner, android.app.Activity, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, com.ss.android.ugc.aweme.music.model.MusicStickerStruct, java.lang.String, java.lang.String, X.15L7, int, boolean, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData, boolean, java.lang.Boolean, com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
