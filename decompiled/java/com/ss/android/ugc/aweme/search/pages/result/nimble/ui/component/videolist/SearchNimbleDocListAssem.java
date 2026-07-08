package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist;

import X.AbstractC21673619ry;
import X.C06X8;
import X.C09U0;
import X.C0Q4Y;
import X.C0QBJ;
import X.C13BV;
import X.C13LE;
import X.C15438062q;
import X.C1558520qew;
import X.C1723500ux2;
import X.C1744700vVE;
import X.C1807670x8n;
import X.C20600815jK;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C444200HbO;
import X.C621830OaD;
import X.C640750PBh;
import X.C650630PfZ;
import X.C653450Pk7;
import X.C656290Poh;
import X.C685130Qu7;
import X.C724270Sb3;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC684740QtU;
import X.InterfaceC685060Qu0;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import com.ss.android.ugc.aweme.nimblecard.model.search.NimbleConfig;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.NestedAutoPlayCardAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.base.SearchDocItemCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimbleDocListAssem extends SearchNimbleBaseAssem<List<? extends Aweme>> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJZIJLIL;
    public C653450Pk7<Aweme> LLL;
    public final SearchNimbleDocListAssem$autoPlayAbility$1 LLLF = new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.SearchNimbleDocListAssem$autoPlayAbility$1
        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void J0() {
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void LJJLIIIJLLLLLLLZ() {
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void LLZZZZ() {
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void Mu(C650630PfZ c650630PfZ) {
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final boolean N1() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final View Vt() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final boolean isPlaying() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void kC0(int i) {
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final boolean mm() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void wp(C650630PfZ c650630PfZ) {
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final View getDetectView() {
            SearchNimbleDocListAssem searchNimbleDocListAssem = this.LL;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = searchNimbleDocListAssem.LLJZIJLIL;
            return viewOnAttachStateChangeListenerC20604515jv == null ? searchNimbleDocListAssem.getContentView() : viewOnAttachStateChangeListenerC20604515jv;
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
        public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
            LinearLayoutManager linearLayoutManager;
            function0.invoke();
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL.LLJZIJLIL;
            RecyclerView.LayoutManager layoutManager = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            }
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.scrollToPositionWithOffset(c640750PBh.LIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                return;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LL.LLJZIJLIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
                return;
            }
            viewOnAttachStateChangeListenerC20604515jv2.scrollToPosition(c640750PBh.LIZ);
        }
    };
    public volatile C09U0 LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchNimbleDocListAssem.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eyx;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLL = null;
        NestedAutoPlayCardAbility nestedAutoPlayCardAbility = (NestedAutoPlayCardAbility) C1558520qew.LIZ(LLIIJLIL(), NestedAutoPlayCardAbility.class, null);
        if (nestedAutoPlayCardAbility != null) {
            nestedAutoPlayCardAbility.Sn2(this.LLLF);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    public final List<? extends Aweme> tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((InterfaceC684740QtU) (c724270Sb3 != null ? c724270Sb3.LL : null)).getVideoList();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    /* JADX INFO: renamed from: Bp */
    public final void tp(InterfaceC685060Qu0 interfaceC685060Qu0) {
        super.tp(interfaceC685060Qu0);
        NestedAutoPlayCardAbility nestedAutoPlayCardAbility = (NestedAutoPlayCardAbility) C1558520qew.LIZ(LLIIJLIL(), NestedAutoPlayCardAbility.class, null);
        if (nestedAutoPlayCardAbility != null) {
            nestedAutoPlayCardAbility.ms0(this.LLLF);
        }
        if (interfaceC685060Qu0.LJJLI()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C621830OaD(this, interfaceC685060Qu0, null), 3);
        } else {
            Fp(interfaceC685060Qu0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public final void Fp(InterfaceC685060Qu0 interfaceC685060Qu0) {
        ?? SingletonList;
        Integer num;
        NimbleConfig nimbleConfig;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJZIJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter();
            if (adapter != null) {
                this.LLL = new C653450Pk7<>(adapter);
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C09U0 c09u0 = this.LLLFF;
            if (c09u0 == null) {
                synchronized (this) {
                    c09u0 = this.LLLFF;
                    if (c09u0 == null) {
                        c09u0 = (C09U0) C1807670x8n.p();
                        this.LLLFF = c09u0;
                    }
                }
            }
            C23250099c.LIZLLL(lifecycleScope, c09u0.LIZ, null, new C0QBJ(this, interfaceC685060Qu0, null), 2);
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
            if (state != null) {
                Template templateZp = zp();
                int iIntValue = 0;
                if (templateZp != null && (nimbleConfig = templateZp.config) != null && Intrinsics.LJFF(nimbleConfig.aggregatable, Boolean.TRUE)) {
                    List<Aweme> videoList = interfaceC685060Qu0.getVideoList();
                    SingletonList = new ArrayList(C15438062q.LJIJJ(videoList, 10));
                    Iterator<Aweme> it2 = videoList.iterator();
                    while (it2.hasNext()) {
                        SingletonList.add(new C656290Poh(it2.next(), zp(), Ap()));
                    }
                } else {
                    Template templateZp2 = zp();
                    if (templateZp2 != null && (num = templateZp2.index) != null) {
                        iIntValue = num.intValue();
                    }
                    Aweme aweme = (Aweme) C444200HbO.LIZ(iIntValue, interfaceC685060Qu0.getVideoList());
                    if (aweme == null || (SingletonList = Collections.singletonList(new C656290Poh(aweme, zp(), Ap()))) == 0) {
                        SingletonList = C13BV.INSTANCE;
                    }
                }
                state.LJIILL(SingletonList, null);
            }
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(interfaceC685060Qu0.LJJJZ());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iLIZ;
        int iFloatValue;
        Float f;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.tw2);
        this.LLJZIJLIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
            if (state != null) {
                state.LIZLLL = C0Q4Y.LATEST;
            }
            Template templateZp = zp();
            if (templateZp != null) {
                iLIZ = C685130Qu7.LIZ(templateZp, true, view.getContext());
            } else {
                iLIZ = 0;
            }
            NimbleConfig nimbleConfigSp = sp();
            if (nimbleConfigSp != null && (f = nimbleConfigSp.videoSizeRatio) != null && f.floatValue() > 0.0f) {
                iFloatValue = (int) (iLIZ / f.floatValue());
            } else {
                iFloatValue = 0;
            }
            C1744700vVE.LJIIIIZZ(iFloatValue, viewOnAttachStateChangeListenerC20604515jv);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(50101, SearchDocItemCell.class));
            viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(50102, SearchDocItemCell.class));
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C06X8(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))));
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, LLIIJLIL());
            viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    public final boolean op(List<? extends Aweme> list) {
        if (list != null && (!r3.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC685060Qu0 interfaceC685060Qu0) {
        tp(interfaceC685060Qu0);
    }
}
