package kotlin.jvm.internal;

import X.AbstractC1437870nWL;
import X.AbstractC20611515l3;
import X.AbstractC214814194y;
import X.C09AY;
import X.C0GX9;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C1420050n3b;
import X.C1421200n5S;
import X.C1421230n5V;
import X.C1421330n5f;
import X.C1421350n5h;
import X.C1439300nYe;
import X.C1439740nZM;
import X.C1439810nZT;
import X.C1442190ndJ;
import X.C1442270ndR;
import X.C1442280ndS;
import X.C1456190nzt;
import X.C1456610o0Z;
import X.C1456770o0p;
import X.C1459920o5u;
import X.C19EG;
import X.C19GS;
import X.C1DRF;
import X.C21308518aB;
import X.C2188811AlT;
import X.C2216441Bow;
import X.C2248481CzW;
import X.C290850Bad;
import X.C355090Dw3;
import X.C375830EoP;
import X.C985403tE;
import X.EnumC1461520o8U;
import X.EnumC1461710o8n;
import X.InterfaceC1444130ngR;
import X.InterfaceC1455590nyv;
import X.InterfaceC524950KiL;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.creationmodel.framework.ScopeKey;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.stickers.PovModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import jg5.AvS181S0000000_22;
import jg5.AvS51S1000000_22;
import jg5.AvS540S0100000_8;
import jg5.AvS541S0100000_22;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public class AwS40S0310000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS40S0310000_22 awS40S0310000_22, Object obj) {
        C1DRF c1drf = (C1DRF) obj;
        final C19GS c19gsRequireAppCompatActivity = ((VideoEditContainerScene) awS40S0310000_22.l0).requireAppCompatActivity();
        if (!awS40S0310000_22.z3) {
            c1drf.LJFF(SAAActivity.class, null, new AvS541S0100000_22(c19gsRequireAppCompatActivity, 25));
        }
        c1drf.LJFF(C19GS.class, null, new AvS541S0100000_22(c19gsRequireAppCompatActivity, 26));
        c1drf.LJFF(C19EG.class, null, new AvS540S0100000_8(c19gsRequireAppCompatActivity, 25));
        c1drf.LJFF(Activity.class, null, new AvS540S0100000_8(c19gsRequireAppCompatActivity, 26));
        c1drf.LJFF(Context.class, null, new AvS540S0100000_8(c19gsRequireAppCompatActivity, 27));
        c1drf.LJFF(Context.class, "applicationContext", new AvS541S0100000_22(c19gsRequireAppCompatActivity, 30));
        C21308518aB c21308518aBLJFF = c1drf.LJFF(VideoEditContainerScene.class, null, new AvS541S0100000_22((VideoEditContainerScene) awS40S0310000_22.l0, 27));
        c21308518aBLJFF.LIZ(AbstractC214814194y.class);
        c21308518aBLJFF.LIZ(InterfaceC524950KiL.class);
        c1drf.LJFF(VideoPublishEditModel.class, null, new AvS540S0100000_8((VideoEditContainerScene) awS40S0310000_22.l0, 28));
        c1drf.LJFF(C1439810nZT.class, null, new AvS541S0100000_22((VideoEditContainerScene) awS40S0310000_22.l0, 28));
        c1drf.LJFF(C1439740nZM.class, null, new AvS541S0100000_22((VideoEditContainerScene) awS40S0310000_22.l0, 29));
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) awS40S0310000_22.l0;
        AVMusic aVMusic = videoEditContainerScene.LLJLLIL;
        if (aVMusic != null) {
            c1drf.LJFF(AVMusic.class, null, new AvS540S0100000_8(aVMusic, 29));
            String musicOrigin = videoEditContainerScene.LLJZIJLIL.getMusicOrigin();
            if (musicOrigin != null) {
                c1drf.LJFF(String.class, "old_music_original", new AvS51S1000000_22(musicOrigin, 0));
            }
        }
        String str = ((VideoEditContainerScene) awS40S0310000_22.l0).LLJLLL;
        if (str != null) {
            c1drf.LJFF(String.class, "old_music_path", new AvS51S1000000_22(str, 1));
        }
        c1drf.LJFF(Integer.class, "draft_to_Edit_from", new AvS541S0100000_22((VideoEditContainerScene) awS40S0310000_22.l0, 17));
        c1drf.LJFF(InterfaceC1444130ngR.class, null, new AvS541S0100000_22((InterfaceC1444130ngR) awS40S0310000_22.l1, 19));
        c1drf.LJFF(LifecycleOwner.class, null, new AvS541S0100000_22((VideoEditContainerScene) awS40S0310000_22.l0, 20));
        c1drf.LJFF(InterfaceC1455590nyv.class, null, new AvS181S0000000_22(7));
        c1drf.LJFF(C1439300nYe.class, null, new AvS541S0100000_22((VideoEditContainerScene) awS40S0310000_22.l0, 21));
        final VideoEditContainerScene videoEditContainerScene2 = (VideoEditContainerScene) awS40S0310000_22.l0;
        c1drf.LJFF(C1459920o5u.class, null, new AbstractC20611515l3<C1459920o5u>() { // from class: X.0nzV
            @Override // X.AbstractC20611515l3
            public final C1459920o5u LIZIZ(C1DRG c1drg) {
                C19GS c19gs = c19gsRequireAppCompatActivity;
                VideoEditContainerScene videoEditContainerScene3 = videoEditContainerScene2;
                return new C1459920o5u(c19gs, videoEditContainerScene3.LLJZIJLIL, new AwS566S0100000_22(videoEditContainerScene3, 295));
            }
        });
        c1drf.LJFF(String.class, "sessionId", new AvS540S0100000_8((VideoEditContainerScene) awS40S0310000_22.l0, 23));
        c1drf.LJFF(C1420050n3b.class, null, new AvS181S0000000_22(9));
        if (C290850Bad.LIZ()) {
            c1drf.LJFF(ScopeKey.class, null, new AvS541S0100000_22((VideoEditContainerScene) awS40S0310000_22.l0, 22));
            c1drf.LJFF(C2216441Bow.class, null, new AvS541S0100000_22((VideoEditContainerScene) awS40S0310000_22.l0, 23));
            c1drf.LJFF(C1456610o0Z.class, null, new AvS181S0000000_22(10));
        }
        c1drf.LJFF(C1456190nzt.class, null, new AvS541S0100000_22((C1456190nzt) awS40S0310000_22.l2, 24));
        c1drf.LJFF(C1456770o0p.class, null, new AvS181S0000000_22(11));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S0310000_22 awS40S0310000_22, Object obj) {
        C1442270ndR c1442270ndR = (C1442270ndR) obj;
        c1442270ndR.LIZ(C1442280ndS.LIZ(new AwS35S0010000_22(awS40S0310000_22.z3, 19)), "prepare_source");
        c1442270ndR.LIZ(C1442280ndS.LIZ(new AwS73S0210000_22((VideoPublishEditModel) awS40S0310000_22.l0, (InterfaceC1444130ngR) awS40S0310000_22.l1, awS40S0310000_22.z3, 0)), "render");
        c1442270ndR.LIZ(C1442280ndS.LIZ(new AwS601S0100000_22((C1442190ndJ) awS40S0310000_22.l2, 235)), "compile");
        c1442270ndR.LIZ(C1442280ndS.LIZ(new AwS601S0100000_22((C1442190ndJ) awS40S0310000_22.l2, 236)), "save");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS40S0310000_22 awS40S0310000_22, Object obj) {
        ((C1442270ndR) obj).LIZ(C1442280ndS.LIZ(new AwS40S0310000_22(awS40S0310000_22.z3, (VideoPublishEditModel) awS40S0310000_22.l0, (InterfaceC1444130ngR) awS40S0310000_22.l1, (C1442190ndJ) awS40S0310000_22.l2, 1)), "output");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS40S0310000_22 awS40S0310000_22, Object obj) {
        String str;
        List list;
        PovModel povModel;
        String selectPovText;
        C1421230n5V c1421230n5V = (C1421230n5V) obj;
        C1421350n5h c1421350n5h = (C1421350n5h) awS40S0310000_22.l0;
        String str2 = "";
        if (c1421350n5h == null || (str = c1421350n5h.LIZJ) == null) {
            str = "";
        }
        if (awS40S0310000_22.z3 && (selectPovText = ((TextStickerModel) awS40S0310000_22.l1).getCompatModel().getSelectPovText()) != null) {
            str2 = selectPovText;
        }
        if (!awS40S0310000_22.z3 || (povModel = ((C1421330n5f) awS40S0310000_22.l2).LJJJLIIL().creativeModel.povModel) == null || (list = povModel.povList) == null) {
            list = C13BV.INSTANCE;
        }
        return C1421230n5V.LIZ(c1421230n5V, true, new C375830EoP(new C1421200n5S(str, str2, list, awS40S0310000_22.z3, true)), null, null, 12);
    }

    public static final Object invoke$4(AwS40S0310000_22 awS40S0310000_22, Object obj) {
        C0GX9 c0gx9;
        int i;
        int i2;
        MotionEvent motionEvent = (MotionEvent) obj;
        if (((C2248481CzW) awS40S0310000_22.l0).LLLLIL().LJI.invoke((EnumC1461710o8n) awS40S0310000_22.l1).booleanValue() && awS40S0310000_22.z3 && (c0gx9 = (C0GX9) awS40S0310000_22.l2) != null && c0gx9.isEnabled()) {
            if (motionEvent.getAction() == 0) {
                C2248481CzW c2248481CzW = (C2248481CzW) awS40S0310000_22.l0;
                EnumC1461710o8n enumC1461710o8n = (EnumC1461710o8n) awS40S0310000_22.l1;
                c2248481CzW.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showDialogWhenHasKeyFrames _type=");
                sbLIZ.append(enumC1461710o8n);
                C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (c2248481CzW.LLLLIL().LJII.invoke(EnumC1461520o8U.SHOW_CUT_PRO).booleanValue()) {
                    i = 2131836291;
                    i2 = 2131836289;
                } else {
                    i = 2131836288;
                    i2 = R.string.epx;
                }
                if (c2248481CzW.LLJLL == null) {
                    C1397580mTM c1397580mTM = new C1397580mTM(c2248481CzW.requireActivity());
                    c1397580mTM.LIZ(i);
                    c1397580mTM.LJII = false;
                    C985403tE.LIZ(c1397580mTM, new AwS105S0201000_22(i2, c2248481CzW, enumC1461710o8n, 9));
                    c2248481CzW.LLJLL = new C1397510mTF(c1397580mTM);
                }
                C1397510mTF c1397510mTF = c2248481CzW.LLJLL;
                if (c1397510mTF == null || !c1397510mTF.LJIIIZ()) {
                    c2248481CzW.LLLLIL().LJFF.invoke(Boolean.FALSE);
                    C1397510mTF c1397510mTF2 = c2248481CzW.LLJLL;
                    if (c1397510mTF2 != null) {
                        c1397510mTF2.LIZLLL();
                    }
                    c2248481CzW.LLLLIL().LJIIIZ.invoke(Boolean.TRUE);
                }
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0310000_22(C2248481CzW c2248481CzW, EnumC1461710o8n enumC1461710o8n, C0GX9 c0gx9, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2248481CzW;
        this.l1 = enumC1461710o8n;
        this.z3 = true;
        this.l2 = c0gx9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0310000_22(C1421350n5h c1421350n5h, boolean z, TextStickerModel textStickerModel, C1421330n5f c1421330n5f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1421350n5h;
        this.z3 = z;
        this.l1 = textStickerModel;
        this.l2 = c1421330n5f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0310000_22(VideoEditContainerScene videoEditContainerScene, boolean z, InterfaceC1444130ngR interfaceC1444130ngR, C1456190nzt c1456190nzt, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoEditContainerScene;
        this.z3 = z;
        this.l1 = interfaceC1444130ngR;
        this.l2 = c1456190nzt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0310000_22(boolean z, VideoPublishEditModel videoPublishEditModel, AbstractC1437870nWL abstractC1437870nWL, C1442190ndJ c1442190ndJ, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = videoPublishEditModel;
        this.l1 = abstractC1437870nWL;
        this.l2 = c1442190ndJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0310000_22(boolean z, VideoPublishEditModel videoPublishEditModel, InterfaceC1444130ngR interfaceC1444130ngR, C1442190ndJ c1442190ndJ, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = videoPublishEditModel;
        this.l1 = interfaceC1444130ngR;
        this.l2 = c1442190ndJ;
    }
}
