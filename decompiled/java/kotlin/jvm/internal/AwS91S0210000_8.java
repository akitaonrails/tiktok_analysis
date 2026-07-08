package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C0M18;
import X.C0M7N;
import X.C0M81;
import X.C0MAY;
import X.C0MJM;
import X.C0WZX;
import X.C123100dR;
import X.C1390380mHk;
import X.C1443030nef;
import X.C1446160nji;
import X.C1450070nq1;
import X.C1452150ntN;
import X.C1624570sNT;
import X.C1627370sRz;
import X.C1688680u2s;
import X.C1701330uNH;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C523930Kgh;
import X.C537520L6g;
import X.C564020MAe;
import X.C564920MDq;
import X.C571420Mb6;
import X.C571430Mb7;
import X.C571450Mb9;
import X.InterfaceC1446740nke;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS91S0210000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS91S0210000_8 awS91S0210000_8) {
        C0M18 c0m18 = C0M18.LIZ;
        C19EG c19eg = (C19EG) awS91S0210000_8.l0;
        C571420Mb6 c571420Mb6 = (C571420Mb6) awS91S0210000_8.l1;
        String str = c571420Mb6.LIZ;
        String str2 = c571420Mb6.LIZIZ;
        int i = c571420Mb6.LIZJ;
        String str3 = c571420Mb6.LIZLLL;
        String str4 = c571420Mb6.LJ;
        boolean z = c571420Mb6.LJI;
        AVMusic aVMusic = c571420Mb6.LJII;
        String str5 = c571420Mb6.LJIIIIZZ;
        String str6 = c571420Mb6.LJIIIZ;
        boolean z2 = awS91S0210000_8.z2;
        String str7 = c571420Mb6.LJFF;
        c0m18.getClass();
        String str8 = null;
        CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        ArrayList<String> arrayListLIZIZ = C1624570sNT.LIZIZ(str3);
        if (C123100dR.LIZ(str3) && C123100dR.LIZ(str)) {
            str8 = "music_and_effect";
        } else if (C123100dR.LIZ(str3)) {
            str8 = "effect";
        } else if (C123100dR.LIZ(str)) {
            str8 = "music";
        }
        C0MJM.LIZLLL(creativeInfo.getCreationId(), str, str6, str8, str4, str7, arrayListLIZIZ);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toVideoActivity() called with: context = [ ], path = [");
        sbLIZ.append(str2);
        sbLIZ.append("], musicStart = [");
        sbLIZ.append(i);
        sbLIZ.append(']');
        C571450Mb9.LIZIZ(C571430Mb7.LL, c0may, C2188811AlT.LIZIZ(sbLIZ));
        Intent intent = new Intent();
        intent.putExtra("path", str2);
        intent.putExtra("music_start", i);
        intent.putExtra("draft_music_legal", z);
        intent.putExtra("record_from", 1);
        intent.putExtra("translation_type", 3);
        intent.putExtra("extra_draft_again_type", str8);
        if (C123100dR.LIZ(str3)) {
            intent.putExtra("extra_draft_again_prop_selected_from", "draft_again");
            intent.putStringArrayListExtra("reuse_sticker_ids", C1624570sNT.LIZIZ(str3));
            intent.putExtra("sticker_id", str3);
        }
        if (C123100dR.LIZ(str4)) {
            intent.putExtra("extra_draft_again_prop_resource_id", str4);
            intent.putExtra("prop_resource_id", str4);
        }
        if (z2) {
            intent.putExtra("shoot_way", "sub_only_video_page");
        } else {
            intent.putExtra("shoot_way", "draft_again");
            intent.putExtra("enter_from", "draft_page");
        }
        C537520L6g.LIZLLL(intent, creativeInfo);
        intent.putExtra("extra_sticker_from", "draft");
        if (aVMusic != null) {
            intent.putExtra("aweme_music", aVMusic);
        }
        if (str5 != null) {
            intent.putExtra("music_origin", str5);
        }
        C1443030nef.LJII().LJIIIZ();
        if (C564020MAe.LIZIZ(intent, false, false)) {
            intent.setClass(c19eg, VideoRecordPermissionActivity.class);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, c19eg);
            C2204961BRm.LJIILLIIL(c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJbX5xzzpMu08JWK/lZYZ6URxjhUlddWtqUi5+ZxwoPc=", null));
        } else {
            C1688680u2s.LJIJJ(c19eg, intent);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS91S0210000_8 awS91S0210000_8) {
        ChooseMediaViewModel chooseMediaViewModel;
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) awS91S0210000_8.l0;
        if (!mvChoosePhotoScene.allTabMergeTimeoutActionCanceled && (chooseMediaViewModel = mvChoosePhotoScene.chooseMediaViewModel) != null) {
            chooseMediaViewModel.AR2(new ArrayList(((C523930Kgh) awS91S0210000_8.l1).LIZ()), awS91S0210000_8.z2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS91S0210000_8 awS91S0210000_8) {
        ((C564920MDq) awS91S0210000_8.l0).getEditModel().getAILivePhotoModel().LJIILLIIL(AFwS239S0000000_8.get$arr$(172));
        if (awS91S0210000_8.z2) {
            ((C564920MDq) awS91S0210000_8.l0).W1().h6(new AwS552S0100000_8((Function0) awS91S0210000_8.l1, (Function0<Unit>) 518));
        } else {
            ((Function0) awS91S0210000_8.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS91S0210000_8 awS91S0210000_8) {
        if (awS91S0210000_8.z2) {
            ((Function0) awS91S0210000_8.l0).invoke();
        } else {
            C1452150ntN.LIZLLL();
            C0M7N c0m7n = (C0M7N) awS91S0210000_8.l1;
            c0m7n.getClass();
            if (C0CHQ.LIZ().LJJJJJ().shouldDisable10MinDraftRecord(c0m7n.LIZJ)) {
                C19GS c19gs = c0m7n.LJIIL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131824731);
                C1390380mHk.LIZ(c19gs, 1047, creativeToastBuilder);
            } else {
                C1446160nji.LIZLLL(c0m7n.LIZJ);
                InterfaceC1446740nke interfaceC1446740nke = c0m7n.LJ;
                if (interfaceC1446740nke != null) {
                    interfaceC1446740nke.vK2();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS91S0210000_8 awS91S0210000_8) {
        ((C0M81) awS91S0210000_8.l0).LJFF(2131846551, awS91S0210000_8.z2);
        C0M81 c0m81 = (C0M81) awS91S0210000_8.l0;
        c0m81.LJI(false, false, true, "clickPopupFromEdit", new AwS409S0200000_8(c0m81, (C0M81) awS91S0210000_8.l1, (Function0<Unit>) 88), AFwS194S0000000_8.get$arr$(288));
        return Boolean.TRUE;
    }

    public static final Object invoke$5(AwS91S0210000_8 awS91S0210000_8) {
        C19GS c19gs;
        ((CreativeLoadingDialog) awS91S0210000_8.l0).dismiss();
        if (awS91S0210000_8.z2 && (c19gs = ((C0M7N) awS91S0210000_8.l1).LJIIL) != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829845);
            creativeToastBuilder.acrossActivities(true);
            C1390380mHk.LIZ(c19gs, 1007, creativeToastBuilder);
        }
        C0M7N.LJ((C0M7N) awS91S0210000_8.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS91S0210000_8 awS91S0210000_8) {
        C19GS c19gs;
        ((CreativeLoadingDialog) awS91S0210000_8.l0).dismiss();
        if (awS91S0210000_8.z2 && (c19gs = ((C0M7N) awS91S0210000_8.l1).LJIIL) != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829844);
            creativeToastBuilder.acrossActivities(true);
            C1390380mHk.LIZ(c19gs, 1008, creativeToastBuilder);
        }
        C0M7N.LJ((C0M7N) awS91S0210000_8.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS91S0210000_8 awS91S0210000_8) {
        Integer numValueOf;
        List<SingleImageData> imageList;
        ((C0M81) awS91S0210000_8.l0).LJFF(2131846553, awS91S0210000_8.z2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pop dialog save draft creationId = ");
        sbLIZ.append(((C0M81) awS91S0210000_8.l0).LIZJ.getCreationId());
        sbLIZ.append(" imageList = ");
        ImageAlbumData imageAlbumData = ((C0M81) awS91S0210000_8.l0).LIZJ.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            numValueOf = Integer.valueOf(imageList.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1450070nq1.LJII(C2188811AlT.LIZIZ(sbLIZ));
        ((Function0) awS91S0210000_8.l1).invoke();
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS91S0210000_8 r2) {
        /*
            boolean r0 = r2.z2
            if (r0 != 0) goto L23
            X.0njf r1 = X.C1446130njf.LIZ
            java.lang.Object r0 = r2.l0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            r1.getClass()
            boolean r0 = X.C1446130njf.LJIIL(r0)
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.l1
            X.0sRz r0 = (X.C1627370sRz) r0
            X.0noG r1 = r0.LIZJ
            X.0noG r0 = X.EnumC1448980noG.RECOVER
            if (r1 != r0) goto L23
            r0 = 1
        L1e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L23:
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS91S0210000_8.invoke$8(kotlin.jvm.internal.AwS91S0210000_8):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0210000_8(C0M81 c0m81, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0m81;
        this.z2 = false;
        this.l1 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS91S0210000_8(C0M81 c0m81, C0M81 c0m812, boolean z, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c0m81;
        this.z2 = c0m812;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS91S0210000_8(C564920MDq c564920MDq, C564920MDq c564920MDq2, boolean z, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c564920MDq;
        this.z2 = c564920MDq2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0210000_8(C19EG c19eg, C571420Mb6 c571420Mb6, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = c571420Mb6;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0210000_8(MvChoosePhotoScene mvChoosePhotoScene, C523930Kgh c523930Kgh, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = mvChoosePhotoScene;
        this.l1 = c523930Kgh;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0210000_8(CreativeDialogWrapper creativeDialogWrapper, boolean z, C0M7N c0m7n, int i) {
        super(0);
        this.$t = i;
        this.l0 = creativeDialogWrapper;
        this.z2 = z;
        this.l1 = c0m7n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S0210000_8(boolean z, Effect effect, C1627370sRz c1627370sRz, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = effect;
        this.l1 = c1627370sRz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS91S0210000_8(boolean z, boolean z2, Function0<Unit> function0, C0M7N c0m7n) {
        super(0);
        this.$t = c0m7n;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = function0;
    }
}
