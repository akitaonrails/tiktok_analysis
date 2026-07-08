package com.ss.android.ugc.aweme.social.creation.record.monitor;

import X.C01GW;
import X.C0CHQ;
import X.C1402840mbq;
import X.C1443540nfU;
import X.C1448140nmu;
import X.C1448150nmv;
import X.C1688700u2u;
import X.C1DPV;
import X.C1DRG;
import X.C201955140j;
import X.C201967140v;
import X.C2188811AlT;
import X.C297290Bl1;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1625000sOA;
import X.InterfaceC1648570t0B;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.creation.FFDEventReport;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordRootView;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import mn3.e0;
import pyl.s;

/* JADX INFO: loaded from: classes23.dex */
public abstract class RecordMonitor extends TikTokCameraBaseGroupScene {
    public ShortVideoContext LLJZIJLIL;
    public boolean LLL;
    public long LLLF;
    public boolean LLLFF;
    public long LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public VideoRecordRootView LLLIIIIL;
    public String LLLIIIL;

    public RecordMonitor() {
        super(0);
        this.LLLF = -1L;
        this.LLLFFI = -1L;
        this.LLLFZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 379));
        this.LLLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 380));
        this.LLLII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 378));
        this.LLLIIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 377));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public final void LLLLLLL() {
        InterfaceC1648570t0B interfaceC1648570t0B = (InterfaceC1648570t0B) this.LLLI.getValue();
        if (interfaceC1648570t0B != null) {
            interfaceC1648570t0B.V2(false);
        }
    }

    public final e0 LLLLZ() {
        return (e0) this.LLLIIII.getValue();
    }

    public final C1DRG LLLLZIL() {
        return (C1DRG) this.LLLFZ.getValue();
    }

    @Override // X.AbstractC214814194y
    public void onEnterAnimationComplete() {
        LiveData<C1448140nmu> liveDataQF1;
        C1448140nmu value;
        if (this.mArguments == null) {
            return;
        }
        this.LLLF = System.currentTimeMillis();
        e0 e0VarLLLLZ = LLLLZ();
        if (e0VarLLLLZ == null || (liveDataQF1 = e0VarLLLLZ.qF1()) == null || (value = liveDataQF1.getValue()) == null) {
            return;
        }
        LLLLZLLIL(value);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onStart() {
        if (this.LLLF == -1) {
            this.LLLF = System.currentTimeMillis();
        }
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onResume() {
        CreativeModel creativeModel;
        FFDEventReport fFDEventReport;
        super.onResume();
        this.LLLFFI = System.currentTimeMillis();
        Bundle bundle = this.mArguments;
        long j = this.LLLFFI - (bundle != null ? bundle.getLong("extra_start_record_time", 0L) : 0L);
        ShortVideoContext shortVideoContext = this.LLJZIJLIL;
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (fFDEventReport = creativeModel.ffdEventReport) == null) {
            return;
        }
        fFDEventReport.shootUiFFD = j;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene
    public ShortVideoContext LLLLLLZZ() {
        return this.LLJZIJLIL;
    }

    public final void LLLLZLL(Bundle bundle) {
        ShortVideoContext shortVideoContext;
        boolean z;
        ShortVideoContext shortVideoContext2;
        boolean z2 = false;
        if (bundle != null) {
            ShortVideoContext shortVideoContext3 = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            this.LLJZIJLIL = shortVideoContext3;
            if (shortVideoContext3 != null && C297290Bl1.LIZ() && (shortVideoContext2 = this.LLJZIJLIL) != null) {
                shortVideoContext2.isRestoreFromSaveInstance = true;
            }
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initData with outState,shortVideoContext is NULL:");
            if (this.LLJZIJLIL == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.mArguments == null) {
            this.mArguments = new Bundle();
        }
        if (this.LLJZIJLIL == null) {
            C0CHQ.LIZ().LJJIZ();
            Bundle bundle2 = this.mArguments;
            this.LLJZIJLIL = C1443540nfU.LIZJ(bundle2, requireAppCompatActivity(), null);
            C1402840mbq c1402840mbq = (C1402840mbq) bundle2.getSerializable("share_model");
            if (c1402840mbq != null && (shortVideoContext = this.LLJZIJLIL) != null) {
                shortVideoContext.shareContext = c1402840mbq;
            }
            C201967140v c201967140v2 = C201967140v.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initData with intent,shortVideoContext is NULL:");
            if (this.LLJZIJLIL == null) {
                z2 = true;
            }
            sbLIZ2.append(z2);
            C201955140j.LIZJ(c201967140v2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        ShortVideoContext shortVideoContext4 = this.LLJZIJLIL;
        if (shortVideoContext4 != null) {
            C1DPV.LIZIZ.LIZ(C1448150nmv.LIZ(shortVideoContext4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1002:0x0eeb  */
    /* JADX WARN: Removed duplicated region for block: B:1009:0x0f0c  */
    /* JADX WARN: Removed duplicated region for block: B:1013:0x0f27  */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:1015:0x0f2b  */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x0f2d  */
    /* JADX WARN: Removed duplicated region for block: B:1017:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:1018:0x0f47  */
    /* JADX WARN: Removed duplicated region for block: B:1019:0x0f4a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be A[PHI: r8
      0x00be: PHI (r8v11 java.lang.String) = (r8v0 java.lang.String), (r8v12 java.lang.String) binds: [B:44:0x00bc, B:42:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4 A[PHI: r8
      0x00c4: PHI (r8v10 java.lang.String) = (r8v0 java.lang.String), (r8v11 java.lang.String) binds: [B:44:0x00bc, B:46:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x09f5 A[LOOP:0: B:638:0x09ef->B:640:0x09f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0ae6 A[PHI: r6
      0x0ae6: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v16 java.lang.String), (r6v16 java.lang.String) binds: [B:670:0x0ae2, B:526:0x087c, B:528:0x0880] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0b64  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x0d21  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:860:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:864:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x0d31  */
    /* JADX WARN: Removed duplicated region for block: B:866:0x0d34  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x0d3a  */
    /* JADX WARN: Removed duplicated region for block: B:869:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:872:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:873:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:874:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:875:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:876:0x0d53  */
    /* JADX WARN: Removed duplicated region for block: B:877:0x0d56  */
    /* JADX WARN: Removed duplicated region for block: B:878:0x0d59  */
    /* JADX WARN: Removed duplicated region for block: B:879:0x0d5c  */
    /* JADX WARN: Removed duplicated region for block: B:880:0x0d5f  */
    /* JADX WARN: Removed duplicated region for block: B:881:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:884:0x0d6b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:898:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:903:0x0d98  */
    /* JADX WARN: Removed duplicated region for block: B:904:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:905:0x0d9f  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:907:0x0da7  */
    /* JADX WARN: Removed duplicated region for block: B:908:0x0daa  */
    /* JADX WARN: Removed duplicated region for block: B:909:0x0dae  */
    /* JADX WARN: Removed duplicated region for block: B:910:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x0db5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:920:0x0ddf A[PHI: r53
      0x0ddf: PHI (r53v2 X.0sv2) = (r53v1 X.0sv2), (r53v1 X.0sv2), (r53v1 X.0sv2), (r53v7 X.0sv2), (r53v7 X.0sv2), (r53v7 X.0sv2) binds: [B:914:0x0dc1, B:916:0x0dcb, B:918:0x0dd1, B:64:0x0113, B:66:0x011d, B:68:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:933:0x0e0a  */
    /* JADX WARN: Removed duplicated region for block: B:942:0x0e39  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x0e44  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:950:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:968:0x0e7e  */
    /* JADX WARN: Removed duplicated region for block: B:977:0x0e95  */
    /* JADX WARN: Removed duplicated region for block: B:987:0x0eb5  */
    /* JADX WARN: Removed duplicated region for block: B:990:0x0ec0  */
    /* JADX WARN: Removed duplicated region for block: B:994:0x0eca  */
    /* JADX WARN: Removed duplicated region for block: B:999:0x0edc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLLIL(X.C1448140nmu r83) {
        /*
            Method dump skipped, instruction units count: 3919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.record.monitor.RecordMonitor.LLLLZLLIL(X.0nmu):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    @Override // com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityCreated(android.os.Bundle r5) {
        /*
            r4 = this;
            mn3.e0 r0 = r4.LLLLZ()
            if (r0 == 0) goto L16
            androidx.lifecycle.LiveData r2 = r0.qF1()
            if (r2 == 0) goto L16
            Y.AObserverS225S0100000_22 r1 = new Y.AObserverS225S0100000_22
            r0 = 58
            r1.<init>(r4, r0)
            r2.observe(r4, r1)
        L16:
            android.os.Bundle r1 = r4.mArguments
            r3 = 0
            if (r1 == 0) goto L79
            java.lang.String r0 = "shoot_way"
            java.lang.String r1 = r1.getString(r0)
        L21:
            java.lang.String r0 = "story"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 1
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r4.LLJZIJLIL
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.creative.model.StoryShootModel r0 = r0.storyModel
            if (r0 == 0) goto L77
            boolean r0 = r0.isShootFromSocialAlbum()
            if (r0 != r2) goto L77
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r4.LLJZIJLIL
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.creative.model.StoryShootModel r0 = r0.storyModel
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType r3 = r0.getUploadPageEntranceType()
        L4c:
            com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType r0 = com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType.REVEAL_ONLY
            if (r3 == r0) goto L77
            r0 = 1
        L51:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r4.LLJZIJLIL
            if (r1 == 0) goto L68
            if (r0 != 0) goto L68
            X.01GW r0 = X.C281230B0n.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L68
            X.C1444920nhi.LIZLLL(r1)
        L68:
            super.onActivityCreated(r5)
            r0 = 2131391638(0x7f0a7496, float:1.8403881E38)
            android.view.View r0 = r4.findViewById(r0)
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordRootView r0 = (com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordRootView) r0
            r4.LLLIIIIL = r0
            return
        L77:
            r0 = 0
            goto L51
        L79:
            r1 = r3
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.record.monitor.RecordMonitor.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.AbstractC214814194y
    public final boolean processNewArguments(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null) {
            return true;
        }
        if (this.LLJZIJLIL != null && C1688700u2u.LIZ(requireAppCompatActivity())) {
            int i = bundle.getInt("retake_shoot_mode", -1);
            if (i != 1) {
                if (i == 2) {
                    C1443540nfU.LJIILIIL(bundle, this.LLJZIJLIL);
                }
                if (Intrinsics.LJFF("video_edit_page", bundle.getString("enter_from")) && bundle.getBoolean("to_ai_self") && (bundle2 = this.mArguments) != null) {
                    C786410Ut5.LJJJI("enter_from", "video_edit_page", bundle2);
                }
                if (bundle.getBoolean("recreate_record_and_clear", false)) {
                    C201955140j.LIZJ(C201967140v.LIZIZ, "VideoRecordNewActivity isClear");
                    this.mArguments = bundle;
                    e0 e0VarLLLLZ = LLLLZ();
                    if (e0VarLLLLZ != null) {
                        e0VarLLLLZ.NF(s.NORMAL);
                    }
                    InterfaceC1648570t0B interfaceC1648570t0B = (InterfaceC1648570t0B) this.LLLI.getValue();
                    if (interfaceC1648570t0B != null) {
                        interfaceC1648570t0B.jJ1(true);
                    }
                    InterfaceC1625000sOA interfaceC1625000sOA = (InterfaceC1625000sOA) this.LLLII.getValue();
                    if (interfaceC1625000sOA != null) {
                        interfaceC1625000sOA.Mg2();
                    }
                    o.LJIL.LJJIL().LIZ().refreshData();
                    LLLLZLL(null);
                } else if (this.LLJZIJLIL == null) {
                    LLLLZLL(null);
                    return true;
                }
                return true;
            }
            C1443540nfU.LJIILLIIL(bundle, this.LLJZIJLIL);
            ShortVideoContext shortVideoContext = this.LLJZIJLIL;
            if (shortVideoContext != null && shortVideoContext.LJJJJIZL()) {
                this.LLL = false;
            }
            return super.processNewArguments(bundle);
        }
        C201955140j.LIZJ(C201967140v.LIZIZ, "close record page because of null shortVideoContext instance when invoking onNewIntent method");
        finish();
        return true;
    }
}
