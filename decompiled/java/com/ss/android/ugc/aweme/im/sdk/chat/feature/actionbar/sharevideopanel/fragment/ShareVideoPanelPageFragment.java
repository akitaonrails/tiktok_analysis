package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment;

import X.AbstractC1255880imo;
import X.AbstractC683590Qrd;
import X.C01GW;
import X.C098200Yq;
import X.C0DXR;
import X.C0I0B;
import X.C0P6P;
import X.C0XF1;
import X.C1212450hel;
import X.C1245520iW6;
import X.C1255920ims;
import X.C1259750it3;
import X.C1259760it4;
import X.C1259980itQ;
import X.C1264160j0A;
import X.C1389890mGx;
import X.C1519805xE;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19252910Tv;
import X.C19EG;
import X.C19GS;
import X.C1BWL;
import X.C369001c0;
import X.C418440Gaw;
import X.C452501pT;
import X.C729510SjV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1646906cd;
import X.InterfaceC1212360hec;
import X.InterfaceC1212460hem;
import X.InterfaceC1519705xD;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelPageFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.viewmodel.ShareVideoPanelViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ShareVideoPanelPageFragment extends BaseFragment implements InterfaceC1212360hec<Aweme>, C0P6P, InterfaceC1212460hem {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw3I2svIS4nZiMpKDsmOiBiKCwnISoiKy4hHELIOSZjYkKD02PiwoLCAjKSspJWE1OiQrJCo9PGsfIS4hLRMlLSo8GCQiLCMDKSIpDz0yLygpJzs=";
    public final boolean LLIZ;
    public int LLIZLLLIL;
    public C1749280vcc LLJ;
    public TuxSkeletonLayout LLJI;
    public RecyclerView LLJIJIL;
    public C1212450hel LLJILJIL;
    public C1259980itQ LLJILJILJ;
    public final C1722300uv6 LLJILLL;
    public final C1722300uv6 LLJJ;
    public final C01GW LLJJI;
    public Integer LLJJIII;
    public final C1259760it4 LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    public ShareVideoPanelPageFragment() {
        this(false);
    }

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<Aweme> list, boolean z) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        TuxSkeletonLayout tuxSkeletonLayout = this.LLJI;
        if (tuxSkeletonLayout != null) {
            WR(tuxSkeletonLayout, true);
        }
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        C1212450hel c1212450hel = this.LLJILJIL;
        if (c1212450hel != null) {
            Object[] objArr = new Object[6];
            objArr[0] = 4;
            objArr[1] = Boolean.TRUE;
            C0I0B c0i0b = C0I0B.LJFF;
            String curUserId = c0i0b.LIZ().getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            objArr[2] = curUserId;
            objArr[3] = Integer.valueOf(UR());
            objArr[4] = 7000;
            User currentUser = c0i0b.LIZ().getCurrentUser();
            objArr[5] = currentUser != null ? currentUser.getSecUid() : null;
            c1212450hel.LIZJ(objArr);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        TuxSkeletonLayout tuxSkeletonLayout = this.LLJI;
        if (tuxSkeletonLayout != null) {
            WR(tuxSkeletonLayout, false);
        }
        C1749280vcc c1749280vcc = this.LLJ;
        if (c1749280vcc != null) {
            c1749280vcc.setStatus(this.LLJILLL);
        }
    }

    public final int UR() {
        int i = this.LLIZLLLIL;
        if (i == EnumC1646906cd.LIKED.getType()) {
            return 1;
        }
        if (i == EnumC1646906cd.FAVORITE.getType()) {
            return 4;
        }
        return (i == EnumC1646906cd.YOURS.getType() || i != EnumC1646906cd.REPOSTED.getType()) ? 0 : 18;
    }

    public final int VR() {
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(this.LLJJIJI.LIZJ, 0);
    }

    public final void refresh() {
        C1212450hel c1212450hel = this.LLJILJIL;
        if (c1212450hel != null) {
            Object[] objArr = new Object[6];
            objArr[0] = 1;
            objArr[1] = Boolean.TRUE;
            C0I0B c0i0b = C0I0B.LJFF;
            String curUserId = c0i0b.LIZ().getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            objArr[2] = curUserId;
            objArr[3] = Integer.valueOf(UR());
            objArr[4] = Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT);
            User currentUser = c0i0b.LIZ().getCurrentUser();
            objArr[5] = currentUser != null ? currentUser.getSecUid() : null;
            c1212450hel.LIZJ(objArr);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        C1259980itQ c1259980itQ = this.LLJILJILJ;
        if (c1259980itQ != null) {
            c1259980itQ.showLoadMoreLoading();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ValueAnimator animator;
        super.onDestroyView();
        TuxSkeletonLayout tuxSkeletonLayout = this.LLJI;
        if (tuxSkeletonLayout != null && (animator = tuxSkeletonLayout.getAnimator()) != null) {
            animator.cancel();
        }
        C1212450hel c1212450hel = this.LLJILJIL;
        if (c1212450hel != null) {
            c1212450hel.LJIILJJIL();
            c1212450hel.LIZ();
        }
    }

    public ShareVideoPanelPageFragment(boolean z) {
        C1259760it4 c1259760it4;
        this.LLIZ = z;
        this.LLJILLL = new C1722300uv6();
        this.LLJJ = new C1722300uv6();
        this.LLJJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(255));
        if (C369001c0.LIZ() && !z) {
            c1259760it4 = new C1259760it4(R.layout.chu, R.layout.cpw, 2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), new StaggeredGridLayoutManager(2, 1));
        } else {
            c1259760it4 = new C1259760it4(R.layout.cht, R.layout.cpr, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), new GridLayoutManager(getContext(), 3));
        }
        this.LLJJIJI = c1259760it4;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1504));
    }

    public final List<Aweme> SR(List<Aweme> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                if (!C729510SjV.LJJIJIL(aweme2) && aweme2.getAwemeType() != 43 && aweme2.getAwemeType() != 41 && !AwemeExtKt.isPrivate(aweme2) && !AwemeExtKt.isDelete(aweme2)) {
                    arrayList.add(aweme);
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        TuxSkeletonLayout tuxSkeletonLayout = this.LLJI;
        if (tuxSkeletonLayout != null) {
            WR(tuxSkeletonLayout, false);
        }
        C1749280vcc c1749280vcc = this.LLJ;
        if (c1749280vcc != null) {
            C1264160j0A.LIZIZ(c1749280vcc, "share_video_panel_page", exc, new C1259750it3(this));
            C1519805xE c1519805xE = InterfaceC1519705xD.LIZ;
            Application applicationLIZ = C1BWL.LIZ();
            c1519805xE.getClass();
            if (!C0XF1.LIZLLL(applicationLIZ) && C0XF1.LIZIZ(C1BWL.LIZ())) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIIZ(2131829441);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        C1259980itQ c1259980itQ;
        RecyclerView recyclerView = this.LLJIJIL;
        if (recyclerView != null && (c1259980itQ = this.LLJILJILJ) != null) {
            c1259980itQ.showPullUpLoadMore(recyclerView, false);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        GridLayoutManager gridLayoutManager;
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.LLJIJIL;
        RecyclerView.LayoutManager layoutManager = null;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        }
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJ(VR());
            RecyclerView recyclerView2 = this.LLJIJIL;
            if (recyclerView2 != null) {
                recyclerView2.invalidateItemDecorations();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(new AwS598S0100000_19(this, 170));
    }

    @Override // X.InterfaceC1212460hem
    public final void rg(List<? extends Aweme> list) {
        int size;
        ShareVideoPanelViewModel shareVideoPanelViewModel = (ShareVideoPanelViewModel) this.LLJJIJIIJIL.getValue();
        int i = this.LLIZLLLIL;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        ArrayList arrayList = new ArrayList((Collection) shareVideoPanelViewModel.LLILLJJLI.getValue());
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((C1245520iW6) it2.next()).LIZIZ == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() >= 0) {
            int iIntValue = numValueOf.intValue();
            ListProtector.set(arrayList, iIntValue, new C1245520iW6(true, ((C1245520iW6) ListProtector.get(arrayList, iIntValue)).LIZIZ, size));
        }
        shareVideoPanelViewModel.LLILLJJLI.setValue(arrayList);
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        List<Aweme> listSR = SR(list);
        if (listSR != null && !listSR.isEmpty()) {
            TuxSkeletonLayout tuxSkeletonLayout = this.LLJI;
            if (tuxSkeletonLayout != null) {
                WR(tuxSkeletonLayout, false);
            }
            C1749280vcc c1749280vcc = this.LLJ;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            C1749280vcc c1749280vcc2 = this.LLJ;
            if (c1749280vcc2 != null) {
                c1749280vcc2.setStatus(this.LLJJ);
            }
            C1259980itQ c1259980itQ = this.LLJILJILJ;
            if (c1259980itQ != null) {
                c1259980itQ.setData(new ArrayList(listSR));
                if (z) {
                    c1259980itQ.setLoadMoreListener(this);
                    return;
                } else {
                    c1259980itQ.setLoadMoreListener((C0P6P) null);
                    c1259980itQ.setShowFooter(false);
                    return;
                }
            }
            return;
        }
        Ng1();
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        C1259980itQ c1259980itQ;
        List<Aweme> listSR = SR(list);
        if (listSR != null && !listSR.isEmpty() && (c1259980itQ = this.LLJILJILJ) != null) {
            c1259980itQ.setDataAfterLoadMore(new ArrayList(listSR));
            if (z) {
                c1259980itQ.resetLoadMoreState();
            } else {
                c1259980itQ.setLoadMoreListener((C0P6P) null);
                c1259980itQ.setShowFooter(false);
            }
        }
    }

    public final void WR(TuxSkeletonLayout tuxSkeletonLayout, boolean z) {
        if (z) {
            tuxSkeletonLayout.setPadding(tuxSkeletonLayout.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), tuxSkeletonLayout.getPaddingRight(), tuxSkeletonLayout.getPaddingBottom());
        } else {
            tuxSkeletonLayout.setPadding(tuxSkeletonLayout.getPaddingLeft(), 0, tuxSkeletonLayout.getPaddingRight(), tuxSkeletonLayout.getPaddingBottom());
        }
        tuxSkeletonLayout.setLoading(z);
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [X.0hel, X.0iur] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0itQ] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final String string;
        String string2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLIZLLLIL = arguments.getInt("panel_type");
            Bundle arguments2 = getArguments();
            Integer numValueOf = null;
            if (arguments2 != null) {
                string = arguments2.getString("conversation_id");
            } else {
                string = null;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                numValueOf = Integer.valueOf(arguments3.getInt("share_scene"));
            }
            this.LLJJIII = numValueOf;
            this.LLJ = (C1749280vcc) view.findViewById(R.id.v2w);
            TuxSkeletonLayout tuxSkeletonLayout = (TuxSkeletonLayout) view.findViewById(R.id.v2v);
            this.LLJI = tuxSkeletonLayout;
            if (tuxSkeletonLayout != null) {
                tuxSkeletonLayout.setPreviewItemRes(C19252910Tv.LIZIZ.LIZLLL().LJI().LLFFF(VR(), this.LLJJIJI.LIZIZ));
            }
            TuxSkeletonLayout tuxSkeletonLayout2 = this.LLJI;
            if (tuxSkeletonLayout2 != null) {
                tuxSkeletonLayout2.setAnimationDuration(800L);
            }
            if (C960203pA.LIZIZ(view.getContext())) {
                TuxSkeletonLayout tuxSkeletonLayout3 = this.LLJI;
                if (tuxSkeletonLayout3 != null) {
                    tuxSkeletonLayout3.setBackgroundResource(R.drawable.c9m);
                }
            } else {
                TuxSkeletonLayout tuxSkeletonLayout4 = this.LLJI;
                if (tuxSkeletonLayout4 != null) {
                    tuxSkeletonLayout4.setBackgroundResource(R.drawable.c9l);
                }
            }
            this.LLJIJIL = (RecyclerView) view.findViewById(R.id.v2u);
            final int i = this.LLIZLLLIL;
            final int i2 = this.LLJJIJI.LIZJ;
            final Integer num = this.LLJJIII;
            final boolean z = this.LLIZ;
            this.LLJILJILJ = new AbstractC683590Qrd<Aweme>(this, string, i, i2, num, z) { // from class: X.0itQ
                public final Fragment LL;
                public final String LLILLJJLI;
                public final int LLILLL;
                public final int LLILZ;
                public final Integer LLILZIL;
                public final boolean LLILZLL;

                @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
                public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                    C1259990itR c1259990itR;
                    Context context;
                    Activity activityLIZ;
                    super.onViewAttachedToWindow(viewHolder);
                    if ((viewHolder instanceof C1259990itR) && (c1259990itR = (C1259990itR) viewHolder) != null && (context = c1259990itR.itemView.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                        C487280J9a.LIZ(activityLIZ.hashCode(), c1259990itR);
                    }
                }

                @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
                public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                    C1259990itR c1259990itR;
                    super.onViewDetachedFromWindow(viewHolder);
                    if ((viewHolder instanceof C1259990itR) && (c1259990itR = (C1259990itR) viewHolder) != null) {
                        C487280J9a.LIZJ(c1259990itR);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:133:0x0317  */
                @Override // X.AbstractC438050HFr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r22, int r23) {
                    /*
                        Method dump skipped, instruction units count: 861
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1259980itQ.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
                }

                @Override // X.AbstractC438050HFr
                public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i3) {
                    if (C369001c0.LIZ() && !this.LLILZLL) {
                        return new C1260000itS(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ck_, viewGroup, false), this.LLILLJJLI, this.LL, this.LLILLL);
                    }
                    return new C1259990itR(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ck9, viewGroup, false), this.LLILLJJLI, this.LL, this.LLILLL, this.LLILZ, this.LLILZIL);
                }

                {
                    super(false);
                    this.LL = this;
                    this.LLILLJJLI = string;
                    this.LLILLL = i;
                    this.LLILZ = i2;
                    this.LLILZIL = num;
                    this.LLILZLL = z;
                }
            };
            AbstractC1255880imo<Aweme, ?> abstractC1255880imoCreateAwemeModel = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).createAwemeModel();
            if ((abstractC1255880imoCreateAwemeModel instanceof AbstractC1255880imo) && abstractC1255880imoCreateAwemeModel != null) {
                ?? r0 = new C1255920ims<AbstractC1255880imo<Aweme, FeedItemList>>(this) { // from class: X.0hel
                    public final InterfaceC1212460hem LLILZIL;

                    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
                    public final void onSuccess() {
                        super.onSuccess();
                        T t = this.LL;
                        if (((AbstractC1255880imo) t).mListQueryType == 1) {
                            this.LLILZIL.rg(((AbstractC1255880imo) t).getItems());
                        }
                    }

                    {
                        this.LLILZIL = this;
                    }

                    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
                    public final void onFailed(Exception exc) {
                        super.onFailed(exc);
                        if (((AbstractC1255880imo) this.LL).mListQueryType == 1) {
                            this.LLILZIL.rg(null);
                        }
                    }
                };
                r0.LJIIJ(abstractC1255880imoCreateAwemeModel);
                r0.LLILLJJLI = this;
                this.LLJILJIL = r0;
            }
            RecyclerView recyclerView = this.LLJIJIL;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(this.LLJJIJI.LJFF);
                recyclerView.setAdapter(this.LLJILJILJ);
                recyclerView.addItemDecoration(new C0DXR() { // from class: X.0it2
                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                        C21681819tI c21681819tI;
                        super.LIZIZ(rect, view2, recyclerView2, c21673919s1);
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                        if (childAdapterPosition < 0) {
                            return;
                        }
                        ShareVideoPanelPageFragment shareVideoPanelPageFragment = this.LL;
                        RecyclerView.LayoutManager layoutManager = shareVideoPanelPageFragment.LLJJIJI.LJFF;
                        if (layoutManager instanceof StaggeredGridLayoutManager) {
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
                                ShareVideoPanelPageFragment shareVideoPanelPageFragment2 = this.LL;
                                if ((c21681819tI.LIZ() + 1) % shareVideoPanelPageFragment2.VR() != 0) {
                                    rect.right = shareVideoPanelPageFragment2.LLJJIJI.LIZLLL;
                                }
                                if (childAdapterPosition < shareVideoPanelPageFragment2.VR()) {
                                    rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                }
                            }
                        } else if ((layoutManager instanceof GridLayoutManager) && (childAdapterPosition + 1) % shareVideoPanelPageFragment.VR() != 0) {
                            rect.right = this.LL.LLJJIJI.LIZLLL;
                        }
                        rect.bottom = this.LL.LLJJIJI.LJ;
                    }
                });
            }
            C1722300uv6 c1722300uv6 = this.LLJILLL;
            c1722300uv6.LJI = getString(2131824655);
            int i3 = this.LLIZLLLIL;
            if (i3 == EnumC1646906cd.LIKED.getType()) {
                string2 = getString(2131824656);
            } else if (i3 == EnumC1646906cd.FAVORITE.getType()) {
                string2 = getString(2131824654);
            } else if (i3 == EnumC1646906cd.YOURS.getType()) {
                string2 = getString(2131824657);
            } else if (i3 == EnumC1646906cd.REPOSTED.getType()) {
                string2 = getString(2131846380);
            } else {
                string2 = "";
            }
            c1722300uv6.LJIIIIZZ = string2;
            refresh();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, this.LLJJIJI.LIZ, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
