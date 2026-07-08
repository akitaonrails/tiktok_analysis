package com.ss.android.ugc.aweme.ecommerce.search.suggest.vm;

import X.AnonymousClass0956;
import X.C09R9;
import X.C0PEM;
import X.C0QER;
import X.C0QWI;
import X.C0QWJ;
import X.C0QXL;
import X.C1223304qV;
import X.C1227904rF;
import X.C13LE;
import X.C13LP;
import X.C1AF0;
import X.C2107308Nj;
import X.C2296908zH;
import X.C23250099c;
import X.C671500QVo;
import X.C673250Qax;
import X.C673320Qb4;
import X.C673330Qb5;
import X.C673400QbC;
import X.C673420QbE;
import X.C673430QbF;
import X.C673550QbR;
import X.C673920Qc2;
import X.C673940Qc4;
import X.C674010QcB;
import X.EnumC673930Qc3;
import X.EnumC673970Qc7;
import X.EnumC673980Qc8;
import X.InterfaceC0148002o;
import X.InterfaceC673060Qae;
import X.InterfaceC736910SvR;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchSuggestViewModelNew extends AssemViewModel<C673550QbR> {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public C673420QbE LLILLJJLI;
    public C0QWI LLILLL;
    public C0QWJ LLILZ;
    public ISearchSuggestContextAbilityNew LLILZIL;
    public ISearchSuggestSubPageAbility LLILZLL;
    public ListenableFuture<MiddleCouponModel> LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C671500QVo.class));
    public boolean LLIZ = true;
    public boolean LLIZLLLIL = true;
    public int LLJ = -1;
    public String LLJI = "";

    public final void AQ2() {
        C0QER c0qer;
        C0QWJ c0qwj = this.LLILZ;
        if (EcSearchMiddlePitayaHelper.LIZIZ(c0qwj != null ? c0qwj.LIZ : null)) {
            EnumC673980Qc8 enumC673980Qc8 = EnumC673980Qc8.HISTORY_REQUEST;
            C0QWJ c0qwj2 = this.LLILZ;
            C673920Qc2 c673920Qc2LIZ = C674010QcB.LIZ(null, enumC673980Qc8, (c0qwj2 == null || (c0qer = c0qwj2.LIZ) == null) ? -100 : c0qer.getEcSearchEntranceValue(), EnumC673970Qc7.SEARCH);
            c673920Qc2LIZ.LIZ.LJFF = Long.valueOf(System.currentTimeMillis());
            c673920Qc2LIZ.LIZ.LJ = EnumC673930Qc3.PITAYA_START_TIME;
            c673920Qc2LIZ.LIZJ();
            AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJILJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C2107308Nj.LIZ.LLIILII().plus(C2296908zH.LIZ()), null, new C673330Qb5(this, c673920Qc2LIZ, null), 2);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C673550QbR(0);
    }

    public final C0QER v4() {
        C0QWJ c0qwj = this.LLILZ;
        if (c0qwj != null) {
            return c0qwj.LIZ;
        }
        return null;
    }

    public final InterfaceC736910SvR<InterfaceC673060Qae> zQ2() {
        return (InterfaceC736910SvR) this.LL.getValue();
    }

    public final void BQ2(SuggestWordResponse suggestWordResponse) {
        TypeWords typeWords;
        List<Word> list;
        Word word;
        if (suggestWordResponse != null) {
            try {
                List<TypeWords> list2 = suggestWordResponse.data;
                if (list2 != null && (typeWords = (TypeWords) C13LP.LJJJLL(list2)) != null && (list = typeWords.words) != null && (!list.isEmpty()) && (word = (Word) C13LP.LJJJLL(list)) != null) {
                    String str = suggestWordResponse.logId;
                    if (str == null) {
                        str = "";
                    }
                    word.setImplId(str);
                    setState(new AwS589S0100000_10(word, 82));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002d -> B:26:0x002e). Please report as a decompilation issue!!! */
    public final TemplateData yQ2(String str) {
        Map mapLIZIZ;
        String enterSearchFrom;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (str == null) {
            C0QXL.LIZ.getClass();
            mapLIZIZ = C0QXL.LIZIZ();
        } else {
            C1227904rF.LIZ.getClass();
            Object objLIZIZ = C1227904rF.LIZIZ(str, HashMap.class);
            if ((objLIZIZ instanceof Map) && (mapLIZIZ = (Map) objLIZIZ) != null) {
                C0QXL.LIZ.getClass();
                C0QXL.LIZJ(str, mapLIZIZ);
            } else {
                mapLIZIZ = null;
            }
        }
        try {
            TemplateData templateData = new TemplateData();
            templateData.LJIILIIL("newCustomerData", mapLIZIZ);
            C0QER c0qerV4 = v4();
            if (c0qerV4 != null) {
                enterSearchFrom = c0qerV4.getEnterSearchFrom();
            } else {
                enterSearchFrom = null;
            }
            templateData.LJIILIIL("enter_from", enterSearchFrom);
            if (C1223304qV.LIZ()) {
                templateData.LIZJ = "allSearchDataProcess";
                return templateData;
            }
            templateData.LIZJ = "newCustomerDataProcess";
            return templateData;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void wQ2(Map<String, Object> map, C673430QbF c673430QbF) {
        if (this.LLIZLLLIL) {
            C673940Qc4.LJFF(EnumC673970Qc7.SEARCH);
        }
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C673250Qax(this, map, System.currentTimeMillis(), c673430QbF, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: all -> 0x029a, TryCatch #1 {all -> 0x029a, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0010, B:8:0x001e, B:10:0x0026, B:11:0x002a, B:13:0x002e, B:14:0x0032, B:15:0x003e, B:17:0x0045, B:19:0x004b, B:21:0x0053, B:22:0x0055, B:23:0x005e, B:25:0x0064, B:27:0x006e, B:39:0x00ae, B:41:0x00bd, B:43:0x00c5, B:44:0x00c9, B:46:0x00cd, B:47:0x00d1, B:48:0x00ea, B:50:0x00ee, B:52:0x00f6, B:53:0x00fa, B:55:0x00fe, B:56:0x0102, B:57:0x010d, B:59:0x0113, B:61:0x0119, B:83:0x017b, B:88:0x018e, B:89:0x0190, B:93:0x0199, B:95:0x01a0, B:97:0x01a8, B:98:0x01ac, B:100:0x01b0, B:101:0x01b4, B:103:0x01c4, B:105:0x01c8, B:106:0x01cc, B:107:0x01d1, B:112:0x01e0, B:117:0x01ec, B:121:0x021c, B:123:0x0242, B:127:0x024c, B:129:0x025d, B:131:0x0272, B:132:0x0276, B:128:0x0254, B:69:0x012e, B:71:0x0133, B:75:0x013c, B:79:0x0172, B:82:0x0179, B:78:0x0167, B:28:0x007c, B:30:0x0082, B:32:0x0086, B:33:0x008a, B:35:0x0093, B:76:0x0155), top: B:140:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C673420QbE vQ2(boolean r28, long r29, X.C673430QbF r31) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew.vQ2(boolean, long, X.0QbF):X.0QbE");
    }

    public final TemplateData xQ2(long j, String str, boolean z) {
        Map<?, ?> map;
        int i;
        String enterSearchFrom;
        int i2;
        int i3;
        Object obj;
        Integer num;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2;
        C0QER c0qer;
        ECSearchEntranceData ecSearchEntranceData;
        C673320Qb4.LIZ.getClass();
        C673400QbC c673400QbC = C673320Qb4.LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJIILIIL = System.currentTimeMillis();
        }
        try {
            C1227904rF.LIZ.getClass();
            map = (Map) C1227904rF.LIZIZ(str, HashMap.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            map = null;
        }
        C0QER c0qerV4 = v4();
        boolean z2 = true;
        if (c0qerV4 != null && (ecSearchEntranceData = c0qerV4.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("disable_guess_strategy")) {
            i = 1;
        } else {
            i = 0;
        }
        C0QWJ c0qwj = this.LLILZ;
        if (c0qwj == null || (c0qer = c0qwj.LIZ) == null || (enterSearchFrom = c0qer.getEnterSearchFrom()) == null) {
            enterSearchFrom = "";
        }
        TemplateData templateData = new TemplateData();
        templateData.LJIILIIL("guess_request_time_millis", Long.valueOf(j));
        templateData.LJIILIIL("shouldDisableGuess", Integer.valueOf(i));
        templateData.LJIILIIL("isCachedSuggestWords", 0);
        templateData.LJIILIIL("enter_from", enterSearchFrom);
        if (map != null && !map.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        templateData.LJIILIIL("is_force", Integer.valueOf(i2));
        templateData.LJIILIIL("is_ecommerce_cache", Integer.valueOf(z ? 1 : 0));
        templateData.LJIILIIL("guessSearchData", map);
        ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility = this.LLILZLL;
        if (iSearchSuggestSubPageAbility != null && iSearchSuggestSubPageAbility.xq2()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        templateData.LJIILIIL("isFirstEnter", Integer.valueOf(i3));
        if (map != null) {
            obj = map.get("qrec_virtual_enable");
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, "1") && (iSearchSuggestContextAbilityNew2 = this.LLILZIL) != null) {
            iSearchSuggestContextAbilityNew2.yQ1(map);
        }
        if (z) {
            C673320Qb4 c673320Qb4 = C673320Qb4.LIZ;
            C673320Qb4.LJIJ();
        } else {
            C673320Qb4 c673320Qb42 = C673320Qb4.LIZ;
            C673320Qb4.LJIJI();
        }
        C0QWJ c0qwj2 = this.LLILZ;
        if (c0qwj2 != null && (num = c0qwj2.LIZLLL) != null && num.intValue() == 2 && (iSearchSuggestContextAbilityNew = this.LLILZIL) != null && iSearchSuggestContextAbilityNew.n90()) {
            templateData.LJIILIIL("is_from_outside", 1);
        }
        C673320Qb4 c673320Qb43 = C673320Qb4.LIZ;
        C673320Qb4.LJFF();
        try {
            if (C1223304qV.LIZ()) {
                templateData.LIZJ = "allSearchDataProcess";
            } else {
                templateData.LIZJ = "guessSearchDataProcess";
            }
            if (z) {
                z2 = false;
            }
            templateData.LJIILIIL("performance_params", C673320Qb4.LIZJ(Boolean.valueOf(z2)));
            return templateData;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
