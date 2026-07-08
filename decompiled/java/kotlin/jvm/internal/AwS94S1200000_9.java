package kotlin.jvm.internal;

import X.AnonymousClass0956;
import X.C09AE;
import X.C09AY;
import X.C0DSB;
import X.C0LAB;
import X.C0N23;
import X.C0OBB;
import X.C0OU7;
import X.C0OUV;
import X.C0PEM;
import X.C0VL3;
import X.C1412630mrd;
import X.C1412660mrg;
import X.C1537720q7O;
import X.C1862330yYx;
import X.C19EG;
import X.C20235014Fo;
import X.C20656615sK;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C599010NeV;
import X.C599190Nen;
import X.C614740O9g;
import X.C621210OYd;
import X.C621370OYt;
import X.C628430Okr;
import X.C628480Okw;
import X.C633880Ote;
import X.C786410Ut5;
import X.EnumC1412640mre;
import X.InterfaceC497601wk;
import Y.ARunnableS9S1300000_9;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aweme.optimize.AwemeCacheNetworkInterceptor;
import com.ss.android.ugc.aweme.aweme.optimize.IAwemeCacheService;
import com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.state.ability.IState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AwS94S1200000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        Aweme aweme = (Aweme) obj;
        if (aweme.isUseAwemeCache()) {
            C0VL3 c0vl3LJ = ((IAwemeCacheService) ((AwemeCacheNetworkInterceptor) awS94S1200000_9.l1).LL.getValue()).LJ(awS94S1200000_9.s0, aweme.getAid());
            if (c0vl3LJ != null) {
                return c0vl3LJ.LIZJ;
            }
            return null;
        }
        ((List) awS94S1200000_9.l2).add(aweme);
        return aweme;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem = (BulletinBoardPageHybridAssem) awS94S1200000_9.l1;
        C786410Ut5.LJJZZIII(bulletinBoardPageHybridAssem.LLL, new ARunnableS9S1300000_9(bulletinBoardPageHybridAssem, (C1537720q7O) obj, (C0OU7) awS94S1200000_9.l2, awS94S1200000_9.s0, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        Set<C09AE> set = ((C599190Nen) awS94S1200000_9.l1).LIZJ.get(awS94S1200000_9.s0);
        if (set != null) {
            set.remove((C09AE) awS94S1200000_9.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        EnumC1412640mre enumC1412640mreLIZJ;
        boolean z = !((C628430Okr) obj).LL;
        ((TemplateFavoriteViewModel) awS94S1200000_9.l1).setState(new AwS24S0010000_9(z, 8));
        TemplateFavoriteViewModel templateFavoriteViewModel = (TemplateFavoriteViewModel) awS94S1200000_9.l1;
        String strLIZLLL = null;
        templateFavoriteViewModel.LLILZIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(templateFavoriteViewModel), C0PEM.LIZJ, null, new C628480Okw((TemplateFavoriteViewModel) awS94S1200000_9.l1, z, awS94S1200000_9.s0, (Fragment) awS94S1200000_9.l2, null), 2);
        String str = awS94S1200000_9.s0;
        Integer num = ((TemplateFavoriteViewModel) awS94S1200000_9.l1).LLILLL;
        C0LAB c0lab = new C0LAB();
        if (num != null && (enumC1412640mreLIZJ = C1412660mrg.LIZJ(num.intValue())) != null) {
            strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZJ);
        }
        c0lab.LJ("enter_from", "template_detail_page");
        c0lab.LIZ(z ? 1 : 0, "to_status");
        c0lab.LJ("tt_template_type", strLIZLLL);
        c0lab.LJ("tt_template_id", str);
        C20684815ws.LJIILLIIL("click_favorite_template", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        C633880Ote.LIZLLL = (C20656615sK) obj;
        SmartRouter.buildRoute((Activity) awS94S1200000_9.l1, awS94S1200000_9.s0).open();
        Function0 function0 = (Function0) awS94S1200000_9.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        Set<C09AE> set = ((C599010NeV) awS94S1200000_9.l1).LIZLLL.get(awS94S1200000_9.s0);
        if (set != null) {
            set.remove((C09AE) awS94S1200000_9.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C621210OYd c621210OYd = (C621210OYd) awS94S1200000_9.l1;
        String str = awS94S1200000_9.s0;
        c621210OYd.LIZLLL(str, c621210OYd.LJIIL(str), true);
        ((C621210OYd) awS94S1200000_9.l1).LJJIIJ = Float.valueOf(fFloatValue);
        long j = ((BulletinVoiceItem) awS94S1200000_9.l2).LLJI;
        long j2 = j - ((long) (j * fFloatValue));
        if (j2 < 0) {
            j2 = 0;
        }
        TuxTextView tuxTextView = ((C621210OYd) awS94S1200000_9.l1).LJIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(C621210OYd.LJI(j2));
        }
        C621370OYt c621370OYtLJIIJ = ((C621210OYd) awS94S1200000_9.l1).LJIIJ();
        if (c621370OYtLJIIJ != null) {
            String str2 = awS94S1200000_9.s0;
            BulletinVoiceItem bulletinVoiceItem = (BulletinVoiceItem) awS94S1200000_9.l2;
            if (c621370OYtLJIIJ.LIZIZ(str2)) {
                c621370OYtLJIIJ.LJIIIIZZ((int) (fFloatValue * bulletinVoiceItem.LLJI));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS94S1200000_9 awS94S1200000_9, Object obj) throws JSONException {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                    }
                } else {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    C0OBB c0obb = (C0OBB) awS94S1200000_9.l1;
                    String str = c0obb.LL;
                    String str2 = c0obb.LLIZ;
                    c1862330yYx.getClass();
                    C1862330yYx.LIZJ(str, str2, "close");
                }
                View view = ((C0OBB) awS94S1200000_9.l1).LLILZLL;
                if (view != null) {
                    C0DSB.LIZJ(view);
                }
                ((C0OBB) awS94S1200000_9.l1).LLJ.invoke(Boolean.FALSE);
                C2296808zG.LIZJ((InterfaceC497601wk) awS94S1200000_9.l2, null);
            } else {
                C1862330yYx c1862330yYx2 = C1862330yYx.LIZ;
                C0OBB c0obb2 = (C0OBB) awS94S1200000_9.l1;
                String str3 = c0obb2.LL;
                String str4 = c0obb2.LLIZ;
                c1862330yYx2.getClass();
                C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enter_from", str3);
                jSONObject.put("group_id", str4);
                c20235014Fo.LIZIZ("tikbot_screenshot_popup_show", jSONObject);
                View view2 = ((C0OBB) awS94S1200000_9.l1).LLILZLL;
                if (view2 != null) {
                    C0DSB.LIZIZ(view2);
                }
                ((C0OBB) awS94S1200000_9.l1).LLJ.invoke(Boolean.TRUE);
            }
        } else {
            C1862330yYx c1862330yYx3 = C1862330yYx.LIZ;
            C0OBB c0obb3 = (C0OBB) awS94S1200000_9.l1;
            String str5 = c0obb3.LL;
            String str6 = c0obb3.LLIZ;
            c1862330yYx3.getClass();
            C1862330yYx.LIZJ(str5, str6, "enter_chat");
            ((C0OBB) awS94S1200000_9.l1).LLJI.invoke(awS94S1200000_9.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        String aid;
        boolean zIsCollected;
        String str = awS94S1200000_9.s0;
        IState iState = (IState) ((TitlePanelBottomBarFavoriteVM) awS94S1200000_9.l1).LLILLL.getValue();
        Aweme aweme = (Aweme) awS94S1200000_9.l2;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = (Aweme) awS94S1200000_9.l2;
        if (aweme2 != null) {
            zIsCollected = AwemeExtKt.isCollected(aweme2);
        } else {
            zIsCollected = false;
        }
        boolean zBooleanValue = ((Boolean) iState.currentState(aid, Boolean.valueOf(zIsCollected))).booleanValue();
        obj.getClass();
        return new C614740O9g(str, zBooleanValue);
    }

    public static final Object invoke$8(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        Map map = (Map) obj;
        map.put("awemeId", ((Aweme) awS94S1200000_9.l1).getAid());
        map.put("measurableId", ((C0N23) awS94S1200000_9.l2).LIZ());
        map.put("awemeType", Integer.valueOf(((Aweme) awS94S1200000_9.l1).getAwemeType()));
        map.put("fetchFrom", awS94S1200000_9.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS94S1200000_9 awS94S1200000_9, Object obj) {
        Map map = (Map) obj;
        map.put("awemeId", ((Aweme) awS94S1200000_9.l1).getAid());
        map.put("measurableId", ((C0N23) awS94S1200000_9.l2).LIZ());
        map.put("awemeType", Integer.valueOf(((Aweme) awS94S1200000_9.l1).getAwemeType()));
        map.put("fetchFrom", awS94S1200000_9.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1200000_9(C0N23 c0n23, Aweme aweme, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aweme;
        this.l2 = c0n23;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1200000_9(C599010NeV c599010NeV, String str, AnonymousClass0956 anonymousClass0956, int i) {
        super(1);
        this.$t = i;
        this.l1 = c599010NeV;
        this.s0 = str;
        this.l2 = anonymousClass0956;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1200000_9(C599190Nen c599190Nen, String str, AnonymousClass0956 anonymousClass0956, int i) {
        super(1);
        this.$t = i;
        this.l1 = c599190Nen;
        this.s0 = str;
        this.l2 = anonymousClass0956;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1200000_9(C0OBB c0obb, String str, InterfaceC497601wk interfaceC497601wk, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0obb;
        this.s0 = str;
        this.l2 = interfaceC497601wk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS94S1200000_9(AwemeCacheNetworkInterceptor awemeCacheNetworkInterceptor, AwemeCacheNetworkInterceptor awemeCacheNetworkInterceptor2, String str, List<Aweme> list) {
        super(1);
        this.$t = list;
        this.l1 = awemeCacheNetworkInterceptor;
        this.s0 = awemeCacheNetworkInterceptor2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1200000_9(BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem, C0OUV c0ouv, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = bulletinBoardPageHybridAssem;
        this.l2 = c0ouv;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1200000_9(BulletinVoiceItem bulletinVoiceItem, C621210OYd c621210OYd, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c621210OYd;
        this.s0 = str;
        this.l2 = bulletinVoiceItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1200000_9(TemplateFavoriteViewModel templateFavoriteViewModel, String str, Fragment fragment, int i) {
        super(1);
        this.$t = i;
        this.l1 = templateFavoriteViewModel;
        this.s0 = str;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1200000_9(String str, TitlePanelBottomBarFavoriteVM titlePanelBottomBarFavoriteVM, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = titlePanelBottomBarFavoriteVM;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S1200000_9(AwS149S0101000_9 awS149S0101000_9, C19EG c19eg, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19eg;
        this.s0 = str;
        this.l2 = awS149S0101000_9;
    }
}
