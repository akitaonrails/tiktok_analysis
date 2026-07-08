package kotlin.jvm.internal;

import X.C01GW;
import X.C05P0;
import X.C09AY;
import X.C0WP3;
import X.C13Z4;
import X.C14UV;
import X.C14VI;
import X.C14XX;
import X.C14XZ;
import X.C161N;
import X.C1666380tSu;
import X.C1669670tYD;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1689580u4K;
import X.C1695970uEd;
import X.C1696120uEs;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19409710wh;
import X.C19411210ww;
import X.C197039127h;
import X.C20028913Yh;
import X.C20035813aO;
import X.C20042813bW;
import X.C20043513bd;
import X.C20043613be;
import X.C20068213fc;
import X.C20073413gS;
import X.C20088213iq;
import X.C2016607vA;
import X.C20284114Yl;
import X.C20285414Yy;
import X.C20696015yg;
import X.C20703515zt;
import X.C442090HVf;
import X.C708900RrM;
import X.C746760TRa;
import X.C747440TTq;
import X.C988000bok;
import X.EnumC1427810nG7;
import X.EnumC442280HVy;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1686290tz1;
import X.InterfaceC20043013bY;
import Y.ARunnableS0S0501000_30;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.WrappedComposition;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IMTranslationFirstTimeGuideFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsCommonComposeSubFragment;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginComposeFragment;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import p2.j1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS465S0200000_30 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS465S0200000_30(X.C20284114Yl r3, X.C20284114Yl r4, java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.survey.Option> r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 14 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS465S0200000_30.<init>(X.14Yl, java.util.ArrayList, int):void");
    }

    public static final Object invoke$0(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (!interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            interfaceC1680500tpg.LIZJ();
            return Unit.LIZ;
        }
        ((C20035813aO) awS465S0200000_30.l0).getClass();
        throw null;
    }

    public static final Object invoke$1(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        C20068213fc c20068213fc = (C20068213fc) obj2;
        if (!((C20073413gS) awS465S0200000_30.l0).LIZIZ.LIZ(c20068213fc.LJI)) {
            ((AndroidContentCaptureManager) awS465S0200000_30.l1).LJII(iIntValue, c20068213fc);
            ((AndroidContentCaptureManager) awS465S0200000_30.l1).LLIZLLLIL.LJIIIIZZ(Unit.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS465S0200000_30.l0;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS465S0200000_30.l1;
        String str = C747440TTq.LIZJ().confirmQuery;
        if (str == null) {
            str = "";
        }
        takoDisclaimerDialogProcessor.getClass();
        TakoDisclaimerDialogProcessor.LIZJ(false, takoEnterParams, str, iIntValue);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS465S0200000_30.l0;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS465S0200000_30.l1;
        String str = C747440TTq.LIZJ().confirmQuery;
        if (str == null) {
            str = "";
        }
        takoDisclaimerDialogProcessor.getClass();
        TakoDisclaimerDialogProcessor.LIZJ(false, takoEnterParams, str, iIntValue);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) throws JSONException {
        String str;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS465S0200000_30.l0;
        String str2 = takoEnterParams.enterFrom;
        String str3 = takoEnterParams.enterMethod;
        String str4 = takoEnterParams.processId;
        C1863850ybP c1863850ybP = (C1863850ybP) awS465S0200000_30.l1;
        if (c1863850ybP == null || (str = c1863850ybP.LLILZLL) == null) {
            str = "";
        }
        C1862330yYx.LJIIZILJ(c1862330yYx, str2, str3, str4, "language_style_available", "click_not_now", null, null, null, null, null, null, str, takoEnterParams.takoChatId, 10208);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        FeedSurvey feedSurvey;
        Question[] questionArr;
        Question question;
        Option[] optionArr;
        Question[] questionArr2;
        Question question2;
        Option[] optionArr2;
        Option option;
        Question[] questionArr3;
        Question question3;
        ViewStub viewStub;
        View view;
        int iIntValue = ((Number) obj2).intValue();
        String aid = null;
        if (C19411210ww.LIZJ((Option) ListProtector.get((ArrayList) awS465S0200000_30.l0, iIntValue))) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C14XZ c14xz = (C14XZ) awS465S0200000_30.l1;
            if (jCurrentTimeMillis - c14xz.LLJLLIL >= 300) {
                c14xz.LLJLLIL = System.currentTimeMillis();
                C14XZ c14xz2 = (C14XZ) awS465S0200000_30.l1;
                C19409710wh<Option> c19409710wh = c14xz2.LLJJLIIIJLLLLLLLZ;
                if (c19409710wh != null) {
                    c19409710wh.LL = iIntValue;
                    c19409710wh.notifyDataSetChanged();
                }
                if (iIntValue >= 0 && (feedSurvey = c14xz2.LLILLJJLI) != null && (questionArr = feedSurvey.questions) != null && (question = questionArr[0]) != null && (optionArr = question.options) != null && iIntValue < optionArr.length && feedSurvey != null && (questionArr2 = feedSurvey.questions) != null && (question2 = questionArr2[0]) != null && (optionArr2 = question2.options) != null && (option = optionArr2[iIntValue]) != null && (questionArr3 = option.questions) != null && (question3 = questionArr3[0]) != null && (viewStub = c14xz2.LLJJJ) != null && (view = c14xz2.LLJILJILJ) != null) {
                    view.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS0S0501000_30(view, c14xz2, viewStub, option, iIntValue, question3, 4)).setStartDelay(200L).start();
                }
                C14XX c14xx = new C14XX();
                c14xx.LIZ = iIntValue;
                c14xx.LIZIZ = false;
                C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
                C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
                Aweme aweme = ((C14XZ) awS465S0200000_30.l1).LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                c20285414YyLIZ.LJI(aid, c14xx);
                ((C14XZ) awS465S0200000_30.l1).LJJ();
            }
        } else {
            ((C14XZ) awS465S0200000_30.l1).LJIJJ();
            int i = ((C14XZ) awS465S0200000_30.l1).LLILZIL;
            if (i != 0 && i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        Iterator it2 = ((ArrayList) awS465S0200000_30.l0).iterator();
                        while (it2.hasNext()) {
                            ((Option) it2.next()).setSelected(false);
                        }
                        ((Option) ListProtector.get((ArrayList) awS465S0200000_30.l0, iIntValue)).setSelected(true);
                        TuxTextView tuxTextView = ((C14XZ) awS465S0200000_30.l1).LLJJIJI;
                        if (tuxTextView != null) {
                            tuxTextView.setText(((Option) ListProtector.get((ArrayList) awS465S0200000_30.l0, iIntValue)).name);
                        }
                        TuxTextView tuxTextView2 = ((C14XZ) awS465S0200000_30.l1).LLJJIJI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setTextColorRes(R.attr.ee);
                        }
                    }
                } else {
                    if (iIntValue >= 0) {
                        int i2 = 0;
                        while (true) {
                            ((Option) ListProtector.get((ArrayList) awS465S0200000_30.l0, i2)).setSelected(true);
                            if (i2 == iIntValue) {
                                break;
                            }
                            i2++;
                        }
                    }
                    int size = ((ArrayList) awS465S0200000_30.l0).size();
                    for (int i3 = iIntValue + 1; i3 < size; i3++) {
                        ((Option) ListProtector.get((ArrayList) awS465S0200000_30.l0, i3)).setSelected(false);
                    }
                    TuxTextView tuxTextView3 = ((C14XZ) awS465S0200000_30.l1).LLJJIJI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(((Option) ListProtector.get((ArrayList) awS465S0200000_30.l0, iIntValue)).name);
                    }
                    TuxTextView tuxTextView4 = ((C14XZ) awS465S0200000_30.l1).LLJJIJI;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setTextColorRes(R.attr.ee);
                    }
                }
            } else {
                Iterator it3 = ((ArrayList) awS465S0200000_30.l0).iterator();
                while (it3.hasNext()) {
                    ((Option) it3.next()).setSelected(false);
                }
                ((Option) ListProtector.get((ArrayList) awS465S0200000_30.l0, iIntValue)).setSelected(true);
            }
            C14XZ c14xz3 = (C14XZ) awS465S0200000_30.l1;
            c14xz3.LLJL = iIntValue;
            C19409710wh<Option> c19409710wh2 = c14xz3.LLJJLIIIJLLLLLLLZ;
            if (c19409710wh2 != null) {
                c19409710wh2.LL = iIntValue;
                c19409710wh2.notifyDataSetChanged();
            }
            ((C14XZ) awS465S0200000_30.l1).LLJLIL = (Option) ListProtector.get((ArrayList) awS465S0200000_30.l0, iIntValue);
            C14XX c14xx2 = new C14XX();
            c14xx2.LIZ = ((C14XZ) awS465S0200000_30.l1).LLJL;
            c14xx2.LIZIZ = false;
            C01GW<C20285414Yy> c01gw2 = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme2 = ((C14XZ) awS465S0200000_30.l1).LL;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            }
            c20285414YyLIZ2.LJI(aid, c14xx2);
            ((C14XZ) awS465S0200000_30.l1).LJJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        if (!((C20284114Yl) awS465S0200000_30.l0).LLJLL) {
            Option option = (Option) ListProtector.get((ArrayList) awS465S0200000_30.l1, iIntValue);
            boolean z = !option.isSelected();
            if (z) {
                ((C20284114Yl) awS465S0200000_30.l0).LLIZ.put(Integer.valueOf(option.id), option);
            } else if (((C20284114Yl) awS465S0200000_30.l0).LLIZ.containsKey(Integer.valueOf(option.id))) {
                ((C20284114Yl) awS465S0200000_30.l0).LLIZ.remove(Integer.valueOf(option.id));
            }
            option.setSelected(z);
            ((C20284114Yl) awS465S0200000_30.l0).LJIILLIIL();
            C19409710wh<Option> c19409710wh = ((C20284114Yl) awS465S0200000_30.l0).LLJLIL;
            if (c19409710wh != null) {
                c19409710wh.notifyDataSetChanged();
            }
            ((C20284114Yl) awS465S0200000_30.l0).LJIILL();
            ((C20284114Yl) awS465S0200000_30.l0).LJIJJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        Option option = (Option) ListProtector.get((ArrayList) awS465S0200000_30.l0, iIntValue);
        Iterator it2 = ((ArrayList) awS465S0200000_30.l0).iterator();
        while (it2.hasNext()) {
            ((Option) it2.next()).setSelected(false);
        }
        option.setSelected(true);
        C20284114Yl c20284114Yl = (C20284114Yl) awS465S0200000_30.l1;
        C19409710wh<Option> c19409710wh = c20284114Yl.LLJLIL;
        if (c19409710wh != null) {
            c19409710wh.LL = iIntValue;
        }
        ((LinkedHashMap) c20284114Yl.LLIZ).clear();
        ((C20284114Yl) awS465S0200000_30.l1).LLIZ.put(Integer.valueOf(option.id), option);
        ((C20284114Yl) awS465S0200000_30.l1).LJIILLIIL();
        C19409710wh<Option> c19409710wh2 = ((C20284114Yl) awS465S0200000_30.l1).LLJLIL;
        if (c19409710wh2 != null) {
            c19409710wh2.notifyDataSetChanged();
        }
        C197039127h c197039127h = ((C20284114Yl) awS465S0200000_30.l1).LLJJJJJIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(true);
            c197039127h.setClickable(true);
            c197039127h.setButtonVariant(0);
        }
        ((C20284114Yl) awS465S0200000_30.l1).LJIILL();
        ((C20284114Yl) awS465S0200000_30.l1).LJIJJ();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        InterfaceC1686290tz1 interfaceC1686290tz1 = (InterfaceC1686290tz1) obj;
        C1695970uEd c1695970uEd = (C1695970uEd) obj2;
        if (((j1) awS465S0200000_30.l0).LLJILJILJ.LJIJJ()) {
            j1 j1Var = (j1) awS465S0200000_30.l0;
            j1Var.LLJLL = interfaceC1686290tz1;
            j1Var.LLJLILLLLZIIL = c1695970uEd;
            C1696120uEs.LIZ(j1Var.LLJILJILJ).getSnapshotObserver().LIZ((j1) awS465S0200000_30.l0, j1.LLLFF, (Function0) awS465S0200000_30.l1);
            ((j1) awS465S0200000_30.l0).LLJZ = false;
        } else {
            ((j1) awS465S0200000_30.l0).LLJZ = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        LocalServiceAlbumVM localServiceAlbumVM;
        if (((String) obj).length() > 0 && obj2 == EnumC442280HVy.GRANTED) {
            C442090HVf.LJFF("camera", PageFinder.via((Activity) awS465S0200000_30.l0));
            Activity activity = (Activity) awS465S0200000_30.l0;
            if (activity != null && (localServiceAlbumVM = ((C14VI) awS465S0200000_30.l1).LJIIJ) != null) {
                localServiceAlbumVM.vQ2(activity);
            }
            C14VI c14vi = (C14VI) awS465S0200000_30.l1;
            Activity activity2 = (Activity) awS465S0200000_30.l0;
            C14UV c14uv = c14vi.LJI;
            if (c14uv != null) {
                c14uv.cancel(false);
            }
            C14UV c14uv2 = new C14UV(activity2, c14vi, c14vi.LJIIIIZZ);
            C0WP3.LIZLLL(c14uv2, c14vi.LIZJ, new Unit[0]);
            c14vi.LJI = c14uv2;
        } else {
            ((C14VI) awS465S0200000_30.l1).LIZIZ.LIZ(3, "Camera permission denied");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            ((InterfaceC1631620sYq) awS465S0200000_30.l0).invoke((C20042813bW) awS465S0200000_30.l1, interfaceC1680500tpg, 0);
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AwS465S0200000_30 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r7 = r10
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r11 = (java.lang.Number) r11
            int r2 = r11.intValue()
            r1 = r2 & 3
            r0 = 2
            if (r1 == r0) goto Laa
            r1 = 1
        Lf:
            r0 = r2 & 1
            boolean r0 = r7.LJIJJLI(r0, r1)
            if (r0 == 0) goto La6
            java.lang.Object r0 = r9.l0
            X.13bd r0 = (X.C20043513bd) r0
            kotlin.jvm.functions.Function0<X.0u5m> r0 = r0.LIZIZ
            java.lang.Object r3 = r0.invoke()
            X.0u5m r3 = (X.InterfaceC1690480u5m) r3
            java.lang.Object r0 = r9.l1
            X.13be r0 = (X.C20043613be) r0
            int r5 = r0.LIZJ
            int r0 = r3.getItemCount()
            r2 = -1
            if (r5 >= r0) goto L40
            java.lang.Object r1 = r3.LIZLLL(r5)
            java.lang.Object r0 = r9.l1
            X.13be r0 = (X.C20043613be) r0
            java.lang.Object r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L52
        L40:
            java.lang.Object r0 = r9.l1
            X.13be r0 = (X.C20043613be) r0
            java.lang.Object r0 = r0.LIZ
            int r5 = r3.LIZ(r0)
            if (r5 == r2) goto L9c
            java.lang.Object r0 = r9.l1
            X.13be r0 = (X.C20043613be) r0
            r0.LIZJ = r5
        L52:
            if (r5 == r2) goto L9c
            r0 = -660404355(0xffffffffd8a3077d, float:-1.4340205E15)
            r7.LJJIIJZLJL(r0)
            java.lang.Object r0 = r9.l0
            X.13bd r0 = (X.C20043513bd) r0
            X.13bY r4 = r0.LIZ
            java.lang.Object r0 = r9.l1
            X.13be r0 = (X.C20043613be) r0
            java.lang.Object r6 = r0.LIZ
            r8 = 0
            X.C20043313bb.LIZ(r3, r4, r5, r6, r7, r8)
            r7.LJ()
        L6d:
            java.lang.Object r0 = r9.l1
            X.13be r0 = (X.C20043613be) r0
            java.lang.Object r3 = r0.LIZ
            boolean r0 = r7.LJII(r0)
            java.lang.Object r2 = r9.l1
            X.13be r2 = (X.C20043613be) r2
            java.lang.Object r1 = r7.LJJ()
            if (r0 != 0) goto L8a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L94
        L8a:
            kotlin.jvm.internal.AwS609S0100000_30 r1 = new kotlin.jvm.internal.AwS609S0100000_30
            r0 = 292(0x124, float:4.09E-43)
            r1.<init>(r2, r0)
            r7.LJJIJIIJI(r1)
        L94:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.C1680540tpk.LIZIZ(r3, r1, r7)
        L99:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9c:
            r0 = -660169871(0xffffffffd8a69b71, float:-1.4654924E15)
            r7.LJJIIJZLJL(r0)
            r7.LJ()
            goto L6d
        La6:
            r7.LIZJ()
            goto L99
        Laa:
            r1 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS465S0200000_30.invoke$19(kotlin.jvm.internal.AwS465S0200000_30, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            AndroidCompositionLocals_androidKt.LIZ(((WrappedComposition) awS465S0200000_30.l0).LL, (Function2) awS465S0200000_30.l1, interfaceC1680500tpg, 0);
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[PHI: r4
      0x004e: PHI (r4v8 java.util.Set) = (r4v4 java.util.Set), (r4v9 java.util.Set) binds: [B:19:0x004c, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS465S0200000_30 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS465S0200000_30.invoke$3(kotlin.jvm.internal.AwS465S0200000_30, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            boolean z = false;
            C05P0 c05p0LIZIZ = C20028913Yh.LIZIZ(C746760TRa.LIZ().LJLIIIL(), interfaceC1680500tpg, 0);
            C05P0 c05p0LIZIZ2 = C20028913Yh.LIZIZ(C161N.LIZIZ.LLIIIZ(), interfaceC1680500tpg, 0);
            C708900RrM c708900RrM = (C708900RrM) c05p0LIZIZ.getValue();
            if (c708900RrM != null && c708900RrM.LIZ) {
                z = true;
            }
            interfaceC1680500tpg.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS274S0000000_30.get$arr$(64);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            interfaceC1680500tpg.LJ();
            C20703515zt c20703515zt = C20703515zt.LIZ;
            String str = (String) c05p0LIZIZ2.getValue();
            c20703515zt.getClass();
            String strLJII = C20703515zt.LJII(str);
            if (strLJII == null) {
                strLJII = "";
            }
            interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
            boolean zLJII = interfaceC1680500tpg.LJII((View) awS465S0200000_30.l0) | interfaceC1680500tpg.LJII((IMTranslationFirstTimeGuideFragment) awS465S0200000_30.l1);
            View view = (View) awS465S0200000_30.l0;
            IMTranslationFirstTimeGuideFragment iMTranslationFirstTimeGuideFragment = (IMTranslationFirstTimeGuideFragment) awS465S0200000_30.l1;
            Object objLJJ2 = interfaceC1680500tpg.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS432S0200000_31(view, iMTranslationFirstTimeGuideFragment, 50);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
            }
            Function0 function0 = (Function0) objLJJ2;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII2 = interfaceC1680500tpg.LJII((IMTranslationFirstTimeGuideFragment) awS465S0200000_30.l1);
            IMTranslationFirstTimeGuideFragment iMTranslationFirstTimeGuideFragment2 = (IMTranslationFirstTimeGuideFragment) awS465S0200000_30.l1;
            Object objLJJ3 = interfaceC1680500tpg.LJJ();
            if (zLJII2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS558S0100000_14(iMTranslationFirstTimeGuideFragment2, 172);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
            }
            Function0 function02 = (Function0) objLJJ3;
            interfaceC1680500tpg.LJ();
            interfaceC1680500tpg.LJJIIJZLJL(5004770);
            boolean zLJII3 = interfaceC1680500tpg.LJII((View) awS465S0200000_30.l0);
            View view2 = (View) awS465S0200000_30.l0;
            Object objLJJ4 = interfaceC1680500tpg.LJJ();
            if (zLJII3 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS558S0100000_14(view2, 1072);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
            }
            interfaceC1680500tpg.LJ();
            C1666380tSu.LIZ(z, function1, strLJII, function0, function02, (Function0) objLJJ4, interfaceC1680500tpg, 48);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C20696015yg c20696015yg = (C20696015yg) awS465S0200000_30.l0;
            C1689580u4K.LIZ(c20696015yg, false, C13Z4.LIZJ(-524536141, new AwS492S0200000_31(c20696015yg, (PushSettingsLoginComposeFragment) awS465S0200000_30.l1, 1), interfaceC1680500tpg), interfaceC1680500tpg, 384, 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((ComposeView) awS465S0200000_30.l0).setViewCompositionStrategy(C20088213iq.LIZIZ);
            C1669670tYD.LJ((ComposeView) awS465S0200000_30.l0, EnumC1427810nG7.Auto, C13Z4.LIZJ(-1534007166, new AwS644S0100000_30((PushSettingsLoginComposeFragment) awS465S0200000_30.l1, 13), interfaceC1680500tpg));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            PushSettingsCommonComposeSubFragment pushSettingsCommonComposeSubFragment = (PushSettingsCommonComposeSubFragment) awS465S0200000_30.l0;
            PushSettingDynamicUI pushSettingDynamicUI = (PushSettingDynamicUI) awS465S0200000_30.l1;
            pushSettingsCommonComposeSubFragment.aS(pushSettingDynamicUI.title, pushSettingDynamicUI.pageLabel, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS465S0200000_30 r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r10 = r18
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
            X.1A8c r0 = X.C2174441A8c.LIZIZ
            int r0 = r0.LIZJ()
            java.lang.String r4 = X.C0MBB.LIZIZ(r0, r10)
            X.0tyA r11 = X.InterfaceC1685750ty9.LIZ
            r12 = 0
            r0 = 5
            float r13 = (float) r0
            r16 = 5
            r14 = r12
            r15 = r13
            X.0ty9 r5 = X.C1682520tsw.LJIIL(r11, r12, r13, r14, r15, r16)
            r6 = 0
            r3 = r17
            java.lang.Object r0 = r3.l0
            X.07vA r0 = (X.C2016607vA) r0
            kotlin.jvm.functions.Function1<X.07W3, kotlin.Unit> r1 = r0.LL
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r10.LJJIIJZLJL(r0)
            boolean r0 = r10.LJJIIJ(r1)
            java.lang.Object r2 = r3.l0
            X.07vA r2 = (X.C2016607vA) r2
            java.lang.Object r1 = r3.l1
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r8 = r10.LJJ()
            if (r0 != 0) goto L5e
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L68
        L5e:
            kotlin.jvm.internal.AwS404S0200000_3 r8 = new kotlin.jvm.internal.AwS404S0200000_3
            r0 = 18
            r8.<init>(r2, r1, r0)
            r10.LJJIJIIJI(r8)
        L68:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r10.LJ()
            r11 = 48
            r12 = 44
            r7 = r6
            r9 = r6
            X.C1673210tdv.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS465S0200000_30.invoke$8(kotlin.jvm.internal.AwS465S0200000_30, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS465S0200000_30 awS465S0200000_30, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor = (TakoDisclaimerDialogProcessor) awS465S0200000_30.l0;
        TakoEnterParams takoEnterParams = (TakoEnterParams) awS465S0200000_30.l1;
        String str = C747440TTq.LIZJ().confirmQuery;
        if (str == null) {
            str = "";
        }
        takoDisclaimerDialogProcessor.getClass();
        TakoDisclaimerDialogProcessor.LIZJ(false, takoEnterParams, str, iIntValue);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(C2016607vA c2016607vA, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2016607vA;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS465S0200000_30(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super InterfaceC20043013bY, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq2, C20042813bW c20042813bW) {
        super(2);
        this.$t = c20042813bW;
        this.l0 = interfaceC1631620sYq;
        this.l1 = interfaceC1631620sYq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS465S0200000_30(C20035813aO c20035813aO, C20035813aO<Object> c20035813aO2, Object obj) {
        super(2);
        this.$t = obj;
        this.l0 = c20035813aO;
        this.l1 = c20035813aO2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(C20043513bd c20043513bd, C20043613be c20043613be, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20043513bd;
        this.l1 = c20043613be;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(C20073413gS c20073413gS, AndroidContentCaptureManager androidContentCaptureManager, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20073413gS;
        this.l1 = androidContentCaptureManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(C20696015yg c20696015yg, PushSettingsLoginComposeFragment pushSettingsLoginComposeFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20696015yg;
        this.l1 = pushSettingsLoginComposeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(Activity activity, C14VI c14vi, int i) {
        super(2);
        this.$t = i;
        this.l0 = activity;
        this.l1 = c14vi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(View view, IMTranslationFirstTimeGuideFragment iMTranslationFirstTimeGuideFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = iMTranslationFirstTimeGuideFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(ComposeView composeView, PushSettingsLoginComposeFragment pushSettingsLoginComposeFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = composeView;
        this.l1 = pushSettingsLoginComposeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS465S0200000_30(WrappedComposition wrappedComposition, WrappedComposition wrappedComposition2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = wrappedComposition;
        this.l1 = wrappedComposition2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(PushSettingsCommonComposeSubFragment pushSettingsCommonComposeSubFragment, PushSettingDynamicUI pushSettingDynamicUI, int i) {
        super(2);
        this.$t = i;
        this.l0 = pushSettingsCommonComposeSubFragment;
        this.l1 = pushSettingDynamicUI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(TakoEnterParams takoEnterParams, C1863850ybP c1863850ybP, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoEnterParams;
        this.l1 = c1863850ybP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor, TakoEnterParams takoEnterParams, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoDisclaimerDialogProcessor;
        this.l1 = takoEnterParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS465S0200000_30(ArrayList arrayList, ArrayList<Option> arrayList2, C14XZ c14xz) {
        super(2);
        this.$t = c14xz;
        this.l0 = arrayList;
        this.l1 = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS465S0200000_30(j1 j1Var, AwS574S0100000_30 awS574S0100000_30, int i) {
        super(2);
        this.$t = i;
        this.l0 = j1Var;
        this.l1 = awS574S0100000_30;
    }
}
