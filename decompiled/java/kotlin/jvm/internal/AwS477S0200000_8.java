package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C0C64;
import X.C0CHQ;
import X.C0E48;
import X.C0E6P;
import X.C0LAB;
import X.C0LD1;
import X.C0M2T;
import X.C0M7M;
import X.C0MV0;
import X.C0MZ9;
import X.C123100dR;
import X.C141Q;
import X.C1431870nMf;
import X.C1436250nTj;
import X.C1443550nfV;
import X.C15O7;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C289370BVv;
import X.C365890EWd;
import X.C389010FNb;
import X.C545640Lac;
import X.C554970Lpf;
import X.C557270LtN;
import X.C570560MZi;
import X.C804770Vhb;
import X.C879460Yem;
import X.InterfaceC1631620sYq;
import X.InterfaceC1662290tMJ;
import X.InterfaceC20236714Gf;
import Y.ACallableS176S0300000_8;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public class AwS477S0200000_8 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS477S0200000_8(C0E6P c0e6p, C0E48 c0e48, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0e6p;
        this.l1 = c0e48;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS477S0200000_8(C0MV0 c0mv0, Activity activity, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0mv0;
        this.l1 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS477S0200000_8(C1443550nfV c1443550nfV, VideoPublishEditModel videoPublishEditModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1443550nfV;
        this.l1 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS477S0200000_8(C2252611DEt c2252611DEt, C389010FNb c389010FNb, int i) {
        super(3);
        this.$t = i;
        this.l0 = c2252611DEt;
        this.l1 = c389010FNb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS477S0200000_8(SocialMediaPickerViewModel socialMediaPickerViewModel, SocialMediaPickerViewModel socialMediaPickerViewModel2, C05P0<Boolean> c05p0) {
        super(3);
        this.$t = c05p0;
        this.l0 = socialMediaPickerViewModel;
        this.l1 = socialMediaPickerViewModel2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS477S0200000_8 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r7 = r10
            r6 = r9
            X.0ty9 r6 = (X.InterfaceC1685750ty9) r6
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r11 = (java.lang.Number) r11
            int r3 = r11.intValue()
            r0 = r3 & 6
            if (r0 != 0) goto L18
            boolean r0 = r7.LJJIIJ(r6)
            if (r0 == 0) goto L6b
            r0 = 4
        L17:
            r3 = r3 | r0
        L18:
            r1 = r3 & 19
            r0 = 18
            if (r1 != r0) goto L2a
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L2a
            r7.LIZJ()
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            java.lang.Object r4 = r8.l0
            com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r4 = (com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel) r4
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r7.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r0 = (com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel) r0
            boolean r0 = r7.LJII(r0)
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r2 = (com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel) r2
            java.lang.Object r1 = r8.l1
            X.05P0 r1 = (X.C05P0) r1
            java.lang.Object r5 = r7.LJJ()
            if (r0 != 0) goto L53
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r5 != r0) goto L5d
        L53:
            kotlin.jvm.internal.AwS409S0200000_8 r5 = new kotlin.jvm.internal.AwS409S0200000_8
            r0 = 64
            r5.<init>(r2, r1, r0)
            r7.LJJIJIIJI(r5)
        L5d:
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r7.LJ()
            int r0 = r3 << 6
            r8 = r0 & 896(0x380, float:1.256E-42)
            r9 = 0
            X.C1666500tT6.LIZ(r4, r5, r6, r7, r8, r9)
            goto L27
        L6b:
            r0 = 2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS477S0200000_8.invoke$0(kotlin.jvm.internal.AwS477S0200000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS477S0200000_8 awS477S0200000_8, Object obj, Object obj2, Object obj3) {
        Bundle bundleLIZ;
        boolean z;
        ((Boolean) obj).booleanValue();
        ((C1443550nfV) awS477S0200000_8.l0).LIZJ.invoke();
        C1443550nfV c1443550nfV = (C1443550nfV) awS477S0200000_8.l0;
        C19EG c19eg = c1443550nfV.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS477S0200000_8.l1;
        if (c1443550nfV.LIZIZ) {
            bundleLIZ = C1436250nTj.LIZIZ(videoPublishEditModel);
        } else {
            bundleLIZ = C1436250nTj.LIZ(videoPublishEditModel, false);
            TTStoryUploadModel ttStoryUploadModel = videoPublishEditModel.getTtStoryUploadModel();
            if (ttStoryUploadModel != null) {
                ttStoryUploadModel.setStartPublishTime(System.currentTimeMillis());
            }
        }
        bundleLIZ.putBoolean("directly_publish_only", true);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().startPublish(c19eg, bundleLIZ);
        C1431870nMf c1431870nMfLJJJLL = C0CHQ.LIZ().getPublishService().LJJJLL();
        if (videoPublishEditModel.getTtStoryUploadModel() != null) {
            z = true;
        } else {
            z = false;
        }
        C557270LtN.LIZ(c1431870nMfLJJJLL, c19eg, videoPublishEditModel, -1, z, false, null, null, null, 240);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS477S0200000_8 awS477S0200000_8, Object obj, Object obj2, Object obj3) {
        String musicId;
        Integer num;
        int i;
        RuntimeException runtimeException;
        String strLIZIZ;
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        Integer numValueOf;
        String resolvedUrlKey;
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        String str = (String) obj3;
        if (((InterfaceC20236714Gf) awS477S0200000_8.l0).isActive()) {
            if (!zBooleanValue2) {
                AVMusic aVMusic = ((C389010FNb) awS477S0200000_8.l1).LIZ.LJ.LJ;
                if (aVMusic != null && aVMusic.isPgc()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                C554970Lpf c554970Lpf = ((C389010FNb) awS477S0200000_8.l1).LIZ;
                AwemeDraft awemeDraft = c554970Lpf.LIZLLL;
                IDraftListener iDraftListener = c554970Lpf.LJFF;
                C570560MZi.LIZ(awemeDraft);
                o.LJIL.LJI().LIZIZ().LJFF(new C545640Lac(awemeDraft, new C0M2T("DraftEditHelper", 2)));
                if (iDraftListener != null) {
                    iDraftListener.onUpdated(new IDraftListener.UpdateParams(awemeDraft, false));
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", "enter_personal_homepage");
                c0lab.LJ("creation_id", awemeDraft.LIZ());
                c0lab.LJ("user_id", o.LJIIZILJ.getCurrentUser().getUid());
                c0lab.LIZ(i2, "delete_cause");
                C20684815ws.LJIILLIIL("delete_draft_unavailable_sound", c0lab.LIZ);
                C570560MZi.LIZ(((C389010FNb) awS477S0200000_8.l1).LIZ.LJ);
                ((Keva) C879460Yem.LIZIZ.getValue()).storeBoolean(((C389010FNb) awS477S0200000_8.l1).LIZ.LJ.LIZ(), false);
            }
            if (C289370BVv.LIZ() && zBooleanValue) {
                C141Q c141q = C141Q.LIZ;
                String str2 = ((C389010FNb) awS477S0200000_8.l1).LIZ.LJ.LJII;
                c141q.getClass();
                if (C141Q.LJII(str2)) {
                    IMusicExternalService iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null);
                    if (iMusicExternalService != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null) {
                        AwemeDraft awemeDraft2 = ((C389010FNb) awS477S0200000_8.l1).LIZ.LJ;
                        String str3 = awemeDraft2.LJII;
                        AVMusic aVMusic2 = awemeDraft2.LJ;
                        if (aVMusic2 != null) {
                            numValueOf = Integer.valueOf(aVMusic2.musicType);
                        } else {
                            numValueOf = null;
                        }
                        AwemeDraft awemeDraft3 = ((C389010FNb) awS477S0200000_8.l1).LIZ.LJ;
                        String str4 = awemeDraft3.LJJJJIZL.shootWay;
                        String strLIZJ = C0MZ9.LIZJ(awemeDraft3);
                        AwemeDraft awemeDraft4 = ((C389010FNb) awS477S0200000_8.l1).LIZ.LJ;
                        int i3 = awemeDraft4.LJJJJIZL.recordMode;
                        AVMusic aVMusic3 = awemeDraft4.LJ;
                        if (aVMusic3 != null) {
                            resolvedUrlKey = aVMusic3.getResolvedUrlKey(awemeDraft4.LJII);
                        } else {
                            resolvedUrlKey = null;
                        }
                        strLIZIZ = interfaceC1662290tMJLIZJ.LIZIZ(str3, i3, "draft_restore", str4, numValueOf, strLIZJ, "", resolvedUrlKey);
                    } else {
                        strLIZIZ = null;
                    }
                    if (C123100dR.LIZ(strLIZIZ)) {
                        ((C389010FNb) awS477S0200000_8.l1).LIZ.LJ.LJII = strLIZIZ;
                    }
                }
            }
            AVMusic aVMusic4 = ((C389010FNb) awS477S0200000_8.l1).LIZ.LJ.LJ;
            if (aVMusic4 != null) {
                musicId = aVMusic4.getMusicId();
            } else {
                musicId = null;
            }
            ((Keva) C879460Yem.LIZJ.getValue()).storeBoolean(musicId, true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            ((C389010FNb) awS477S0200000_8.l1).getClass();
            sbLIZ.append("DraftMusicRestoreHandler");
            sbLIZ.append(" ; restore done ... ; isMusicLegal : ");
            sbLIZ.append(zBooleanValue2);
            sbLIZ.append(" ; errorMsg : ");
            sbLIZ.append(str);
            C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS477S0200000_8.l0;
            DraftFileRestoreResult[] draftFileRestoreResultArr = new DraftFileRestoreResult[1];
            C389010FNb c389010FNb = (C389010FNb) awS477S0200000_8.l1;
            if (!zBooleanValue2) {
                num = 2131832451;
            } else {
                num = null;
            }
            boolean z = !zBooleanValue;
            if (zBooleanValue2) {
                i = 0;
            } else {
                i = -3000;
            }
            if (str != null && str.length() != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                ((C389010FNb) awS477S0200000_8.l1).getClass();
                sbLIZ2.append("DraftMusicRestoreHandler");
                sbLIZ2.append(" ; restoreFailed , ");
                sbLIZ2.append(str);
                runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                runtimeException = null;
            }
            DraftFileRestoreException draftFileRestoreException = new DraftFileRestoreException(i, runtimeException, "Music");
            c389010FNb.getClass();
            draftFileRestoreResultArr[0] = C365890EWd.LIZ(c389010FNb, num, z, draftFileRestoreException);
            ArrayList arrayListLJ = C1697810uHb.LJ(draftFileRestoreResultArr);
            C189200o6.m2constructorimpl(arrayListLJ);
            interfaceC20236714Gf.resumeWith(arrayListLJ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS477S0200000_8 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L91
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L8f
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS52S0001000_8 r4 = new kotlin.jvm.internal.AwS52S0001000_8
            r0 = 8
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L57:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 1
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r7 = 0
            r8 = 0
            r0 = 2131834178(0x7f113542, float:1.9301459E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r15)
            kotlin.jvm.internal.AwS286S0300000_8 r3 = new kotlin.jvm.internal.AwS286S0300000_8
            r0 = r16
            java.lang.Object r2 = r0.l0
            X.0E6P r2 = (X.C0E6P) r2
            java.lang.Object r1 = r0.l1
            X.0E48 r1 = (X.C0E48) r1
            r0 = 10
            r3.<init>(r2, r1, r4, r0)
            r0 = -119367710(0xfffffffff8e297e2, float:-3.6766864E34)
            X.12De r13 = X.C13Z4.LIZJ(r0, r3, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L8f:
            r0 = 0
            goto L3e
        L91:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS477S0200000_8.invoke$3(kotlin.jvm.internal.AwS477S0200000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS477S0200000_8 awS477S0200000_8, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Function0<Unit> function0 = (Function0) obj3;
        C0MV0 c0mv0 = (C0MV0) awS477S0200000_8.l0;
        Activity activity = (Activity) awS477S0200000_8.l1;
        c0mv0.getClass();
        if (!zBooleanValue) {
            if (!C0LD1.LIZIZ()) {
                if ((!o.LJIIZILJ.isLogin() || C804770Vhb.LIZ.LIZ(activity)) && !C0C64.LJIILLIIL().LJIIIZ(31744, "restore_mock_save_draft", true, false)) {
                    c0mv0.LJIILLIIL(activity, function0);
                } else {
                    C15O7.LIZJ(new ACallableS176S0300000_8(c0mv0, activity, function0, 8));
                }
            } else if (C0LD1.LIZ() != 1 && C0LD1.LIZ() != 2) {
                c0mv0.LJIILLIIL(activity, function0);
            } else {
                C15O7.LIZJ(new ACallableS176S0300000_8(c0mv0, activity, function0, 9));
            }
        }
        return Unit.LIZ;
    }
}
