package kotlin.jvm.internal;

import X.AbstractC1672070tc5;
import X.C01GW;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C0MBB;
import X.C0MXE;
import X.C0O6P;
import X.C0SC0;
import X.C1175204ik;
import X.C1212040he6;
import X.C1214550hi9;
import X.C1296880jqw;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C13BV;
import X.C13D2;
import X.C13FE;
import X.C13LP;
import X.C13Z4;
import X.C13ZT;
import X.C15438062q;
import X.C1658670tGT;
import X.C1661930tLj;
import X.C1665740tRs;
import X.C1665750tRt;
import X.C1665790tRx;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1668060tVc;
import X.C1668880tWw;
import X.C1668930tX1;
import X.C1669050tXD;
import X.C1669240tXW;
import X.C1669250tXX;
import X.C1669430tXp;
import X.C1669440tXq;
import X.C1669660tYC;
import X.C1670400tZO;
import X.C1670540tZc;
import X.C1671550tbF;
import X.C1672090tc7;
import X.C1672100tc8;
import X.C1672540tcq;
import X.C1672550tcr;
import X.C1673210tdv;
import X.C1673800tes;
import X.C1673850tex;
import X.C1673880tf0;
import X.C1675660ths;
import X.C1675980tiO;
import X.C1679570toB;
import X.C1679620toG;
import X.C1679630toH;
import X.C1679780toW;
import X.C1679860toe;
import X.C1679930tol;
import X.C1679960too;
import X.C1680030tov;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1682380tsi;
import X.C1682520tsw;
import X.C1683840tv4;
import X.C1683850tv5;
import X.C1685190txF;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1685850tyJ;
import X.C1686700tzg;
import X.C1687630u1B;
import X.C1687980u1k;
import X.C1688120u1y;
import X.C1688130u1z;
import X.C1690490u5n;
import X.C1690740u6C;
import X.C1691080u6k;
import X.C1696870uG5;
import X.C19311910gv;
import X.C196925122x;
import X.C19719212De;
import X.C20028913Yh;
import X.C20037613ag;
import X.C20043513bd;
import X.C20055113dV;
import X.C20088213iq;
import X.C2018407vS;
import X.C20700915zT;
import X.C2188811AlT;
import X.C23250099c;
import X.C291001Au;
import X.C452501pT;
import X.C497820Jfg;
import X.C559050LwF;
import X.C616500OGa;
import X.C634380OuS;
import X.C786410Ut5;
import X.C817403Hg;
import X.EnumC1671200tag;
import X.EnumC1673820teu;
import X.EnumC1675160th4;
import X.EnumC1679580toC;
import X.InterfaceC1631620sYq;
import X.InterfaceC1661910tLh;
import X.InterfaceC1665500tRU;
import X.InterfaceC1668050tVb;
import X.InterfaceC1668850tWt;
import X.InterfaceC1670310tZF;
import X.InterfaceC1672350tcX;
import X.InterfaceC1672520tco;
import X.InterfaceC1676320tiw;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1690350u5Z;
import X.InterfaceC1690470u5l;
import X.InterfaceC1690500u5o;
import X.InterfaceC196910122i;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import X.InterfaceC20090813jG;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.chooseaccount.AuthorizedOrgAccountInfo;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment;
import com.ss.android.ugc.aweme.account.passwordless.leaked.LeakedGoPasswordlessActivity;
import com.ss.android.ugc.aweme.activity.MoreInfoActivity;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionCell;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationFragment;
import com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsViewModel;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.WaitingAssem;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.social.creation.edit.component.toolbar.StoryEditToolbarComponent;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem;
import com.ss.android.ugc.gamora.recorder.ttsreuse.d;
import com.ss.android.ugc.trill.feedback.CSPFragment;
import com.ss.android.ugc.trill.feedback.FaqDetailFragment;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPageV2;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AwS460S0200000_25 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final List<String> LIZ$0(C05P0<List<String>> c05p0) {
        return c05p0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(C817403Hg c817403Hg, C1690740u6C c1690740u6C, int i) {
        super(2);
        this.$t = i;
        this.l0 = c817403Hg;
        this.l1 = c1690740u6C;
    }

    public static final Object invoke$0(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        if (((C291001Au) obj2).LIZ() != null) {
            TakoAIVideoInputAssem takoAIVideoInputAssem = (TakoAIVideoInputAssem) awS460S0200000_25.l0;
            View view = (View) awS460S0200000_25.l1;
            if (takoAIVideoInputAssem.cp().getState().LLILLJJLI == EnumC1679580toC.VOICE) {
                takoAIVideoInputAssem.cp().vQ2();
                C1212040he6.LIZIZ(2131822564, view);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS460S0200000_25 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            X.0tpg r8 = (X.InterfaceC1680500tpg) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r0 = r9.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L19
            boolean r0 = r8.LIZ()
            if (r0 == 0) goto L19
            r8.LIZJ()
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            java.lang.Object r3 = r7.l0
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r0 = r7.l1
            X.0toW r0 = (X.C1679780toW) r0
            X.0tiw r0 = r0.LLILZ
            X.13FG r0 = (X.C13FG) r0
            int r4 = r0.LIZLLL()
            java.lang.Object r0 = r7.l1
            X.0toW r0 = (X.C1679780toW) r0
            X.05P0<java.lang.Float> r0 = r0.LLILZIL
            X.13FE r0 = (X.C13FE) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r5 = r0.floatValue()
            r2 = 5004770(0x4c5de2, float:7.013177E-39)
            r8.LJJIIJZLJL(r2)
            java.lang.Object r0 = r7.l1
            X.0toW r0 = (X.C1679780toW) r0
            boolean r0 = r8.LJII(r0)
            java.lang.Object r1 = r7.l1
            X.0toW r1 = (X.C1679780toW) r1
            java.lang.Object r6 = r8.LJJ()
            if (r0 != 0) goto L5c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L66
        L5c:
            kotlin.jvm.internal.AwS565S0100000_21 r6 = new kotlin.jvm.internal.AwS565S0100000_21
            r0 = 30
            r6.<init>(r1, r0)
            r8.LJJIJIIJI(r6)
        L66:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r8.LJ()
            r8.LJJIIJZLJL(r2)
            java.lang.Object r0 = r7.l1
            X.0toW r0 = (X.C1679780toW) r0
            boolean r0 = r8.LJII(r0)
            java.lang.Object r1 = r7.l1
            X.0toW r1 = (X.C1679780toW) r1
            java.lang.Object r7 = r8.LJJ()
            if (r0 != 0) goto L89
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L93
        L89:
            kotlin.jvm.internal.AwS565S0100000_21 r7 = new kotlin.jvm.internal.AwS565S0100000_21
            r0 = 31
            r7.<init>(r1, r0)
            r8.LJJIJIIJI(r7)
        L93:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r8.LJ()
            r9 = 0
            X.C1667340tUS.LIZIZ(r3, r4, r5, r6, r7, r8, r9)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$1(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS460S0200000_25 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$10(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        EnumC1673820teu enumC1673820teu;
        if (((Boolean) obj).booleanValue()) {
            ((FollowCreatorsViewModel) awS460S0200000_25.l0).getClass();
        } else {
            FollowCreatorsViewModel followCreatorsViewModel = (FollowCreatorsViewModel) awS460S0200000_25.l0;
            C1673800tes c1673800tes = (C1673800tes) awS460S0200000_25.l1;
            followCreatorsViewModel.getClass();
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2(followCreatorsViewModel, 30));
            c1673800tes.getClass();
            C1673850tex c1673850tex = EnumC1673820teu.Companion;
            int i = c1673800tes.LJFF;
            c1673850tex.getClass();
            if (i != -1 && i != 0) {
                if (i != 1 && i != 2) {
                    if (i != 4) {
                        enumC1673820teu = EnumC1673820teu.TO_FOLLOW;
                    } else {
                        enumC1673820teu = EnumC1673820teu.REQUESTED;
                    }
                } else {
                    enumC1673820teu = EnumC1673820teu.FOLLOWING;
                }
            } else {
                enumC1673820teu = EnumC1673820teu.TO_FOLLOW;
            }
            followCreatorsViewModel.zQ2(c1673800tes, enumC1673820teu);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(followCreatorsViewModel), null, null, new C1673880tf0(followCreatorsViewModel, c1673800tes, enumC1673820teu, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((UserMatchedAssem) awS460S0200000_25.l0).ap((C1687630u1B) awS460S0200000_25.l1, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((WaitingAssem) awS460S0200000_25.l0).Lo((C1687630u1B) awS460S0200000_25.l1, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else if (((EnumC1675160th4) awS460S0200000_25.l0) == EnumC1675160th4.MATCHED_LIST && ((C1687630u1B) awS460S0200000_25.l1) != null) {
            interfaceC1680500tpg.LJJIIJZLJL(1292703548);
            C1668060tVc.LIZIZ(null, C786410Ut5.j4(C1383370m6R.LJIIJ(2131824855), Arrays.copyOf(new Object[]{Integer.valueOf(((C1687630u1B) awS460S0200000_25.l1).LL.size())}, 1)), null, null, null, null, null, null, null, interfaceC1680500tpg, 0, 509);
            interfaceC1680500tpg.LJ();
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(1292707927);
            C1668060tVc.LIZIZ(null, C1383370m6R.LJIIJ(2131824854), null, null, null, null, null, null, null, interfaceC1680500tpg, 0, 509);
            interfaceC1680500tpg.LJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        long jQ3;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else if (((C2018407vS) awS460S0200000_25.l0).LL) {
            interfaceC1680500tpg.LJJIIJZLJL(-1458154960);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJIJJ(c1685760tyA, null, 3), 0.0f, 17, 0.0f, 0.0f, 13);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            C1679960too c1679960too = C1679930tol.LJI;
            Context context = (Context) awS460S0200000_25.l1;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679960too, c1296880jqw, interfaceC1680500tpg, 54);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJIIL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
                interfaceC1680500tpg.LJJIIJZLJL(-1991065151);
                if (numLIZJ != null) {
                    jQ3 = C1685850tyJ.LIZIZ(numLIZJ.intValue());
                } else {
                    jQ3 = C1670400tZO.LIZIZ(interfaceC1680500tpg).Q3();
                }
                interfaceC1680500tpg.LJ();
                float f = 5;
                float f2 = 0;
                C1685190txF.LIZ(C0MBB.LIZIZ(2131827366, interfaceC1680500tpg), C1682520tsw.LJIIJJI(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(interfaceC1680500tpg).V2(), C1669050tXD.LIZIZ(8)), f, f2, f, f2), jQ3, null, 0L, 0, 2, false, 1, null, null, interfaceC1680500tpg, 102236160, 0, 1720);
                float f3 = 16;
                C1668930tX1.LIZIZ(C1669660tYC.LJJLIIIJILLIZJL, null, c.LJI(c.LJIILLIIL(c1685760tyA, f3), f3), C1670400tZO.LIZIZ(interfaceC1680500tpg).Q3(), f3, f3, false, interfaceC1680500tpg, 221616, 64);
                interfaceC1680500tpg.LJIIIZ();
                interfaceC1680500tpg.LJ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(-1456511371);
            C1673210tdv.LJ("", null, false, false, interfaceC1680500tpg, 6, 14);
            interfaceC1680500tpg.LJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1661910tLh interfaceC1661910tLh;
        Object obj3 = ((C1661930tLj) obj).LIZJ;
        if ((obj3 instanceof InterfaceC1661910tLh) && (interfaceC1661910tLh = (InterfaceC1661910tLh) obj3) != null) {
            interfaceC1661910tLh.LIZIZ(new AwS380S0200000_14((StoryEditToolbarComponent) awS460S0200000_25.l0, (C559050LwF) awS460S0200000_25.l1, 71));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        Object objLJJ;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1679620toG c1679620toG = C1679630toH.LIZ;
            interfaceC1680500tpg.LJJIIJZLJL(-390876339);
            if (Build.VERSION.SDK_INT >= 30) {
                interfaceC1680500tpg.LJJIIJZLJL(-940563130);
                interfaceC1680500tpg.LJJIIJZLJL(1606881511);
                InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) interfaceC1680500tpg.LJJIL(C20055113dV.LJII);
                C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(Integer.valueOf(C1683850tv5.LIZJ(interfaceC1680500tpg).LIZJ.LIZLLL(interfaceC1690500u5o)), interfaceC1680500tpg);
                C05P0 c05p0LJIIIIZZ2 = C20028913Yh.LJIIIIZZ(Integer.valueOf(C1683840tv4.LIZ(interfaceC1680500tpg).LIZLLL(interfaceC1690500u5o)), interfaceC1680500tpg);
                interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                Object objLJJ2 = interfaceC1680500tpg.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = C20028913Yh.LJ(new AwS403S0200000_2(c05p0LJIIIIZZ, (C05P0<Integer>) c05p0LJIIIIZZ2, (C05P0<Integer>) 50));
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
                }
                C05P1 c05p1 = (C05P1) objLJJ2;
                interfaceC1680500tpg.LJ();
                C05P0 c05p0LJIIIIZZ3 = C20028913Yh.LJIIIIZZ(Integer.valueOf(C1683850tv5.LIZJ(interfaceC1680500tpg).LJIILL.LIZLLL(interfaceC1690500u5o)), interfaceC1680500tpg);
                C05P0 c05p0LJIIIIZZ4 = C20028913Yh.LJIIIIZZ(Integer.valueOf(C1683850tv5.LIZJ(interfaceC1680500tpg).LJIILLIIL.LIZLLL(interfaceC1690500u5o)), interfaceC1680500tpg);
                interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                objLJJ = interfaceC1680500tpg.LJJ();
                if (objLJJ == c1680520tpi) {
                    objLJJ = new C1679620toG(c05p1, c05p0LJIIIIZZ3, c05p0LJIIIIZZ4, c05p0LJIIIIZZ2);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJ();
            } else {
                interfaceC1680500tpg.LJJIIJZLJL(-940510740);
                interfaceC1680500tpg.LJJIIJZLJL(1825905156);
                View view = (View) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LJFF);
                interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                Object objLJJ3 = interfaceC1680500tpg.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi2 = C1680510tph.LIZIZ;
                if (objLJJ3 == c1680520tpi2) {
                    objLJJ3 = C1696870uG5.LIZ(0);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
                }
                InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) objLJJ3;
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
                boolean zLJII = interfaceC1680500tpg.LJII(view);
                Object objLJJ4 = interfaceC1680500tpg.LJJ();
                if (zLJII || objLJJ4 == c1680520tpi2) {
                    objLJJ4 = new AwS391S0200000_25(view, interfaceC1676320tiw, 187);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
                }
                interfaceC1680500tpg.LJ();
                C1680540tpk.LIZIZ(view, (Function1) objLJJ4, interfaceC1680500tpg);
                C05P1 c05p1LIZJ = C1675660ths.LIZJ(interfaceC1676320tiw.LIZLLL(), C1671550tbF.LIZLLL(250, 0, null, 6), "legacyImeHeight", interfaceC1680500tpg);
                interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                objLJJ = interfaceC1680500tpg.LJJ();
                if (objLJJ == c1680520tpi2) {
                    objLJJ = new C1679620toG(c05p1LIZJ, c05p1LIZJ, c05p1LIZJ);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJ();
            }
            interfaceC1680500tpg.LJ();
            C13ZT.LIZ(C1679630toH.LIZIZ.LIZJ(objLJJ), C13Z4.LIZJ(-1361956198, new AwS460S0200000_25((TakoAIVideoInputAssem) awS460S0200000_25.l0, (C1679570toB) awS460S0200000_25.l1, 18), interfaceC1680500tpg), interfaceC1680500tpg, 56);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(kotlin.jvm.internal.AwS460S0200000_25 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r0 = r7.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L19
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L19
            r6.LIZJ()
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem r0 = (com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem) r0
            X.0SvV r0 = r0.LLJILJILJ
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = r0.getValue()
            r1 = 0
            r0 = 7
            r3 = 0
            X.05P0 r2 = X.C1244280iU6.LIZ(r2, r1, r6, r3, r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r6.LJJIIJZLJL(r0)
            boolean r0 = r6.LJJIIJ(r2)
            java.lang.Object r4 = r6.LJJ()
            if (r0 != 0) goto L43
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L51
        L43:
            kotlin.jvm.internal.AwS546S0100000_2 r1 = new kotlin.jvm.internal.AwS546S0100000_2
            r0 = 842(0x34a, float:1.18E-42)
            r1.<init>(r2, r0)
            X.13YZ r4 = X.C20028913Yh.LJ(r1)
            r6.LJJIJIIJI(r4)
        L51:
            X.05P1 r4 = (X.C05P1) r4
            r6.LJ()
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem r1 = (com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem) r1
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.No(r0, r6, r3)
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem r1 = (com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem) r1
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.Jo(r0, r6, r3)
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem r2 = (com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem) r2
            java.lang.Object r1 = r5.l1
            X.0toB r1 = (X.C1679570toB) r1
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.Lo(r1, r0, r6, r3)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$18(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS460S0200000_25 r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$19(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        long j = ((C1682380tsi) obj2).LIZ;
        return ((Function2) awS460S0200000_25.l1).invoke(new C1690490u5n((C20043513bd) awS460S0200000_25.l0, (InterfaceC1672350tcX) obj), new C1682380tsi(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AwS460S0200000_25 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r0 = r7.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L19
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L19
            r6.LIZJ()
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            java.lang.Object r4 = r5.l0
            com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem r4 = (com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem) r4
            java.lang.Object r3 = r5.l1
            X.0hi9 r3 = (X.C1214550hi9) r3
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r6.LJJIIJZLJL(r0)
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem r0 = (com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem) r0
            boolean r0 = r6.LJII(r0)
            java.lang.Object r2 = r5.l0
            com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem r2 = (com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem) r2
            java.lang.Object r1 = r6.LJJ()
            if (r0 != 0) goto L42
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L4c
        L42:
            kotlin.jvm.internal.AwS569S0100000_25 r1 = new kotlin.jvm.internal.AwS569S0100000_25
            r0 = 445(0x1bd, float:6.24E-43)
            r1.<init>(r2, r0)
            r6.LJJIJIIJI(r1)
        L4c:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r6.LJ()
            r0 = 0
            r4.Lo(r3, r1, r6, r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$20(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        ((d) awS460S0200000_25.l0).W1((TextStickerData) awS460S0200000_25.l1, ((Number) obj2).intValue());
        final C196925122x c196925122xO2 = ((d) awS460S0200000_25.l0).o2((TextStickerData) awS460S0200000_25.l1);
        ViewGroup viewGroup = ((d) awS460S0200000_25.l0).LLJILJIL;
        if (viewGroup != null) {
            viewGroup.addView(c196925122xO2);
        }
        ((d) awS460S0200000_25.l0).B3(c196925122xO2);
        final d dVar = (d) awS460S0200000_25.l0;
        c196925122xO2.setOnEditClickListener(new InterfaceC196910122i() { // from class: X.0tGS
            @Override // X.InterfaceC196910122i
            public final float LIZ(float f) {
                return 0.0f;
            }

            @Override // X.InterfaceC196910122i
            public final int LIZLLL(C196925122x c196925122x, boolean z, boolean z2) {
                return 0;
            }

            @Override // X.InterfaceC196910122i
            public final void LJ(C196925122x c196925122x, boolean z, Integer num) {
            }

            @Override // X.InterfaceC196910122i
            public final void LJFF(C196925122x c196925122x) {
            }

            @Override // X.InterfaceC196910122i
            public final void LJI(C196925122x c196925122x, C196931123d c196931123d) {
            }

            @Override // X.InterfaceC196910122i
            public final void LJII(C196925122x c196925122x) {
            }

            @Override // X.InterfaceC196910122i
            public final void LJIIIIZZ(C196925122x c196925122x) {
            }

            @Override // X.InterfaceC196910122i
            public final void LIZJ(C196925122x c196925122x) {
                ViewGroup viewGroup2 = dVar.LLJILJIL;
                if (viewGroup2 != null) {
                    C786410Ut5.LJJJLZIJ(c196925122x, viewGroup2);
                }
                ViewGroup viewGroup3 = dVar.LLJILJIL;
                if (viewGroup3 != null) {
                    C786410Ut5.LJJJLZIJ(c196925122xO2, viewGroup3);
                }
                d dVar2 = dVar;
                dVar2.LLJJIII = true;
                dVar2.hb0();
                dVar.LLJILJILJ = null;
            }

            @Override // X.InterfaceC196910122i
            public final PointF LIZIZ(C196925122x c196925122x, float f, float f2) {
                return new PointF();
            }
        });
        c196925122xO2.setMotionInterceptor(C1658670tGT.LIZ);
        C786410Ut5.L5(c196925122xO2, 0.5f);
        ((d) awS460S0200000_25.l0).LLJILJILJ = c196925122xO2;
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS460S0200000_25.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            ((CSPFragment) awS460S0200000_25.l1).aS(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$23(kotlin.jvm.internal.AwS460S0200000_25 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = r9
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L1a
            r7.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r0 = r8.l0
            X.05P1 r0 = (X.C05P1) r0
            java.lang.Object r0 = r0.getValue()
            X.0qdT r0 = (X.C1557610qdT) r0
            boolean r0 = r0.LLILZ
            if (r0 != 0) goto L17
            java.lang.Object r0 = r8.l0
            X.05P1 r0 = (X.C05P1) r0
            java.lang.Object r0 = r0.getValue()
            X.0qdT r0 = (X.C1557610qdT) r0
            int r1 = r0.LLILLL
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L17
            com.ss.android.ugc.aweme.experiment.FeedbackConfig r0 = X.C1689060u3U.LIZIZ
            boolean r0 = r0.enableTopicListSearch
            if (r0 == 0) goto L17
            X.0tWw r2 = X.C1669660tYC.LLLLL
            r3 = 0
            r4 = 0
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r7.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.trill.feedback.FaqDetailFragment r0 = (com.ss.android.ugc.trill.feedback.FaqDetailFragment) r0
            boolean r0 = r7.LJII(r0)
            java.lang.Object r1 = r8.l1
            com.ss.android.ugc.trill.feedback.FaqDetailFragment r1 = (com.ss.android.ugc.trill.feedback.FaqDetailFragment) r1
            java.lang.Object r6 = r7.LJJ()
            if (r0 != 0) goto L63
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L6d
        L63:
            kotlin.jvm.internal.AwS556S0100000_12 r6 = new kotlin.jvm.internal.AwS556S0100000_12
            r0 = 683(0x2ab, float:9.57E-43)
            r6.<init>(r1, r0)
            r7.LJJIJIIJI(r6)
        L6d:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r7.LJ()
            r9 = 14
            r5 = r3
            r8 = r4
            X.C1668060tVc.LIZLLL(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$23(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$24(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS460S0200000_25.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            ((FaqDetailFragment) awS460S0200000_25.l1).aS(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        C05P0 c05p0;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(C13BV.INSTANCE);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p02 = (C05P0) objLJJ;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            Object objLJJ2 = interfaceC1680500tpg.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(C13BV.INSTANCE);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p03 = (C05P0) objLJJ2;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            Object objLJJ3 = interfaceC1680500tpg.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(C13BV.INSTANCE);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p04 = (C05P0) objLJJ3;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            Object objLJJ4 = interfaceC1680500tpg.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C20028913Yh.LJI(5);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
            }
            C05P0 c05p05 = (C05P0) objLJJ4;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            Object objLJJ5 = interfaceC1680500tpg.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = C20028913Yh.LJI(C13BV.INSTANCE);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ5);
            }
            C05P0 c05p06 = (C05P0) objLJJ5;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII = interfaceC1680500tpg.LJII((DoNotTranslateSettingPage) awS460S0200000_25.l0);
            DoNotTranslateSettingPage doNotTranslateSettingPage = (DoNotTranslateSettingPage) awS460S0200000_25.l0;
            Object objLJJ6 = interfaceC1680500tpg.LJJ();
            if (zLJII || objLJJ6 == c1680520tpi) {
                objLJJ6 = new AwS575S0100000_31(doNotTranslateSettingPage, 1300);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ6);
            }
            interfaceC1680500tpg.LJ();
            C01GW c01gwLIZIZ = C452501pT.LIZIZ((Function0) objLJJ6);
            Unit unit = Unit.LIZ;
            interfaceC1680500tpg.LJJIIJZLJL(-1224400529);
            boolean zLJII2 = interfaceC1680500tpg.LJII((DoNotTranslateSettingPage) awS460S0200000_25.l0);
            DoNotTranslateSettingPage doNotTranslateSettingPage2 = (DoNotTranslateSettingPage) awS460S0200000_25.l0;
            Object objLJJ7 = interfaceC1680500tpg.LJJ();
            if (!zLJII2 && objLJJ7 != c1680520tpi) {
                c05p0 = c05p04;
            } else {
                c05p0 = c05p04;
                objLJJ7 = new C616500OGa(doNotTranslateSettingPage2, c05p02, c05p03, c05p06, c05p04, null);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ7);
            }
            interfaceC1680500tpg.LJ();
            C1680540tpk.LJFF(unit, (Function2) objLJJ7, interfaceC1680500tpg);
            String string = ((DoNotTranslateSettingPage) awS460S0200000_25.l0).getString(2131828785);
            String string2 = ((DoNotTranslateSettingPage) awS460S0200000_25.l0).getString(2131828824);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c.LIZIZ(c1685760tyA, 1.0f), C1670400tZO.LIZIZ(interfaceC1680500tpg).I2(), C1669430tXp.LIZ);
            DoNotTranslateSettingPage doNotTranslateSettingPage3 = (DoNotTranslateSettingPage) awS460S0200000_25.l0;
            View view = (View) awS460S0200000_25.l1;
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, interfaceC1680500tpg, 0);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1665790tRx.LIZ(c.LJI(c1685760tyA, ((InterfaceC1690500u5o) interfaceC1680500tpg.LJJIL(C20055113dV.LJII)).LJJI(C497820Jfg.LIZJ(view.getContext()))), interfaceC1680500tpg);
                C1669440tXq c1669440tXq = C1669440tXq.LIZJ;
                List<ContentLanguage> list = (List) c05p02.getValue();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (ContentLanguage contentLanguage : list) {
                    arrayList.add(new C1669250tXX(contentLanguage.getLanguageCode(), contentLanguage.getLocalName()));
                }
                List<String> listLIZ$0 = LIZ$0(c05p03);
                boolean z = !Intrinsics.LJFF(C13LP.LLIIJI((Iterable) c05p06.getValue()), C13LP.LLIIJI((Iterable) c05p03.getValue()));
                interfaceC1680500tpg.LJJIIJZLJL(5004770);
                Object objLJJ8 = interfaceC1680500tpg.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi2 = C1680510tph.LIZIZ;
                if (objLJJ8 == c1680520tpi2) {
                    objLJJ8 = new AwS597S0100000_18(c05p03, (C05P0<List<String>>) 631);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ8);
                }
                Function1 function1 = (Function1) objLJJ8;
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJJIIJZLJL(5004770);
                Object objLJJ9 = interfaceC1680500tpg.LJJ();
                if (objLJJ9 == c1680520tpi2) {
                    objLJJ9 = new AwS562S0100000_18(c05p05, (C05P0<Integer>) 2427);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ9);
                }
                Function0 function0 = (Function0) objLJJ9;
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJJIIJZLJL(-1224400529);
                boolean zLJII3 = interfaceC1680500tpg.LJII(c01gwLIZIZ) | interfaceC1680500tpg.LJII(doNotTranslateSettingPage3);
                Object objLJJ10 = interfaceC1680500tpg.LJJ();
                if (zLJII3 || objLJJ10 == c1680520tpi2) {
                    objLJJ10 = new AwS158S0400000_31(doNotTranslateSettingPage3, (DoNotTranslateSettingPage) c05p03, (C05P0<List<String>>) c01gwLIZIZ, (C01GW<C20700915zT>) c05p0, (C05P0<List<String>>) 3);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ10);
                }
                Function0 function02 = (Function0) objLJJ10;
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJJIIJZLJL(5004770);
                boolean zLJII4 = interfaceC1680500tpg.LJII(doNotTranslateSettingPage3);
                Object objLJJ11 = interfaceC1680500tpg.LJJ();
                if (zLJII4 || objLJJ11 == c1680520tpi2) {
                    objLJJ11 = new AwS569S0100000_25(doNotTranslateSettingPage3, 751);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ11);
                }
                interfaceC1680500tpg.LJ();
                C1669240tXW.LIZ(string2, string, c1669440tXq, z, null, null, arrayList, listLIZ$0, function1, function0, function02, (Function0) objLJJ11, interfaceC1680500tpg, 906166272, 0, 16);
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0250 A[LOOP:0: B:66:0x024a->B:68:0x0250, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$26(kotlin.jvm.internal.AwS460S0200000_25 r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$26(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$27(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            boolean zBooleanValue = ((Boolean) ((C13FE) ((C20037613ag) awS460S0200000_25.l0).LJFF).getValue()).booleanValue();
            Function2 function2 = (Function2) awS460S0200000_25.l1;
            interfaceC1680500tpg.LJIILL(Boolean.valueOf(zBooleanValue));
            boolean zLJIIZILJ = interfaceC1680500tpg.LJIIZILJ(zBooleanValue);
            if (zBooleanValue) {
                function2.invoke(interfaceC1680500tpg, 0);
            } else {
                interfaceC1680500tpg.LJIIIIZZ(zLJIIZILJ);
            }
            interfaceC1680500tpg.LJIL();
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1672350tcX interfaceC1672350tcX = (InterfaceC1672350tcX) obj;
        long j = ((C1682380tsi) obj2).LIZ;
        return ((InterfaceC20053113dB) awS460S0200000_25.l0).LJFF(interfaceC1672350tcX, interfaceC1672350tcX.LJJLIL(Unit.LIZ, new C19719212De(-1945019079, new AwS444S0200000_8((InterfaceC1631620sYq) awS460S0200000_25.l1, (InterfaceC1631620sYq<? super InterfaceC1668850tWt, ? super InterfaceC1680500tpg, ? super Integer, Unit>) new C1672550tcr(interfaceC1672350tcX, j), (C1672550tcr) 19), true)), j);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$29(kotlin.jvm.internal.AwS460S0200000_25 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$29(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((PlaylistCollectionCell) awS460S0200000_25.l0).I5(((C0O6P) awS460S0200000_25.l1).LL, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) obj;
        long j = ((C1682380tsi) obj2).LIZ;
        if (C1682380tsi.LJIIIIZZ(j) == Integer.MAX_VALUE) {
            C1691080u6k.LIZ("LazyVerticalGrid's width should be bound by parent.");
        }
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        InterfaceC1670310tZF interfaceC1670310tZF = (InterfaceC1670310tZF) awS460S0200000_25.l0;
        InterfaceC1672520tco interfaceC1672520tco = (InterfaceC1672520tco) awS460S0200000_25.l1;
        int[] iArrLLII = C13LP.LLII(interfaceC1670310tZF.LIZ(iLJIIIIZZ, interfaceC1690500u5o.LJLLJ(interfaceC1672520tco.LIZ())));
        int[] iArr = new int[iArrLLII.length];
        interfaceC1672520tco.LIZIZ(interfaceC1690500u5o, iLJIIIIZZ, iArrLLII, EnumC1671200tag.Ltr, iArr);
        return new C1672540tcq(iArrLLII, iArr);
    }

    public static final Object invoke$31(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        float fFloatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        ((C817403Hg) awS460S0200000_25.l0).element += ((InterfaceC20090813jG) awS460S0200000_25.l1).LIZJ(fFloatValue - ((C817403Hg) awS460S0200000_25.l0).element);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$32(kotlin.jvm.internal.AwS460S0200000_25 r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$32(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$33(kotlin.jvm.internal.AwS460S0200000_25 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$33(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$34(kotlin.jvm.internal.AwS460S0200000_25 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r10 = r12
            X.0tpg r10 = (X.InterfaceC1680500tpg) r10
            java.lang.Number r13 = (java.lang.Number) r13
            int r0 = r13.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r10.LIZ()
            if (r0 == 0) goto L1a
            r10.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r1 = r11.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131847713(0x7f116a21, float:1.9328911E38)
            java.lang.String r4 = r1.getString(r0)
            r5 = 0
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r10.LJJIIJZLJL(r0)
            java.lang.Object r0 = r11.l1
            com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM r0 = (com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM) r0
            boolean r3 = r10.LJII(r0)
            java.lang.Object r0 = r11.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r10.LJII(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r11.l1
            com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM r2 = (com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM) r2
            java.lang.Object r1 = r11.l0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r8 = r10.LJJ()
            if (r3 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS426S0200000_25 r8 = new kotlin.jvm.internal.AwS426S0200000_25
            r0 = 188(0xbc, float:2.63E-43)
            r8.<init>(r1, r2, r0)
            r10.LJJIJIIJI(r8)
        L5e:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r10.LJ()
            r11 = 0
            r12 = 46
            r6 = r5
            r7 = r5
            r9 = r5
            X.C1673210tdv.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$34(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$35(kotlin.jvm.internal.AwS460S0200000_25 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r10 = r12
            X.0tpg r10 = (X.InterfaceC1680500tpg) r10
            java.lang.Number r13 = (java.lang.Number) r13
            int r0 = r13.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r10.LIZ()
            if (r0 == 0) goto L1a
            r10.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            java.lang.Object r1 = r11.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131847713(0x7f116a21, float:1.9328911E38)
            java.lang.String r4 = r1.getString(r0)
            r5 = 0
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r10.LJJIIJZLJL(r0)
            java.lang.Object r0 = r11.l1
            com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM r0 = (com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM) r0
            boolean r3 = r10.LJII(r0)
            java.lang.Object r0 = r11.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r10.LJII(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r11.l1
            com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM r2 = (com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM) r2
            java.lang.Object r1 = r11.l0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r8 = r10.LJJ()
            if (r3 != 0) goto L54
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L5e
        L54:
            kotlin.jvm.internal.AwS426S0200000_25 r8 = new kotlin.jvm.internal.AwS426S0200000_25
            r0 = 189(0xbd, float:2.65E-43)
            r8.<init>(r1, r2, r0)
            r10.LJJIJIIJI(r8)
        L5e:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r10.LJ()
            r11 = 0
            r12 = 46
            r6 = r5
            r7 = r5
            r9 = r5
            X.C1673210tdv.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$35(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$36(kotlin.jvm.internal.AwS460S0200000_25 r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r10 = r19
            X.0tpg r10 = (X.InterfaceC1680500tpg) r10
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1d
            boolean r0 = r10.LIZ()
            if (r0 == 0) goto L1d
            r10.LIZJ()
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1d:
            r1 = r18
            java.lang.Object r2 = r1.l0
            android.content.Context r2 = (android.content.Context) r2
            r0 = 2131828227(0x7f111e03, float:1.9289389E38)
            java.lang.String r4 = r2.getString(r0)
            r5 = 0
            r12 = 0
            r11 = 0
            r20 = 31
            r14 = r12
            r16 = r12
            r18 = r10
            r19 = r11
            X.0tSp r6 = X.C1666340tSq.LIZIZ(r12, r14, r16, r18, r19, r20)
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r10.LJJIIJZLJL(r0)
            java.lang.Object r0 = r1.l1
            com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM r0 = (com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM) r0
            boolean r3 = r10.LJII(r0)
            java.lang.Object r0 = r1.l0
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r10.LJII(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r1.l1
            com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM r2 = (com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM) r2
            java.lang.Object r1 = r1.l0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r8 = r10.LJJ()
            if (r3 != 0) goto L69
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L73
        L69:
            kotlin.jvm.internal.AwS426S0200000_25 r8 = new kotlin.jvm.internal.AwS426S0200000_25
            r0 = 190(0xbe, float:2.66E-43)
            r8.<init>(r1, r2, r0)
            r10.LJJIJIIJI(r8)
        L73:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r10.LJ()
            r12 = 42
            r7 = r5
            r9 = r5
            X.C1673210tdv.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$36(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$37(kotlin.jvm.internal.AwS460S0200000_25 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$37(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        String curUserId;
        C19719212De c19719212DeLIZJ;
        C19719212De c19719212DeLIZJ2;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(c.LJ(c1685760tyA, 1.0f), 12);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            AuthorizedOrgAccountInfo authorizedOrgAccountInfo = (AuthorizedOrgAccountInfo) awS460S0200000_25.l0;
            LoginChooseAccountsFragment loginChooseAccountsFragment = (LoginChooseAccountsFragment) awS460S0200000_25.l1;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, interfaceC1680500tpg, 48);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJIIIIZZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                C1175204ik c1175204ik = new C1175204ik(authorizedOrgAccountInfo.avatarUrl);
                float f = 16;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJI(c.LJIILLIIL(c1685760tyA, 64), 48), 0.0f, 0.0f, f, 0.0f, 11);
                interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                Object objLJJ = interfaceC1680500tpg.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = AFwS266S0000000_25.get$arr$(79);
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ);
                }
                interfaceC1680500tpg.LJ();
                C1670540tZc.LIZ(c1175204ik, "avatar", interfaceC1685750ty9LJIIL, null, null, null, null, null, null, null, (Function1) objLJJ, null, interfaceC1680500tpg, 432, 6, 3064);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = c1687980u1k.LIZ(c1685760tyA, 1.0f, true);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, interfaceC1680500tpg, 0);
                int iLIZ2 = C0MXE.LIZ(interfaceC1680500tpg);
                C13D2 c13d2LJJIFFI2 = interfaceC1680500tpg.LJJIFFI();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZ);
                if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                    interfaceC1680500tpg.LJJIII();
                    if (interfaceC1680500tpg.LJJIIZ()) {
                        interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                    } else {
                        interfaceC1680500tpg.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI2, aFwS311S0000000_252);
                    if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ2))) {
                        interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    boolean z = authorizedOrgAccountInfo.isInC2B;
                    loginChooseAccountsFragment.getClass();
                    IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
                    if (iAccountUserService == null || (curUserId = iAccountUserService.getCurUserId()) == null) {
                        curUserId = "";
                    }
                    boolean zLJFF = Intrinsics.LJFF(curUserId, authorizedOrgAccountInfo.userIdStr);
                    int i = authorizedOrgAccountInfo.trialTagType;
                    String str = authorizedOrgAccountInfo.nickname;
                    if (z) {
                        interfaceC1680500tpg.LJJIIJZLJL(1220418888);
                        c19719212DeLIZJ = C13Z4.LIZJ(300591768, new AwS181S0101000_25(loginChooseAccountsFragment, i, 16), interfaceC1680500tpg);
                        interfaceC1680500tpg.LJ();
                    } else if (zLJFF) {
                        interfaceC1680500tpg.LJJIIJZLJL(1220536068);
                        c19719212DeLIZJ = C13Z4.LIZJ(-1842332721, new AwS639S0100000_25(loginChooseAccountsFragment, 16), interfaceC1680500tpg);
                        interfaceC1680500tpg.LJ();
                    } else {
                        interfaceC1680500tpg.LJJIIJZLJL(1220609413);
                        interfaceC1680500tpg.LJ();
                        c19719212DeLIZJ = null;
                    }
                    interfaceC1680500tpg.LJJIIJZLJL(-1207549916);
                    if (z && zLJFF) {
                        c19719212DeLIZJ2 = C13Z4.LIZJ(293211447, new AwS639S0100000_25(loginChooseAccountsFragment, 17), interfaceC1680500tpg);
                    } else {
                        c19719212DeLIZJ2 = null;
                    }
                    interfaceC1680500tpg.LJ();
                    loginChooseAccountsFragment.RS(str, c19719212DeLIZJ, c19719212DeLIZJ2, interfaceC1680500tpg, 0, 0);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(c1685760tyA, 0.0f, 6, 0.0f, 0.0f, 13);
                    String str2 = authorizedOrgAccountInfo.username;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(str2);
                    C1685190txF.LIZ(C2188811AlT.LIZIZ(sbLIZ), interfaceC1685750ty9LJIIL2, C1670400tZO.LIZIZ(interfaceC1680500tpg).N3(), C1670400tZO.LJ(interfaceC1680500tpg).LJIIZILJ, 0L, 1, 2, false, 1, null, null, interfaceC1680500tpg, 102236208, 0, 1680);
                    interfaceC1680500tpg.LJJIIJZLJL(-1207530183);
                    if (authorizedOrgAccountInfo.displayEntityInfo.length() != 0) {
                        C1685190txF.LIZ(authorizedOrgAccountInfo.displayEntityInfo, null, C1670400tZO.LIZIZ(interfaceC1680500tpg).N3(), C1670400tZO.LJ(interfaceC1680500tpg).LJIIZILJ, 0L, 1, 2, false, 1, null, null, interfaceC1680500tpg, 102236160, 0, 1682);
                    }
                    interfaceC1680500tpg.LJ();
                    interfaceC1680500tpg.LJIIIZ();
                    C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, 8), interfaceC1680500tpg);
                    C1668880tWw c1668880tWw = C1669660tYC.LJJLIIIIJ;
                    long jQ3 = C1670400tZO.LIZIZ(interfaceC1680500tpg).Q3();
                    interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                    Object objLJJ2 = interfaceC1680500tpg.LJJ();
                    if (objLJJ2 == c1680520tpi) {
                        objLJJ2 = AFwS214S0000000_25.get$arr$(83);
                        interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
                    }
                    interfaceC1680500tpg.LJ();
                    C1668930tX1.LIZIZ(c1668880tWw, "", C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ2, 7), jQ3, f, f, false, interfaceC1680500tpg, 221232, 64);
                    interfaceC1680500tpg.LJIIIZ();
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            Function2 function2 = (Function2) awS460S0200000_25.l0;
            Function2 function22 = (Function2) awS460S0200000_25.l1;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, interfaceC1680500tpg, 48);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                interfaceC1680500tpg.LJJIIJZLJL(1298591199);
                if (function2 != null) {
                    function2.invoke(interfaceC1680500tpg, 0);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJJIIJZLJL(1298592607);
                if (function22 != null) {
                    function22.invoke(interfaceC1680500tpg, 0);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS460S0200000_25 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = r11
            X.0tpg r9 = (X.InterfaceC1680500tpg) r9
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r9.LIZ()
            if (r0 == 0) goto L1a
            r9.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            X.0tWw r4 = X.C1669660tYC.LJJJLZIJ
            r5 = 0
            r6 = 0
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r9.LJJIIJZLJL(r0)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment r0 = (com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment) r0
            boolean r3 = r9.LJII(r0)
            java.lang.Object r0 = r10.l1
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r9.LJII(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment r2 = (com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment) r2
            java.lang.Object r1 = r10.l1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r8 = r9.LJJ()
            if (r3 != 0) goto L4c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L56
        L4c:
            kotlin.jvm.internal.AwS426S0200000_25 r8 = new kotlin.jvm.internal.AwS426S0200000_25
            r0 = 19
            r8.<init>(r1, r2, r0)
            r9.LJJIJIIJI(r8)
        L56:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r9.LJ()
            r11 = 14
            r7 = r5
            r10 = r6
            X.C1668060tVc.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$6(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS460S0200000_25 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = r11
            X.0tpg r9 = (X.InterfaceC1680500tpg) r9
            java.lang.Number r12 = (java.lang.Number) r12
            int r0 = r12.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r9.LIZ()
            if (r0 == 0) goto L1a
            r9.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            X.0tWw r4 = X.C1669660tYC.LLLF
            r5 = 0
            r6 = 0
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r9.LJJIIJZLJL(r0)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment r0 = (com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment) r0
            boolean r3 = r9.LJII(r0)
            java.lang.Object r0 = r10.l1
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r9.LJII(r0)
            r3 = r3 | r0
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment r2 = (com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment) r2
            java.lang.Object r1 = r10.l1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r8 = r9.LJJ()
            if (r3 != 0) goto L4c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L56
        L4c:
            kotlin.jvm.internal.AwS413S0200000_12 r8 = new kotlin.jvm.internal.AwS413S0200000_12
            r0 = 21
            r8.<init>(r1, r2, r0)
            r9.LJJIJIIJI(r8)
        L56:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r9.LJ()
            r11 = 14
            r7 = r5
            r10 = r6
            X.C1668060tVc.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$7(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS460S0200000_25 awS460S0200000_25, Object obj, Object obj2) {
        AbstractC1672070tc5 abstractC1672070tc5;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LeakedGoPasswordlessActivity leakedGoPasswordlessActivity = (LeakedGoPasswordlessActivity) awS460S0200000_25.l0;
        leakedGoPasswordlessActivity.LLILLJJLI = zBooleanValue;
        leakedGoPasswordlessActivity.LLILLL = (String) obj2;
        C05P0 c05p0 = (C05P0) awS460S0200000_25.l1;
        if (zBooleanValue) {
            abstractC1672070tc5 = C1672090tc7.LIZ;
        } else {
            abstractC1672070tc5 = C1672100tc8.LIZ;
        }
        c05p0.setValue(abstractC1672070tc5);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS460S0200000_25 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L19
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L19
            r7.LIZJ()
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            java.lang.Object r1 = r6.l0
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r1 == 0) goto L83
            java.lang.String r0 = "transparency_url"
            java.lang.String r5 = r1.getString(r0)
        L25:
            r4 = 0
            r2 = 5004770(0x4c5de2, float:7.013177E-39)
            if (r5 == 0) goto L85
            com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJIL()
            boolean r0 = r0.LJJIJ()
            if (r0 == 0) goto L45
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r1 = "effect_teenager_should_show_static_content_for_more_info_page"
            r0 = 1
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)
            if (r0 != 0) goto L85
        L45:
            r0 = 338451915(0x142c5dcb, float:8.702278E-27)
            r7.LJJIIJZLJL(r0)
            java.lang.Object r3 = r6.l1
            com.ss.android.ugc.aweme.activity.MoreInfoActivity r3 = (com.ss.android.ugc.aweme.activity.MoreInfoActivity) r3
            r7.LJJIIJZLJL(r2)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.activity.MoreInfoActivity r0 = (com.ss.android.ugc.aweme.activity.MoreInfoActivity) r0
            boolean r0 = r7.LJII(r0)
            java.lang.Object r2 = r6.l1
            com.ss.android.ugc.aweme.activity.MoreInfoActivity r2 = (com.ss.android.ugc.aweme.activity.MoreInfoActivity) r2
            java.lang.Object r1 = r7.LJJ()
            if (r0 != 0) goto L6d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L77
        L6d:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 77
            r1.<init>(r2, r0)
            r7.LJJIJIIJI(r1)
        L77:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r7.LJ()
            r3.LLLLZIL(r5, r1, r7, r4)
            r7.LJ()
            goto L16
        L83:
            r5 = 0
            goto L25
        L85:
            r0 = 338628367(0x142f0f0f, float:8.838212E-27)
            r7.LJJIIJZLJL(r0)
            java.lang.Object r3 = r6.l1
            com.ss.android.ugc.aweme.activity.MoreInfoActivity r3 = (com.ss.android.ugc.aweme.activity.MoreInfoActivity) r3
            r7.LJJIIJZLJL(r2)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.activity.MoreInfoActivity r0 = (com.ss.android.ugc.aweme.activity.MoreInfoActivity) r0
            boolean r0 = r7.LJII(r0)
            java.lang.Object r2 = r6.l1
            com.ss.android.ugc.aweme.activity.MoreInfoActivity r2 = (com.ss.android.ugc.aweme.activity.MoreInfoActivity) r2
            java.lang.Object r1 = r7.LJJ()
            if (r0 != 0) goto Lad
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto Lb7
        Lad:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 78
            r1.<init>(r2, r0)
            r7.LJJIJIIJI(r1)
        Lb7:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r7.LJ()
            r3.LLLLZLL(r1, r7, r4)
            r7.LJ()
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS460S0200000_25.invoke$9(kotlin.jvm.internal.AwS460S0200000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(C05P0 c05p0, FaqDetailFragment faqDetailFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = c05p0;
        this.l1 = faqDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(C2018407vS c2018407vS, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2018407vS;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(C0SC0 c0sc0, ComposeView composeView, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0sc0;
        this.l1 = composeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(InterfaceC1670310tZF interfaceC1670310tZF, InterfaceC1672520tco interfaceC1672520tco, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1670310tZF;
        this.l1 = interfaceC1672520tco;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(EnumC1675160th4 enumC1675160th4, C1687630u1B c1687630u1B, int i) {
        super(2);
        this.$t = i;
        this.l0 = enumC1675160th4;
        this.l1 = c1687630u1B;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(C1686700tzg c1686700tzg, C05P0 c05p0, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1686700tzg;
        this.l1 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS460S0200000_25(C19311910gv c19311910gv, C19311910gv c19311910gv2, InterfaceC1665500tRU<String> interfaceC1665500tRU) {
        super(2);
        this.$t = interfaceC1665500tRU;
        this.l0 = c19311910gv;
        this.l1 = c19311910gv2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS460S0200000_25(C20037613ag c20037613ag, C20037613ag c20037613ag2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = c20037613ag;
        this.l1 = c20037613ag2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS460S0200000_25(C20043513bd c20043513bd, C20043513bd c20043513bd2, Function2<? super InterfaceC1690470u5l, ? super C1682380tsi, ? extends InterfaceC1690350u5Z> function2) {
        super(2);
        this.$t = function2;
        this.l0 = c20043513bd;
        this.l1 = c20043513bd2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS460S0200000_25(InterfaceC20053113dB interfaceC20053113dB, InterfaceC20053113dB interfaceC20053113dB2, InterfaceC1631620sYq<? super InterfaceC1668850tWt, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq) {
        super(2);
        this.$t = interfaceC1631620sYq;
        this.l0 = interfaceC20053113dB;
        this.l1 = interfaceC20053113dB2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(Context context, DiskManagerSettingsVM diskManagerSettingsVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = diskManagerSettingsVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(Bitmap bitmap, C1679780toW c1679780toW, int i) {
        super(2);
        this.$t = i;
        this.l0 = bitmap;
        this.l1 = c1679780toW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(Bundle bundle, MoreInfoActivity moreInfoActivity, int i) {
        super(2);
        this.$t = i;
        this.l0 = bundle;
        this.l1 = moreInfoActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(ComposeView composeView, MessageNotificationFragment messageNotificationFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = messageNotificationFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(ComposeView composeView, CSPFragment cSPFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = cSPFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(ComposeView composeView, FaqDetailFragment faqDetailFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = faqDetailFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(AuthorizedOrgAccountInfo authorizedOrgAccountInfo, LoginChooseAccountsFragment loginChooseAccountsFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = authorizedOrgAccountInfo;
        this.l1 = loginChooseAccountsFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS460S0200000_25(LeakedGoPasswordlessActivity leakedGoPasswordlessActivity, LeakedGoPasswordlessActivity leakedGoPasswordlessActivity2, C05P0<AbstractC1672070tc5> c05p0) {
        super(2);
        this.$t = c05p0;
        this.l0 = leakedGoPasswordlessActivity;
        this.l1 = leakedGoPasswordlessActivity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(PlaylistCollectionCell playlistCollectionCell, C0O6P c0o6p, int i) {
        super(2);
        this.$t = i;
        this.l0 = playlistCollectionCell;
        this.l1 = c0o6p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(FollowCreatorsViewModel followCreatorsViewModel, C1673800tes c1673800tes, int i) {
        super(2);
        this.$t = i;
        this.l0 = followCreatorsViewModel;
        this.l1 = c1673800tes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(UserMatchedAssem userMatchedAssem, C1687630u1B c1687630u1B, int i) {
        super(2);
        this.$t = i;
        this.l0 = userMatchedAssem;
        this.l1 = c1687630u1B;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(WaitingAssem waitingAssem, C1687630u1B c1687630u1B, int i) {
        super(2);
        this.$t = i;
        this.l0 = waitingAssem;
        this.l1 = c1687630u1B;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(StoryEditToolbarComponent storyEditToolbarComponent, C559050LwF c559050LwF, int i) {
        super(2);
        this.$t = i;
        this.l0 = storyEditToolbarComponent;
        this.l1 = c559050LwF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(TakoAIVideoInputAssem takoAIVideoInputAssem, C1679570toB c1679570toB, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoAIVideoInputAssem;
        this.l1 = c1679570toB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(TakoAIVideoInputAssem takoAIVideoInputAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoAIVideoInputAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(TakoContentPreviewAssem takoContentPreviewAssem, C1679860toe c1679860toe, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoContentPreviewAssem;
        this.l1 = c1679860toe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(BottomTakoEntranceComposeAssem bottomTakoEntranceComposeAssem, C1214550hi9 c1214550hi9, int i) {
        super(2);
        this.$t = i;
        this.l0 = bottomTakoEntranceComposeAssem;
        this.l1 = c1214550hi9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(d dVar, TextStickerData textStickerData, int i) {
        super(2);
        this.$t = i;
        this.l0 = dVar;
        this.l1 = textStickerData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(DoNotTranslateSettingPage doNotTranslateSettingPage, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = doNotTranslateSettingPage;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(DoNotTranslateSettingPageV2 doNotTranslateSettingPageV2, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = doNotTranslateSettingPageV2;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS460S0200000_25(List list, OrgAccountsListFragment orgAccountsListFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = orgAccountsListFragment;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS460S0200000_25(Function2 function2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23) {
        super(2);
        this.$t = function23;
        this.l0 = function2;
        this.l1 = function22;
    }
}
