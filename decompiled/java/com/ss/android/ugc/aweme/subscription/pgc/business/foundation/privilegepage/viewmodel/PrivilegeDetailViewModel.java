package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel;

import X.AbstractC511870K5p;
import X.AbstractC511880K5q;
import X.AbstractC511920K5u;
import X.C00CC;
import X.C01GW;
import X.C0K5K;
import X.C0K5N;
import X.C0K5O;
import X.C0K5R;
import X.C0K5W;
import X.C0K5Y;
import X.C0K5Z;
import X.C0K7H;
import X.C0K7K;
import X.C0K7M;
import X.C0K7R;
import X.C0KL4;
import X.C0KLA;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C2097608Jq;
import X.C452501pT;
import X.C510480K0g;
import X.C511860K5o;
import X.C513470KBt;
import X.C844470XAv;
import X.EnumC510710K1d;
import X.EnumC513480KBu;
import Y.AComparatorS26S0000000_7;
import Y.AObserverS211S0100000_7;
import android.animation.Animator;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.google.gson.n;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.api.widget.PgcNextLiveData;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeDetailViewModel extends ViewModel {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final List<Object> LLIZ;
    public final LifecycleOwner LLIZLLLIL;
    public final EnumC510710K1d LLJ;
    public final String LLJI;
    public final PrivilegeRepository LLJIJIL;
    public final PgcNextLiveData<C0K7H> LLJILJIL;
    public final PgcNextLiveData<AbstractC511880K5q> LLJILJILJ;
    public final MediatorLiveData<AbstractC511870K5p> LLJILLL;
    public final PgcNextLiveData<List<C0K5K>> LLJJ;
    public final PgcNextLiveData<Integer> LLJJI;
    public final PgcNextLiveData<List<C510480K0g>> LLJJIII;
    public final PgcNextLiveData<List<C510480K0g>> LLJJIJI;
    public final PgcNextLiveData<Boolean> LLJJIJIIJIL;
    public List<SubPackagePrivilege> LLJJIJIL;
    public final PgcNextLiveData<String> LLJJJ;
    public final PgcNextLiveData<Map<String, List<PGCSubscriptionProductDetailWithTemplateInfo>>> LLJJJIL;
    public final PgcNextLiveData<Class<? extends C510480K0g>> LLJJJJ;
    public long LLJJJJJIL;
    public String LLJJJJLIIL;
    public long LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Animator LLJLL;
    public final C01GW LLJLLIL;
    public final C0K5O LLJLLL;
    public final C0K5N LLJZ;
    public final C0K5Y LLJZIJLIL;
    public C0K5R LLL;

    public final List<SubPackageSummary> AQ2() {
        List<SubPackagePrivilege> list = this.LLJJIJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SubPackagePrivilege> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().packageSummary);
        }
        if (!(!arrayList.isEmpty())) {
            return arrayList;
        }
        return C13LP.LJLIL(C13LP.LJLLLL(new AComparatorS26S0000000_7(2), C13LP.LJJJJIZL(arrayList, 1)), Collections.singletonList(C13LP.LJJJJZI(arrayList)));
    }

    public final List<PGCTemplateInfo> BQ2() {
        AbstractC511880K5q value = this.LLJILJILJ.getValue();
        if (value instanceof C511860K5o) {
            return ((C511860K5o) value).LIZ.templateList;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List, java.util.List<com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege>] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.13BV] */
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v18 java.util.List<X.0K0g>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void CQ2() {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel.CQ2():void");
    }

    public final void d() {
        this.LLJIJIL.LIZ(this.LL, this.LLILLL, true, this.LLJLLL, C2097608Jq.LJ(), this.LLILZ);
        DQ2(false, true);
    }

    public final SubPackagePrivilege vQ2() {
        Object obj;
        Iterator<SubPackagePrivilege> it2 = this.LLJJIJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SubPackagePrivilege next = it2.next();
            SubPackageSummary subPackageSummary = next.packageSummary;
            if (Intrinsics.LJFF(subPackageSummary != null ? subPackageSummary.id : null, this.LLJJJ.getValue())) {
                obj = next;
                break;
            }
        }
        return (SubPackagePrivilege) obj;
    }

    public final String wQ2() {
        PGCTemplateInfo pGCTemplateInfo;
        String value = this.LLJJJ.getValue();
        if (value != null && value.length() != 0) {
            return value;
        }
        List<PGCTemplateInfo> listBQ2 = BQ2();
        if (listBQ2 == null || (pGCTemplateInfo = (PGCTemplateInfo) C13LP.LJJJLL(listBQ2)) == null) {
            return null;
        }
        return pGCTemplateInfo.packageId;
    }

    public final PGCGetSubPrivilegeDetailResponse.Data zQ2() {
        C0K5W c0k5w;
        AbstractC511870K5p value = this.LLJILLL.getValue();
        if (!(value instanceof C0K5W) || (c0k5w = (C0K5W) value) == null) {
            return null;
        }
        return c0k5w.LIZLLL;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Animator animator = this.LLJLL;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String xQ2() {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel.xQ2():java.lang.String");
    }

    public final PGCTemplateInfo yQ2() {
        String strWQ2 = wQ2();
        List<PGCTemplateInfo> listBQ2 = BQ2();
        PGCTemplateInfo pGCTemplateInfo = null;
        if (listBQ2 == null) {
            return null;
        }
        Iterator<PGCTemplateInfo> it2 = listBQ2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PGCTemplateInfo next = it2.next();
            PGCTemplateInfo pGCTemplateInfo2 = next;
            if (Intrinsics.LJFF(pGCTemplateInfo2.packageId, strWQ2) && pGCTemplateInfo2.offerInfo != null) {
                pGCTemplateInfo = next;
                break;
            }
        }
        return pGCTemplateInfo;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.0K5P] */
    public final void DQ2(boolean z, boolean z2) {
        if (z) {
            ?? r5 = new Object() { // from class: X.0K5P
                public PGCTemplateListData LIZ;

                public final void LIZ(Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> map, PGCTemplateListData pGCTemplateListData) {
                    int i;
                    PGCTemplateInfo pGCTemplateInfo;
                    C0K5N c0k5n = this.LIZIZ.LLJZ;
                    PGCTemplateListData pGCTemplateListData2 = this.LIZ;
                    if (pGCTemplateListData2 != null) {
                        i = pGCTemplateListData2.subScenario;
                    } else {
                        i = 0;
                    }
                    if (pGCTemplateListData2 != null) {
                        pGCTemplateInfo = pGCTemplateListData2.activeContract;
                    } else {
                        pGCTemplateInfo = null;
                    }
                    c0k5n.LJFF(map, new C0KCK(pGCTemplateListData, false, i, pGCTemplateInfo, 112));
                }

                public final void LIZIZ(PGCTemplateListData pGCTemplateListData, C00CC<PGCTemplateListData> c00cc) {
                    this.LIZ = pGCTemplateListData;
                    PrivilegeDetailViewModel privilegeDetailViewModel = this.LIZIZ;
                    String str = c00cc.LIZJ;
                    if (str == null) {
                        str = "";
                    }
                    privilegeDetailViewModel.LLJJLIIIJLLLLLLLZ = str;
                    privilegeDetailViewModel.LLJLIL = true;
                    privilegeDetailViewModel.LLJZ.LIZLLL(0L, pGCTemplateListData);
                }
            };
            C0K7R c0k7rLIZJ = C513470KBt.LIZJ(this.LLILLJJLI, 0, EnumC513480KBu.PRIVILEGE_PAGE);
            if (c0k7rLIZJ != null) {
                Pair<C00CC<PGCTemplateListData>, PGCTemplateListData> pair = c0k7rLIZJ.LIZ;
                Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> map = c0k7rLIZJ.LIZIZ;
                if (pair != null) {
                    r5.LIZIZ(pair.getSecond(), pair.getFirst());
                    if (map != null) {
                        r5.LIZ(map, pair.getSecond());
                    }
                }
            }
        }
        this.LLJL = z2;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C0KLA c0kla = new C0KLA(this.LLILLJJLI, false, 0, "normal_sub", 0L, 0L, true, EnumC513480KBu.NORMAL_SUBSCRIPTION, null, contextLIZ, this.LLJZ, null, false, false, this.LLJI, this.LLILLL, 129328);
        C0KL4 c0kl4 = new C0KL4();
        c0kl4.LIZ();
        c0kl4.LJ(c0kla);
    }

    public final void EQ2(PGCGetSubPrivilegeDetailResponse.Data data, Function1<? super AbstractC511920K5u, Unit> function1) {
        C0K5R c0k5rLIZIZ;
        User user;
        if (this.LLL == null) {
            if (data != null && (user = data.anchorDetail) != null) {
                c0k5rLIZIZ = this.LLJZIJLIL.LIZIZ(user);
            } else {
                c0k5rLIZIZ = null;
            }
            this.LLL = c0k5rLIZIZ;
            if (c0k5rLIZIZ != null) {
                c0k5rLIZIZ.LIZ(this.LLIZLLLIL, function1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0K5O] */
    public PrivilegeDetailViewModel(long j, LifecycleOwner lifecycleOwner, EnumC510710K1d enumC510710K1d, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = j;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = list;
        this.LLIZLLLIL = lifecycleOwner;
        this.LLJ = enumC510710K1d;
        this.LLJI = str6;
        this.LLJIJIL = C0K7K.LIZ(this.LLILLJJLI, this.LLIZLLLIL);
        PgcNextLiveData<C0K7H> pgcNextLiveData = new PgcNextLiveData<>();
        this.LLJILJIL = pgcNextLiveData;
        PgcNextLiveData<AbstractC511880K5q> pgcNextLiveData2 = new PgcNextLiveData<>();
        this.LLJILJILJ = pgcNextLiveData2;
        MediatorLiveData<AbstractC511870K5p> mediatorLiveData = new MediatorLiveData<>();
        this.LLJILLL = mediatorLiveData;
        this.LLJJ = new PgcNextLiveData<>();
        this.LLJJI = new PgcNextLiveData<>();
        this.LLJJIII = new PgcNextLiveData<>();
        this.LLJJIJI = new PgcNextLiveData<>();
        this.LLJJIJIIJIL = new PgcNextLiveData<>();
        this.LLJJIJIL = C13BV.INSTANCE;
        this.LLJJJ = new PgcNextLiveData<>();
        new PgcNextLiveData();
        this.LLJJJIL = new PgcNextLiveData<>();
        this.LLJJJJ = new PgcNextLiveData<>();
        this.LLJJJJLIIL = "";
        this.LLJJLIIIJLLLLLLLZ = "";
        this.LLJLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 757));
        this.LLJILLL.observe(this.LLIZLLLIL, new Observer() { // from class: X.04jo
            @Override // androidx.lifecycle.Observer
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            }
        });
        mediatorLiveData.addSource(pgcNextLiveData, new AObserverS211S0100000_7(this, 73));
        mediatorLiveData.addSource(pgcNextLiveData2, new AObserverS211S0100000_7(this, 74));
        this.LLJLLL = new C0K7M() { // from class: X.0K5O
            @Override // X.C0K7M
            public final void Gs(DataResponse<n> dataResponse) {
                String logId;
                PrivilegeDetailViewModel privilegeDetailViewModel = this.LL;
                if (dataResponse != null) {
                    logId = dataResponse.getLogId();
                } else {
                    logId = "";
                }
                privilegeDetailViewModel.LLJJJJLIIL = logId;
            }

            @Override // X.C0K7M
            public final void he(C0K7C c0k7c) {
                this.LL.LLJILJIL.setValue(c0k7c);
            }

            @Override // X.C0K7M
            public final void oP(C0K7D c0k7d, boolean z) {
                PrivilegeDetailViewModel privilegeDetailViewModel = this.LL;
                privilegeDetailViewModel.LLJLILLLLZIIL = c0k7d.LIZIZ;
                privilegeDetailViewModel.LLJJL = System.currentTimeMillis();
                this.LL.LLJILJIL.setValue(c0k7d);
                if (!c0k7d.LIZ.templateList.isEmpty()) {
                    PGCTemplateListData pGCTemplateListData = new PGCTemplateListData();
                    pGCTemplateListData.templateList = c0k7d.LIZ.templateList;
                    this.LL.LLJILJILJ.setValue(new C511860K5o(pGCTemplateListData));
                }
                if (z) {
                    PrivilegeDetailViewModel privilegeDetailViewModel2 = this.LL;
                    privilegeDetailViewModel2.LLJIJIL.LIZ(privilegeDetailViewModel2.LL, privilegeDetailViewModel2.LLILLL, true, new C0K7M() { // from class: X.0K5X
                        @Override // X.C0K7M
                        public final void Gs(DataResponse<n> dataResponse) {
                        }

                        @Override // X.C0K7M
                        public final void he(C0K7C c0k7c) {
                        }

                        @Override // X.C0K7M
                        public final void oP(C0K7D c0k7d2, boolean z2) {
                        }
                    }, C2097608Jq.LJ(), privilegeDetailViewModel2.LLILZ);
                }
            }
        };
        this.LLJZ = new C0K5N(this);
        C0K5Y.LIZ.getClass();
        this.LLJZIJLIL = C0K5Z.LIZIZ.getValue();
    }
}
