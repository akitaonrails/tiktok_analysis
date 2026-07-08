package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel;

import X.AbstractC508870JxV;
import X.AbstractC509180Jy0;
import X.AbstractC509530JyZ;
import X.AbstractC510000JzK;
import X.C01GW;
import X.C0K9Q;
import X.C0KJX;
import X.C0KKG;
import X.C1161920gLG;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C176600m4;
import X.C452501pT;
import X.C470590Icr;
import X.C492290JSh;
import X.C495170JbP;
import X.C507480JvG;
import X.C507580JvQ;
import X.C507760Jvi;
import X.C508810JxP;
import X.C509070Jxp;
import X.C509090Jxr;
import X.C509150Jxx;
import X.C510070JzR;
import X.C510150JzZ;
import X.C513500KBw;
import X.EnumC507490JvH;
import X.EnumC513490KBv;
import X.InterfaceC510100JzU;
import android.animation.Animator;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePriceInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.repository.PrivilegeRepository;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.bytedance.android.livesdk.subscribe.model.PreCheckResult;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.NextLiveData;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;
import webcast.api.sub.Tip;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeDetailViewModel extends ViewModel {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final List<C495170JbP> LLIZ;
    public final LifecycleOwner LLIZLLLIL;
    public final EnumC507490JvH LLJ;
    public final PrivilegeRepository LLJI;
    public final NextLiveData<AbstractC510000JzK> LLJIJIL;
    public final NextLiveData<AbstractC509180Jy0> LLJILJIL;
    public final MediatorLiveData<AbstractC508870JxV> LLJILJILJ;
    public final NextLiveData<List<C507480JvG>> LLJILLL;
    public final NextLiveData<Integer> LLJJ;
    public final NextLiveData<List<C507580JvQ>> LLJJI;
    public final NextLiveData<List<C507580JvQ>> LLJJIII;
    public final NextLiveData<Boolean> LLJJIJI;
    public List<SubPackagePrivilege> LLJJIJIIJIL;
    public final NextLiveData<String> LLJJIJIL;
    public final NextLiveData<GetSubPrivilegeDetailResponse.Data.GiftSubscribePermission> LLJJJ;
    public final NextLiveData<Map<String, List<SubscriptionProductDetailWithTemplateInfo>>> LLJJJIL;
    public final NextLiveData<Class<? extends C507580JvQ>> LLJJJJ;
    public final NextLiveData<Tip> LLJJJJJIL;
    public long LLJJJJLIIL;
    public String LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public Animator LLJLLIL;
    public final C01GW LLJLLL;
    public final C509070Jxp LLJZ;
    public final C509090Jxr LLJZIJLIL;
    public final ISubscriptionStatusService LLL;
    public C492290JSh LLLF;

    public final List<SubPackageSummary> AQ2() {
        List<SubPackagePrivilege> list = this.LLJJIJIIJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SubPackagePrivilege> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().packageSummary);
        }
        if (!(!arrayList.isEmpty())) {
            return arrayList;
        }
        return C13LP.LJLIL(C13LP.LJLLLL(new Comparator() { // from class: X.0JxY
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                long j;
                SubPackagePriceInfo subPackagePriceInfo;
                SubPackagePriceInfo subPackagePriceInfo2;
                SubPackageSummary subPackageSummary = (SubPackageSummary) t;
                long j2 = Long.MAX_VALUE;
                if (subPackageSummary != null && (subPackagePriceInfo2 = subPackageSummary.priceInfo) != null) {
                    j = subPackagePriceInfo2.usdPriceAmountMicros;
                } else {
                    j = Long.MAX_VALUE;
                }
                Long lValueOf = Long.valueOf(j);
                SubPackageSummary subPackageSummary2 = (SubPackageSummary) t2;
                if (subPackageSummary2 != null && (subPackagePriceInfo = subPackageSummary2.priceInfo) != null) {
                    j2 = subPackagePriceInfo.usdPriceAmountMicros;
                }
                return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
            }
        }, C13LP.LJJJJIZL(arrayList, 1)), Collections.singletonList(C13LP.LJJJJZI(arrayList)));
    }

    public final List<TemplateInfo> BQ2() {
        AbstractC509180Jy0 value = this.LLJILJIL.getValue();
        if (value instanceof C509150Jxx) {
            return ((C509150Jxx) value).LIZ.templateList;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, java.util.List<com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege>] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v16 java.util.List<X.0JvQ>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void CQ2() {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel.CQ2():void");
    }

    public final SubPackagePrivilege vQ2() {
        Object obj;
        Iterator<SubPackagePrivilege> it2 = this.LLJJIJIIJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SubPackagePrivilege next = it2.next();
            SubPackageSummary subPackageSummary = next.packageSummary;
            if (Intrinsics.LJFF(subPackageSummary != null ? subPackageSummary.id : null, this.LLJJIJIL.getValue())) {
                obj = next;
                break;
            }
        }
        return (SubPackagePrivilege) obj;
    }

    public final String wQ2() {
        TemplateInfo templateInfo;
        String value = this.LLJJIJIL.getValue();
        if (value != null && value.length() != 0) {
            return value;
        }
        List<TemplateInfo> listBQ2 = BQ2();
        if (listBQ2 == null || (templateInfo = (TemplateInfo) C13LP.LJJJLL(listBQ2)) == null) {
            return null;
        }
        return templateInfo.packageId;
    }

    public final GetSubPrivilegeDetailResponse.Data zQ2() {
        C508810JxP c508810JxP;
        AbstractC508870JxV value = this.LLJILJILJ.getValue();
        if (!(value instanceof C508810JxP) || (c508810JxP = (C508810JxP) value) == null) {
            return null;
        }
        return c508810JxP.LIZLLL;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Animator animator = this.LLJLLIL;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String xQ2() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel.xQ2():java.lang.String");
    }

    public final TemplateInfo yQ2() {
        String strWQ2 = wQ2();
        List<TemplateInfo> listBQ2 = BQ2();
        TemplateInfo templateInfo = null;
        if (listBQ2 == null) {
            return null;
        }
        Iterator<TemplateInfo> it2 = listBQ2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TemplateInfo next = it2.next();
            TemplateInfo templateInfo2 = next;
            if (Intrinsics.LJFF(templateInfo2.packageId, strWQ2) && templateInfo2.offerInfo != null) {
                templateInfo = next;
                break;
            }
        }
        return templateInfo;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.0Jxq] */
    public final void DQ2(boolean z, boolean z2) {
        if (z) {
            ?? r4 = new Object() { // from class: X.0Jxq
                public TemplateListData LIZ;

                public final void LIZ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map, TemplateListData templateListData) {
                    int i;
                    PreCheckResult preCheckResult;
                    C509090Jxr c509090Jxr = this.LIZIZ.LLJZIJLIL;
                    TemplateListData templateListData2 = this.LIZ;
                    if (templateListData2 != null) {
                        i = templateListData2.subScenario;
                    } else {
                        i = 0;
                    }
                    TemplateInfo templateInfo = null;
                    if (templateListData2 != null) {
                        templateInfo = templateListData2.activeContract;
                        preCheckResult = templateListData2.preCheckResult;
                    } else {
                        preCheckResult = null;
                    }
                    c509090Jxr.LJ(map, new C0KH1(templateListData, false, i, templateInfo, preCheckResult, null, 96));
                }

                public final void LIZIZ(TemplateListData templateListData, C470590Icr<TemplateListData> c470590Icr) {
                    this.LIZ = templateListData;
                    PrivilegeDetailViewModel privilegeDetailViewModel = this.LIZIZ;
                    privilegeDetailViewModel.LLJL = c470590Icr.LIZIZ;
                    privilegeDetailViewModel.LLJLILLLLZIIL = true;
                    privilegeDetailViewModel.LLJZIJLIL.LJFF(0L, templateListData);
                }
            };
            C510150JzZ c510150JzZLIZJ = C513500KBw.LIZJ(this.LLILLJJLI, 0, EnumC513490KBv.PRIVILEGE_PAGE);
            if (c510150JzZLIZJ != null) {
                Pair<C470590Icr<TemplateListData>, TemplateListData> pair = c510150JzZLIZJ.LIZ;
                Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map = c510150JzZLIZJ.LIZIZ;
                if (pair != null) {
                    r4.LIZIZ(pair.getSecond(), pair.getFirst());
                    if (map != null) {
                        r4.LIZ(map, pair.getSecond());
                    }
                }
            }
        }
        this.LLJLIL = z2;
        Context contextLIZ = C176600m4.LIZ();
        C0KJX c0kjx = new C0KJX(this.LLILLJJLI, false, 0, "normal_sub", 0L, 0L, true, EnumC513490KBv.NORMAL_SUBSCRIPTION, null, contextLIZ, this.LLJZIJLIL, null, false, 63792);
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Ae().getClass();
        C0KKG c0kkg = new C0KKG();
        c0kkg.LIZ();
        c0kkg.LJ(c0kjx);
    }

    public final void EQ2(Room room, GetSubPrivilegeDetailResponse.Data data, Function1<? super AbstractC509530JyZ, Unit> function1) {
        C492290JSh c492290JShRM2;
        User user;
        if (this.LLLF == null) {
            if (room == null || (c492290JShRM2 = this.LLL.fi2(room, this, this.LLIZLLLIL)) == null) {
                if (data != null && (user = data.anchorDetail) != null) {
                    c492290JShRM2 = this.LLL.rM2(user, this, this.LLIZLLLIL);
                } else {
                    c492290JShRM2 = null;
                }
            }
            this.LLLF = c492290JShRM2;
            if (c492290JShRM2 != null) {
                c492290JShRM2.LIZIZ(this.LLIZLLLIL, function1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0Jxp] */
    public PrivilegeDetailViewModel(long j, LifecycleOwner lifecycleOwner, EnumC507490JvH enumC507490JvH, String str, String str2, String str3, String str4, String str5, List list) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = j;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = list;
        this.LLIZLLLIL = lifecycleOwner;
        this.LLJ = enumC507490JvH;
        this.LLJI = C510070JzR.LIZ(this.LLILLJJLI, this.LLIZLLLIL);
        NextLiveData<AbstractC510000JzK> nextLiveData = new NextLiveData<>();
        this.LLJIJIL = nextLiveData;
        NextLiveData<AbstractC509180Jy0> nextLiveData2 = new NextLiveData<>();
        this.LLJILJIL = nextLiveData2;
        MediatorLiveData<AbstractC508870JxV> mediatorLiveData = new MediatorLiveData<>();
        this.LLJILJILJ = mediatorLiveData;
        this.LLJILLL = new NextLiveData<>();
        this.LLJJ = new NextLiveData<>();
        this.LLJJI = new NextLiveData<>();
        this.LLJJIII = new NextLiveData<>();
        this.LLJJIJI = new NextLiveData<>();
        this.LLJJIJIIJIL = C13BV.INSTANCE;
        this.LLJJIJIL = new NextLiveData<>();
        this.LLJJJ = new NextLiveData<>();
        this.LLJJJIL = new NextLiveData<>();
        this.LLJJJJ = new NextLiveData<>();
        this.LLJJJJJIL = new NextLiveData<>();
        this.LLJJL = "";
        this.LLJL = "";
        this.LLJLLL = C452501pT.LIZIZ(new C507760Jvi(this));
        this.LLJILJILJ.observe(this.LLIZLLLIL, new Observer() { // from class: X.04jl
            @Override // androidx.lifecycle.Observer
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            }
        });
        mediatorLiveData.addSource(nextLiveData, new Observer() { // from class: X.0Jxt
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.LL.CQ2();
            }
        });
        mediatorLiveData.addSource(nextLiveData2, new Observer() { // from class: X.0Jxu
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.LL.CQ2();
            }
        });
        this.LLJZ = new InterfaceC510100JzU() { // from class: X.0Jxp
            @Override // X.InterfaceC510100JzU
            public final void QP(C470590Icr<n> c470590Icr) {
                String str6;
                PrivilegeDetailViewModel privilegeDetailViewModel = this.LL;
                if (c470590Icr == null || (str6 = c470590Icr.LIZIZ) == null) {
                    str6 = "";
                }
                privilegeDetailViewModel.LLJJL = str6;
            }

            @Override // X.InterfaceC510100JzU
            public final void hj(C509160Jxy c509160Jxy) {
                this.LL.LLJIJIL.setValue(c509160Jxy);
            }

            @Override // X.InterfaceC510100JzU
            public final void yO(C509170Jxz c509170Jxz, boolean z) {
                PrivilegeDetailViewModel privilegeDetailViewModel = this.LL;
                privilegeDetailViewModel.LLJLL = c509170Jxz.LIZIZ;
                privilegeDetailViewModel.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
                this.LL.LLJIJIL.setValue(c509170Jxz);
                if (!c509170Jxz.LIZ.templateList.isEmpty()) {
                    TemplateListData templateListData = new TemplateListData();
                    templateListData.templateList = c509170Jxz.LIZ.templateList;
                    this.LL.LLJILJIL.setValue(new C509150Jxx(templateListData));
                }
                if (z) {
                    final PrivilegeDetailViewModel privilegeDetailViewModel2 = this.LL;
                    privilegeDetailViewModel2.LLJI.LIZ(privilegeDetailViewModel2.LL, true, privilegeDetailViewModel2.LLILLL, true, new InterfaceC510100JzU() { // from class: X.0Jxo
                        @Override // X.InterfaceC510100JzU
                        public final void QP(C470590Icr<n> c470590Icr) {
                        }

                        @Override // X.InterfaceC510100JzU
                        public final void hj(C509160Jxy c509160Jxy) {
                        }

                        @Override // X.InterfaceC510100JzU
                        public final void yO(C509170Jxz c509170Jxz2, boolean z2) {
                            NextLiveData<GetSubPrivilegeDetailResponse.Data.GiftSubscribePermission> nextLiveData3 = privilegeDetailViewModel2.LLJJJ;
                            if (nextLiveData3 != null) {
                                nextLiveData3.setValue(c509170Jxz2.LIZ.giftSubscribePermission);
                            }
                        }
                    }, C2097608Jq.LJ(), privilegeDetailViewModel2.LLILZ);
                }
            }
        };
        this.LLJZIJLIL = new C509090Jxr(this);
        ISubscriptionStatusService.LJIIIZ.getClass();
        this.LLL = C0K9Q.LIZ();
    }
}
