package com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0CSD;
import X.C0CSE;
import X.C0PEM;
import X.C0PRC;
import X.C0R45;
import X.C1558520qew;
import X.C189200o6;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C23250099c;
import X.C2344009Gk;
import X.C640750PBh;
import X.C646370PWx;
import X.C650630PfZ;
import X.C660110Pur;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class Lemon8FakeAutoplayMobAssem extends ReusedUIContentAssem<Lemon8FakeAutoplayMobAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public Aweme LLJJJJ;
    public boolean LLJJJJJIL;
    public long LLJJL;
    public AnonymousClass0956 LLJL;
    public boolean LLJJJJLIIL = true;
    public final List<C0CSE> LLJJLIIIJLLLLLLLZ = new ArrayList();

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        ((ArrayList) this.LLJJLIIIJLLLLLLLZ).clear();
        try {
            C1558520qew.LJIIJ(this, SearchPlayerScope.class, SearchServiceCenter$AutoPlayAbility.class, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8FakeAutoplayMobAssem$loadAutoplayAbility$1
                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void LJJLIIIJLLLLLLLZ() {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean N1() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final View Vt() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void kC0(int i) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean mm() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void J0() {
                    if (!this.LL.LLJJJJJIL) {
                        Lemon8FakeAutoplayMobAssem lemon8FakeAutoplayMobAssem = this.LL;
                        if (lemon8FakeAutoplayMobAssem.LLJJJJLIIL) {
                            Aweme aweme = lemon8FakeAutoplayMobAssem.LLJJJJ;
                            if (aweme != null) {
                                C660110Pur c660110Pur = C660110Pur.LIZ;
                                ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(lemon8FakeAutoplayMobAssem), ISearchContextAbility.class);
                                c660110Pur.getClass();
                                C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
                                C646370PWx c646370PWx = (C646370PWx) iSearchContextAbility.wO2().LIZJ();
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("search_id", c0prc.LLILLL);
                                c2344009Gk.LJIIIIZZ("enter_from", c646370PWx.LLILLL);
                                c2344009Gk.LJIIIIZZ("search_keyword", c0prc.LLIZLLLIL);
                                c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
                                c2344009Gk.LJIIIIZZ("search_result_id", c646370PWx.LLJ);
                                c2344009Gk.LJIIIIZZ("search_type", "general");
                                c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                                c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                                c2344009Gk.LJIIIIZZ("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
                                c2344009Gk.LJIIIIZZ("virtual_play", "1");
                                c2344009Gk.LJIIIIZZ("pic_cnt", C660110Pur.LIZ(aweme));
                                c2344009Gk.LJ(c646370PWx.LLJILJIL, "universal_rank");
                                C20684815ws.LJIILLIIL("video_play", c2344009Gk.LIZ);
                            }
                            lemon8FakeAutoplayMobAssem.LLJJJJLIIL = false;
                        }
                        lemon8FakeAutoplayMobAssem.LLJJL = System.currentTimeMillis();
                        AnonymousClass0956 anonymousClass0956 = lemon8FakeAutoplayMobAssem.LLJL;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lemon8FakeAutoplayMobAssem);
                        C1DFH c1dfh = C0PEM.LIZ;
                        lemon8FakeAutoplayMobAssem.LLJL = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0CSD(lemon8FakeAutoplayMobAssem, null), 2);
                    }
                    this.LL.LLJJJJJIL = true;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void LLZZZZ() {
                    if (this.LL.LLJJJJJIL) {
                        Lemon8FakeAutoplayMobAssem lemon8FakeAutoplayMobAssem = this.LL;
                        AnonymousClass0956 anonymousClass0956 = lemon8FakeAutoplayMobAssem.LLJL;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        lemon8FakeAutoplayMobAssem.LLJL = null;
                        long jCurrentTimeMillis = System.currentTimeMillis() - lemon8FakeAutoplayMobAssem.LLJJL;
                        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(lemon8FakeAutoplayMobAssem), ISearchContextAbility.class);
                        Aweme aweme = lemon8FakeAutoplayMobAssem.LLJJJJ;
                        if (aweme != null) {
                            C660110Pur.LIZ.getClass();
                            C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
                            C646370PWx c646370PWx = (C646370PWx) iSearchContextAbility.wO2().LIZJ();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("search_id", c0prc.LLILLL);
                            c2344009Gk.LJIIIIZZ("enter_from", c646370PWx.LLILLL);
                            c2344009Gk.LJIIIIZZ("search_keyword", c0prc.LLIZLLLIL);
                            c2344009Gk.LJIIIIZZ("search_result_id", c646370PWx.LLJ);
                            c2344009Gk.LJIIIIZZ("search_type", c0prc.LLILLJJLI);
                            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                            c2344009Gk.LJIIIIZZ("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
                            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                            c2344009Gk.LJIIIIZZ("virtual_play", "1");
                            c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
                            c2344009Gk.LJIIIIZZ("pic_cnt", C660110Pur.LIZ(aweme));
                            c2344009Gk.LJ(c646370PWx.LLJILJIL, "universal_rank");
                            C20684815ws.LJIILLIIL("play_time", c2344009Gk.LIZ);
                            C0PRC c0prc2 = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
                            C646370PWx c646370PWx2 = (C646370PWx) iSearchContextAbility.wO2().LIZJ();
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LJIIIIZZ("search_id", c0prc2.LLILLL);
                            c2344009Gk2.LJIIIIZZ("enter_from", c646370PWx2.LLILLL);
                            c2344009Gk2.LJIIIIZZ("search_keyword", c0prc2.LLIZLLLIL);
                            c2344009Gk2.LJIIIIZZ("search_result_id", c646370PWx2.LLJ);
                            c2344009Gk2.LJIIIIZZ("search_type", c0prc2.LLILLJJLI);
                            c2344009Gk2.LJIIIIZZ("group_id", aweme.getAid());
                            c2344009Gk2.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                            c2344009Gk2.LJIIIIZZ("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
                            c2344009Gk2.LJIIIIZZ("virtual_play", "1");
                            c2344009Gk2.LIZJ(aweme.getAwemeType(), "aweme_type");
                            c2344009Gk2.LJIIIIZZ("pic_cnt", C660110Pur.LIZ(aweme));
                            c2344009Gk2.LIZLLL(jCurrentTimeMillis, "duration");
                            c2344009Gk2.LIZLLL(jCurrentTimeMillis, "play_duration");
                            c2344009Gk2.LJIIIIZZ("post_stay_duration", CardStruct.IStatusCode.DEFAULT);
                            C20684815ws.LJIILLIIL("post_stay_time", c2344009Gk2.LIZ);
                        }
                    }
                    this.LL.LLJJJJJIL = false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final View getDetectView() {
                    return this.LL.LJJIJL();
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean isPlaying() {
                    return this.LL.LLJJJJJIL;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void Mu(C650630PfZ c650630PfZ) {
                    ((ArrayList) this.LL.LLJJLIIIJLLLLLLLZ).remove(c650630PfZ);
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void wp(C650630PfZ c650630PfZ) {
                    ((ArrayList) this.LL.LLJJLIIIJLLLLLLLZ).add(c650630PfZ);
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                    function0.invoke();
                }
            }, SearchServiceCenter$AutoPlayAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 37));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        this.LLJJJJ = interfaceC435460H5s.getAweme();
        this.LLJJJJLIIL = true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
