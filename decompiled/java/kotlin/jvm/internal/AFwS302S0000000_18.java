package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.AnonymousClass0378;
import X.C01GW;
import X.C098200Yq;
import X.C09AY;
import X.C0H9S;
import X.C0PEM;
import X.C1163330gNX;
import X.C1175980ghw;
import X.C1176090gi7;
import X.C1180060goW;
import X.C1182570gsZ;
import X.C118300cf;
import X.C1189060h32;
import X.C1196340hEm;
import X.C1200050hKl;
import X.C1202300hOO;
import X.C1252710ihh;
import X.C12DM;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1741890vQh;
import X.C1841350y17;
import X.C1848410yCV;
import X.C189200o6;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2296808zG;
import X.C23250099c;
import X.C2341109Fh;
import X.C291001Au;
import X.C339190DRl;
import X.C343970De7;
import X.C417240GXq;
import X.C418440Gaw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1164480gPO;
import X.InterfaceC1164630gPd;
import Y.ACListenerS153S0100000_18;
import Y.ALAdapterS13S0200000_18;
import Y.ALAdapterS14S0100000_18;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import avg.f;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.common.selectitem.SelectItemFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.IBubbleListAssemAbility;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSearchAssemAbility;
import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSelectRootAssemAbility;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimListCellAssem;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesVM;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryAssem;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryVM;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiDetailNearbyV2MapTopViewAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.reviews.widget.PoiVideoCardWriteReviewEntranceAssem;
import com.ss.android.ugc.aweme.poi.transaction.PoiOrderAttributeMobHookExp;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import mf.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AFwS302S0000000_18 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(32);
    public final int $t;

    public static AFwS302S0000000_18 get$arr$(int i) {
        AFwS302S0000000_18 aFwS302S0000000_18 = (AFwS302S0000000_18) arr$.get(i);
        if (aFwS302S0000000_18 != null) {
            return aFwS302S0000000_18;
        }
        arr$.compareAndSet(i, null, new AFwS302S0000000_18(i));
        return (AFwS302S0000000_18) arr$.get(i);
    }

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS302S0000000_18(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        String string;
        UIAssem uIAssem = (UIAssem) obj;
        if (obj2 != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            Context context = uIAssem.getContext();
            if (context != null) {
                string = context.getString(2131834313);
            } else {
                string = null;
            }
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AFwS302S0000000_18 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS302S0000000_18.invoke$1(kotlin.jvm.internal.AFwS302S0000000_18, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AFwS302S0000000_18 r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS302S0000000_18.invoke$10(kotlin.jvm.internal.AFwS302S0000000_18, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        PoiVideoCardWriteReviewEntranceAssem poiVideoCardWriteReviewEntranceAssem = (PoiVideoCardWriteReviewEntranceAssem) obj;
        if (obj2 != null) {
            poiVideoCardWriteReviewEntranceAssem.LLJLL = false;
            if (poiVideoCardWriteReviewEntranceAssem.LJJIJL().getVisibility() == 0) {
                HandlerHook.viewRemoveCallbacks(poiVideoCardWriteReviewEntranceAssem.LJJIJL(), poiVideoCardWriteReviewEntranceAssem.LLJJLIIIJLLLLLLLZ);
                C339190DRl.LIZIZ(poiVideoCardWriteReviewEntranceAssem.LJJIJL());
                IBubbleListAssemAbility iBubbleListAssemAbilityEp = poiVideoCardWriteReviewEntranceAssem.ep();
                if (iBubbleListAssemAbilityEp != null) {
                    iBubbleListAssemAbilityEp.tt0(false);
                }
                poiVideoCardWriteReviewEntranceAssem.ip(true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        List<String> list;
        String str = (String) obj;
        JSONObject jSONObject = (JSONObject) obj2;
        C01GW c01gw = PoiOrderAttributeMobHookExp.LIZIZ;
        if (Intrinsics.LJFF(((PoiOrderAttributeMobHookExp.PoiOrderAttributeMobHookConfig) c01gw.getValue()).enable, Boolean.TRUE) && (list = ((PoiOrderAttributeMobHookExp.PoiOrderAttributeMobHookConfig) c01gw.getValue()).orderAttrEventList) != null && C13LP.LJJJJ(str, list)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1196340hEm(str, null, jSONObject), 3);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        C786410Ut5.LJLLLLLL(8, ((UIAssem) obj).LJJIJL());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        C786410Ut5.LJLLLLLL(8, ((UIAssem) obj).LJJIJL());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        C786410Ut5.LJLLLLLL(8, ((UIAssem) obj).LJJIJL());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        C786410Ut5.LJLLLLLL(8, ((UIAssem) obj).LJJIJL());
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        return Boolean.FALSE;
    }

    public static final Object invoke$18(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        String str;
        Object obj3;
        PoiCardCellData poiCardCellData;
        SlashCellModel slashCellModel;
        PoiCardCellData poiCardCellData2;
        C1175980ghw c1175980ghw = (C1175980ghw) obj2;
        Object obj4 = ((C1175980ghw) obj).LL.LLILLJJLI;
        String str2 = null;
        if ((obj4 instanceof PoiCardCellData) && (poiCardCellData2 = (PoiCardCellData) obj4) != null) {
            str = poiCardCellData2.poiId;
        } else {
            str = null;
        }
        if (c1175980ghw != null && (slashCellModel = c1175980ghw.LL) != null) {
            obj3 = slashCellModel.LLILLJJLI;
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof PoiCardCellData) && (poiCardCellData = (PoiCardCellData) obj3) != null) {
            str2 = poiCardCellData.poiId;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, str2));
    }

    public static final Object invoke$19(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if (obj2 != null) {
            IPoiClaimSelectRootAssemAbility iPoiClaimSelectRootAssemAbility = (IPoiClaimSelectRootAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IPoiClaimSelectRootAssemAbility.class, null);
            if (iPoiClaimSelectRootAssemAbility != null) {
                iPoiClaimSelectRootAssemAbility.uJ1(false);
            }
            IPoiClaimSearchAssemAbility iPoiClaimSearchAssemAbility = (IPoiClaimSearchAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IPoiClaimSearchAssemAbility.class, null);
            if (iPoiClaimSearchAssemAbility != null) {
                iPoiClaimSearchAssemAbility.LJLZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        com.ss.android.ugc.aweme.feed.assem.poireview.PoiVideoCardWriteReviewEntranceAssem poiVideoCardWriteReviewEntranceAssem = (com.ss.android.ugc.aweme.feed.assem.poireview.PoiVideoCardWriteReviewEntranceAssem) obj;
        if (obj2 != null) {
            poiVideoCardWriteReviewEntranceAssem.LLJLL = false;
            if (poiVideoCardWriteReviewEntranceAssem.LJJIJL().getVisibility() == 0) {
                HandlerHook.viewRemoveCallbacks(poiVideoCardWriteReviewEntranceAssem.LJJIJL(), poiVideoCardWriteReviewEntranceAssem.LLJJLIIIJLLLLLLLZ);
                C339190DRl.LIZIZ(poiVideoCardWriteReviewEntranceAssem.LJJIJL());
                IBubbleListAssemAbility iBubbleListAssemAbilityEp = poiVideoCardWriteReviewEntranceAssem.ep();
                if (iBubbleListAssemAbilityEp != null) {
                    iBubbleListAssemAbilityEp.tt0(false);
                }
                poiVideoCardWriteReviewEntranceAssem.ip(true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        String str;
        PoiData poiData;
        PoiClaimListCellAssem poiClaimListCellAssem = (PoiClaimListCellAssem) obj;
        PoiData poiData2 = (PoiData) obj2;
        C1841350y17 c1841350y17 = poiClaimListCellAssem.LLJLIL;
        if (c1841350y17 != null) {
            String str2 = null;
            if (poiData2 != null) {
                str = poiData2.poiId;
            } else {
                str = null;
            }
            C1200050hKl c1200050hKl = poiClaimListCellAssem.LLJLILLLLZIIL;
            if (c1200050hKl != null && (poiData = c1200050hKl.LL) != null) {
                str2 = poiData.poiId;
            }
            c1841350y17.setChecked(Intrinsics.LJFF(str, str2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        return Boolean.FALSE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$22(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$23(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$24(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$25(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$26(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$27(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$28(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        SelectItemFragment selectItemFragment;
        Object c098200Yq;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if (obj2 != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
            InterfaceC1164480gPO interfaceC1164480gPO = null;
            if ((fragmentLJI instanceof SelectItemFragment) && (selectItemFragment = (SelectItemFragment) fragmentLJI) != null) {
                try {
                    selectItemFragment.LLILZLL.invoke((Object) obj2);
                    C1163330gNX<T> c1163330gNX = selectItemFragment.LLILZIL;
                    if (c1163330gNX != 0) {
                        interfaceC1164480gPO = c1163330gNX.LIZIZ;
                    }
                    if (!Intrinsics.LJFF(interfaceC1164480gPO, obj2)) {
                        selectItemFragment.LLIZLLLIL = "next";
                    }
                    String str = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(selectItemFragment, C343970De7.LIZ);
                    IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
                    String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj2);
                    if (strLJIIIIZZ == null) {
                        strLJIIIIZZ = "";
                    }
                    iEventCenterLIZ.LIZ("ec_address_region_select", strLJIIIIZZ);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LIZJ(thM5exceptionOrNullimpl);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$29(kotlin.jvm.internal.AFwS302S0000000_18 r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiDetailNearbyV2ListAssem r8 = (com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiDetailNearbyV2ListAssem) r8
            com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab r9 = (com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab) r9
            if (r9 == 0) goto L14
            java.util.List r0 = r9.getPoiList()
            r1 = 0
            r7 = 1
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEmpty()
            if (r0 != r7) goto L1e
        L14:
            X.15jv r0 = r8.LLJJJJJIL
            if (r0 == 0) goto L1b
            X.C339190DRl.LIZIZ(r0)
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1e:
            X.15jv r0 = r8.LLJJJJJIL
            if (r0 == 0) goto L25
            X.C339190DRl.LIZLLL(r0)
        L25:
            java.lang.String r0 = r9.getTabKey()
            if (r0 == 0) goto L31
            int r0 = r0.length()
            if (r0 != 0) goto L32
        L31:
            r1 = 1
        L32:
            r6 = 5
            if (r1 == 0) goto L89
            r5 = 5
        L36:
            java.util.List r0 = r9.getPoiList()
            if (r0 == 0) goto L1b
            java.util.List r1 = X.C13LP.LL(r0, r5)
            if (r1 == 0) goto L1b
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L51:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard r2 = (com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard) r2
            java.lang.Integer r0 = r2.getPoiCardDisplayStyle()
            if (r0 == 0) goto L80
            int r0 = r0.intValue()
            if (r0 != r7) goto L80
            if (r5 != r6) goto L77
            X.0gi2 r1 = new X.0gi2
            r0 = 50002(0xc352, float:7.0068E-41)
            r1.<init>(r0, r2)
        L73:
            r4.add(r1)
            goto L51
        L77:
            X.0gi2 r1 = new X.0gi2
            r0 = 50001(0xc351, float:7.0066E-41)
            r1.<init>(r0, r2)
            goto L73
        L80:
            X.0gi2 r1 = new X.0gi2
            r0 = 50003(0xc353, float:7.0069E-41)
            r1.<init>(r0, r2)
            goto L73
        L89:
            r5 = 3
            goto L36
        L8b:
            X.15jv r0 = r8.LLJJJJJIL
            if (r0 == 0) goto L1b
            X.15jK r1 = r0.getState()
            if (r1 == 0) goto L1b
            r0 = 0
            r1.LJIILL(r4, r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS302S0000000_18.invoke$29(kotlin.jvm.internal.AFwS302S0000000_18, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            c1389890mGx.LJIIIZ(((Number) c291001Au.LIZ).intValue());
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        PoiDetailNearbyV2MapTopViewAssem poiDetailNearbyV2MapTopViewAssem = (PoiDetailNearbyV2MapTopViewAssem) obj;
        Map map = (Map) obj2;
        Context context = poiDetailNearbyV2MapTopViewAssem.getContext();
        if (context != null && map != null) {
            for (View view : (ArrayList) poiDetailNearbyV2MapTopViewAssem.LLJL) {
                ViewGroup viewGroup = poiDetailNearbyV2MapTopViewAssem.LLJJJJJIL;
                if (viewGroup != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup);
                }
            }
            ((ArrayList) poiDetailNearbyV2MapTopViewAssem.LLJL).clear();
            ViewGroup viewGroup2 = poiDetailNearbyV2MapTopViewAssem.LLJJJJJIL;
            if (viewGroup2 != null) {
                C1180060goW.LJIILL(viewGroup2, new AwS227S0300000_18(poiDetailNearbyV2MapTopViewAssem, (PoiDetailNearbyV2MapTopViewAssem) map, (Map<Integer, PoiGeneralCard>) context, (Context) 30));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        Context context;
        PoiDetailNearbyV2MapTopViewAssem poiDetailNearbyV2MapTopViewAssem = (PoiDetailNearbyV2MapTopViewAssem) obj;
        C1176090gi7 c1176090gi7 = (C1176090gi7) obj2;
        String str = null;
        if (c1176090gi7 != null && c1176090gi7.centerPoi != null && (context = poiDetailNearbyV2MapTopViewAssem.getContext()) != null && !poiDetailNearbyV2MapTopViewAssem.LLJJLIIIJLLLLLLLZ) {
            C0H9S c0h9s = new C0H9S(context);
            if (c1176090gi7 != null) {
                str = c1176090gi7.poiName;
            }
            if (str != null && str.length() != 0) {
                C417240GXq c417240GXq = c0h9s.LL;
                if (c417240GXq != null) {
                    C339190DRl.LIZLLL(c417240GXq);
                }
                C417240GXq c417240GXq2 = c0h9s.LL;
                if (c417240GXq2 != null) {
                    c417240GXq2.setText(str);
                }
                C417240GXq c417240GXq3 = c0h9s.LL;
                if (c417240GXq3 != null) {
                    if (C960203pA.LIZIZ(c417240GXq3.getContext())) {
                        c417240GXq3.LLJJJJLIIL = false;
                    } else {
                        c417240GXq3.LLJJJJLIIL = true;
                    }
                    c417240GXq3.invalidate();
                }
            } else {
                C417240GXq c417240GXq4 = c0h9s.LL;
                if (c417240GXq4 != null) {
                    C339190DRl.LIZIZ(c417240GXq4);
                }
            }
            View.OnClickListener aCListenerS153S0100000_18 = new ACListenerS153S0100000_18(poiDetailNearbyV2MapTopViewAssem, 194);
            if (C1848410yCV.LIZ) {
                aCListenerS153S0100000_18 = new f(aCListenerS153S0100000_18);
            }
            a aVar = new a(aCListenerS153S0100000_18);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c0h9s);
            }
            c0h9s.setOnClickListener(aVar);
            ViewGroup viewGroup = poiDetailNearbyV2MapTopViewAssem.LLJJJJJIL;
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                viewGroup.addView(c0h9s, layoutParams);
            }
            poiDetailNearbyV2MapTopViewAssem.LLJJLIIIJLLLLLLLZ = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            if (((Boolean) c291001Au.LIZ).booleanValue()) {
                ((InterfaceC1164630gPd) C1252710ihh.LIZ(abstractC738140SxQ, C13LE.LIZ(InterfaceC1164630gPd.class), null)).LLJJJJJIL();
            } else {
                ((InterfaceC1164630gPd) C1252710ihh.LIZ(abstractC738140SxQ, C13LE.LIZ(InterfaceC1164630gPd.class), null)).rp();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            c1389890mGx.LJIIIZ(((Number) c291001Au.LIZ).intValue());
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        Object next;
        PoiRecommendDishesGalleryAssem poiRecommendDishesGalleryAssem = (PoiRecommendDishesGalleryAssem) obj;
        ArrayList arrayList = (ArrayList) obj2;
        PoiRecommendDishesGalleryVM poiRecommendDishesGalleryVMTp = poiRecommendDishesGalleryAssem.tp();
        PoiDetailApi.RecommendedDish recommendedDish = ((C1182570gsZ) poiRecommendDishesGalleryVMTp.getState()).LL;
        if (recommendedDish != null && arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((PoiDetailApi.RecommendedDish) next).getDishId(), recommendedDish.getDishId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PoiDetailApi.RecommendedDish recommendedDish2 = (PoiDetailApi.RecommendedDish) next;
            if (recommendedDish2 != null) {
                poiRecommendDishesGalleryVMTp.setState(new AwS597S0100000_18(recommendedDish2, 728));
            }
        }
        PoiRecommendDishesVM poiRecommendDishesVMSp = poiRecommendDishesGalleryAssem.sp();
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(poiRecommendDishesGalleryAssem, 333);
        poiRecommendDishesVMSp.getClass();
        poiRecommendDishesVMSp.withState(new AwS384S0200000_18(poiRecommendDishesVMSp, (PoiRecommendDishesVM) awS597S0100000_18, (Function1<? super PoiDetailApi.RecommendedDish, Unit>) 186));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        C1202300hOO c1202300hOO;
        CharSequence charSequence;
        long jAbs;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY3;
        ViewPropertyAnimator duration4;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator viewPropertyAnimatorAnimate4;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY4;
        ViewPropertyAnimator duration5;
        ViewPropertyAnimator viewPropertyAnimatorAnimate5;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration6;
        PoiRecommendDishesGalleryAssem poiRecommendDishesGalleryAssem = (PoiRecommendDishesGalleryAssem) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C1202300hOO c1202300hOO2 = poiRecommendDishesGalleryAssem.LLJLLIL;
        if ((c1202300hOO2 == null || zBooleanValue != c1202300hOO2.getExpanded()) && (c1202300hOO = poiRecommendDishesGalleryAssem.LLJLLIL) != null && c1202300hOO.LLJZIJLIL) {
            if (Intrinsics.LJFF(c1202300hOO.LLJJJJJIL, c1202300hOO.LLLFZ)) {
                c1202300hOO.LLJLLL = !c1202300hOO.LLJLLL;
                jAbs = 0;
            } else {
                int height = c1202300hOO.getHeight();
                CharSequence charSequence2 = c1202300hOO.LLLI;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    c1202300hOO.LLLI = c1202300hOO.LLJJJJJIL;
                }
                if (c1202300hOO.LLJLLL) {
                    charSequence = c1202300hOO.LLLI;
                } else {
                    charSequence = c1202300hOO.LLLFZ;
                }
                c1202300hOO.setText(charSequence);
                c1202300hOO.measure(View.MeasureSpec.makeMeasureSpec(c1202300hOO.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c1202300hOO.getHeight(), 0));
                int measuredHeight = c1202300hOO.getMeasuredHeight();
                Animator animator = c1202300hOO.LLLF;
                if (animator != null) {
                    animator.cancel();
                }
                jAbs = ((long) Math.abs(measuredHeight - height)) * 2;
                if (jAbs > 300) {
                    jAbs = 300;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, measuredHeight);
                valueAnimatorOfInt.setInterpolator(new C12DM());
                valueAnimatorOfInt.setDuration(jAbs);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(c1202300hOO, 192));
                valueAnimatorOfInt.addListener(new ALAdapterS14S0100000_18(c1202300hOO, 13));
                valueAnimatorOfInt.start();
                c1202300hOO.LLLF = valueAnimatorOfInt;
            }
            if (zBooleanValue) {
                View view = poiRecommendDishesGalleryAssem.LLJZIJLIL;
                if (view != null && view.getVisibility() == 8) {
                    View view2 = poiRecommendDishesGalleryAssem.LLJZIJLIL;
                    if (view2 != null) {
                        C786410Ut5.T4(view2, 0.0f);
                    }
                    View view3 = poiRecommendDishesGalleryAssem.LLJZIJLIL;
                    if (view3 != null) {
                        C786410Ut5.ed(view3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)));
                    }
                    for (View view4 : poiRecommendDishesGalleryAssem.op()) {
                        if (view4 != null) {
                            C786410Ut5.ed(view4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)));
                        }
                    }
                    View view5 = poiRecommendDishesGalleryAssem.LLJZIJLIL;
                    if (view5 != null) {
                        C339190DRl.LIZLLL(view5);
                    }
                    C1202300hOO c1202300hOO3 = poiRecommendDishesGalleryAssem.LLJLLIL;
                    if (c1202300hOO3 != null) {
                        C1189060h32.LJJII(c1202300hOO3, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                    }
                    View view6 = poiRecommendDishesGalleryAssem.LLJZIJLIL;
                    if (view6 != null && (viewPropertyAnimatorAnimate5 = view6.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate5.alpha(1.0f)) != null && (duration6 = viewPropertyAnimatorAlpha2.setDuration(jAbs)) != null) {
                        duration6.start();
                    }
                    View view7 = poiRecommendDishesGalleryAssem.LLJZIJLIL;
                    if (view7 != null && (viewPropertyAnimatorAnimate4 = view7.animate()) != null && (viewPropertyAnimatorTranslationY4 = viewPropertyAnimatorAnimate4.translationY(0.0f)) != null && (duration5 = viewPropertyAnimatorTranslationY4.setDuration(jAbs)) != null) {
                        duration5.start();
                    }
                    for (View view8 : poiRecommendDishesGalleryAssem.op()) {
                        if (view8 != null && (viewPropertyAnimatorAnimate3 = view8.animate()) != null && (viewPropertyAnimatorTranslationY3 = viewPropertyAnimatorAnimate3.translationY(0.0f)) != null && (duration4 = viewPropertyAnimatorTranslationY3.setDuration(jAbs)) != null && (listener = duration4.setListener(null)) != null) {
                            listener.start();
                        }
                    }
                }
            } else {
                View view9 = poiRecommendDishesGalleryAssem.LLJZIJLIL;
                if (view9 != null && view9.getVisibility() == 0) {
                    View view10 = poiRecommendDishesGalleryAssem.LLJZIJLIL;
                    if (view10 != null && (viewPropertyAnimatorAnimate2 = view10.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate2.alpha(0.0f)) != null && (duration3 = viewPropertyAnimatorAlpha.setDuration(jAbs)) != null) {
                        duration3.start();
                    }
                    View view11 = poiRecommendDishesGalleryAssem.LLJZIJLIL;
                    if (view11 != null && (viewPropertyAnimatorAnimate = view11.animate()) != null && (viewPropertyAnimatorTranslationY2 = viewPropertyAnimatorAnimate.translationY(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)))) != null && (duration2 = viewPropertyAnimatorTranslationY2.setDuration(jAbs)) != null) {
                        duration2.start();
                    }
                    C118300cf c118300cf = new C118300cf();
                    for (View view12 : poiRecommendDishesGalleryAssem.op()) {
                        if (view12 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate6 = view12.animate();
                            if (viewPropertyAnimatorAnimate6 != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate6.translationY(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)))) != null && (duration = viewPropertyAnimatorTranslationY.setDuration(jAbs)) != null) {
                                duration.start();
                            }
                            ViewPropertyAnimator viewPropertyAnimatorAnimate7 = view12.animate();
                            if (viewPropertyAnimatorAnimate7 != null) {
                                viewPropertyAnimatorAnimate7.setListener(new ALAdapterS13S0200000_18(c118300cf, poiRecommendDishesGalleryAssem, 1));
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        ((PoiRecommendDishesGalleryAssem) obj).Bp(((Boolean) obj2).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS302S0000000_18 aFwS302S0000000_18, Object obj, Object obj2) {
        ((PoiRecommendDishesGalleryAssem) obj).Ep(((Number) obj2).longValue());
        return Unit.LIZ;
    }
}
