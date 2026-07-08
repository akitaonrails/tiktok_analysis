package com.ss.android.ugc.aweme.setting.page.privacy;

import X.AbstractC1255880imo;
import X.AbstractC683590Qrd;
import X.C0OM1;
import X.C0P6P;
import X.C1237450iJ5;
import X.C1255920ims;
import X.C1308910kAL;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19EG;
import X.C419910GdJ;
import X.C665740Q9k;
import X.C684290Qsl;
import X.C684300Qsm;
import X.C684310Qsn;
import X.C786410Ut5;
import X.InterfaceC1212360hec;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.setting.adapter.BlackHolder;
import com.ss.android.ugc.aweme.setting.model.BlackList;
import com.ss.android.ugc.aweme.setting.model.UserWithBlockSource;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC836760Ws6
public final class BlackListPage extends BasePage implements InterfaceC1212360hec<UserWithBlockSource>, C0P6P {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6HELIOSJiJiOS40LWs8OyYlKSY1Zw0/KSYnBSYgPBUtLio=";
    public C1749280vcc LLJ;
    public RecyclerView LLJI;
    public C684290Qsl LLJIJIL;
    public C684300Qsm LLJILJIL;

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f5u;
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<UserWithBlockSource> list, boolean z) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        LIZJ(4);
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        AbstractC1255880imo abstractC1255880imo;
        AbstractC1255880imo abstractC1255880imo2;
        C684290Qsl c684290Qsl = this.LLJIJIL;
        if (c684290Qsl != null) {
            C684300Qsm c684300Qsm = this.LLJILJIL;
            c684290Qsl.setData((c684300Qsm == null || (abstractC1255880imo2 = (AbstractC1255880imo) c684300Qsm.LL) == null) ? null : abstractC1255880imo2.getItems());
        }
        C684300Qsm c684300Qsm2 = this.LLJILJIL;
        if (c684300Qsm2 != null && (abstractC1255880imo = (AbstractC1255880imo) c684300Qsm2.LL) != null && abstractC1255880imo.isHasMore()) {
            C786410Ut5.LLLZLZ(ZR(), 8);
            return;
        }
        C684290Qsl c684290Qsl2 = this.LLJIJIL;
        if (c684290Qsl2.mShowFooter) {
            c684290Qsl2.setShowFooter(false);
            notifyDataSetChanged();
            showLoadMoreEmpty();
        }
        C786410Ut5.LLLZLZ(ZR(), 0);
        if (isAdded()) {
            C1749280vcc c1749280vccZR = ZR();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_person;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJI = getString(2131827611);
            c1749280vccZR.setStatus(c1722300uv6);
        }
    }

    public final C1749280vcc ZR() {
        C1749280vcc c1749280vcc = this.LLJ;
        if (c1749280vcc != null) {
            return c1749280vcc;
        }
        return null;
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        showLoadMoreLoading();
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        C786410Ut5.LLLZLZ(ZR(), 0);
        ZR().LJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C684290Qsl c684290Qsl = this.LLJIJIL;
        if (c684290Qsl != null) {
            c684290Qsl.resetLoadMoreState();
        }
        LIZJ(1);
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        C684290Qsl c684290Qsl = this.LLJIJIL;
        if (c684290Qsl.mShowFooter) {
            c684290Qsl.setShowFooter(false);
            notifyDataSetChanged();
        }
        C786410Ut5.LLLZLZ(ZR(), 0);
        C1749280vcc c1749280vccZR = ZR();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new AwS554S0100000_10(this, 844));
        c1749280vccZR.setStatus(c1722300uv6);
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        showLoadMoreError();
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<UserWithBlockSource> list, boolean z) {
        setShowFooter(true);
        if (!z) {
            showLoadMoreEmpty();
        } else {
            resetLoadMoreState();
        }
        C684290Qsl c684290Qsl = this.LLJIJIL;
        if (c684290Qsl != null) {
            c684290Qsl.setData(new ArrayList(list));
        }
        C786410Ut5.LLLZLZ(ZR(), 8);
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<UserWithBlockSource> list, boolean z) {
        ArrayList arrayList;
        if (!z) {
            if (list != null && !list.isEmpty()) {
                showLoadMoreEmpty();
            } else {
                Ng1();
                return;
            }
        } else {
            resetLoadMoreState();
        }
        C684290Qsl c684290Qsl = this.LLJIJIL;
        if (c684290Qsl != null) {
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            c684290Qsl.setDataAfterLoadMore(arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.0Qsm, X.0iur] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Qsl] */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        this.LLJ = (C1749280vcc) view.findViewById(R.id.c2u);
        this.LLJI = (RecyclerView) view.findViewById(R.id.c2t);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("merged_blocked_accounts")) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        if (TextUtils.equals("1", string)) {
            C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.c3t), 0);
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y1z);
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, getString(2131845132), new AwS554S0100000_10(this, 843));
        tuxNavBar.setNavActions(c0om1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, view.getContext());
        RecyclerView recyclerView = null;
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            view.setBackgroundColor(iIntValue);
            TuxNavBar tuxNavBar2 = (TuxNavBar) view.findViewById(R.id.y1z);
            tuxNavBar2.setNavBackground(iIntValue);
            tuxNavBar2.LJIIZILJ(false);
            RecyclerView recyclerView2 = this.LLJI;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.setBackgroundColor(iIntValue);
        }
        ?? r1 = new C1255920ims<C684310Qsn>() { // from class: X.0Qsm
            @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                super.onSuccess();
            }
        };
        this.LLJILJIL = r1;
        r1.LJIIJ(new AbstractC1255880imo<UserWithBlockSource, BlackList>() { // from class: X.0Qsn
            public int LL;
            public int LLILLJJLI;

            @Override // X.AbstractC1255880imo
            public final boolean needCheckEmptyForQueryType() {
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1255880imo
            public final List<UserWithBlockSource> getItems() {
                T t = this.mData;
                if (t == 0) {
                    return null;
                }
                return ((BlackList) t).LJ();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1255880imo
            public final boolean isHasMore() {
                T t = this.mData;
                return t != 0 && ((BlackList) t).hasMore;
            }

            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                if (objArr != null && objArr.length == 1) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.setting.model.BlackList] */
            @Override // X.AbstractC666100QAu
            public final void handleData(Object obj) {
                boolean z;
                ?? r5 = (BlackList) obj;
                if (r5 == 0 || this.LL >= r5.total || (C086I.LIZIZ(r5.blockList) && !r5.hasMore)) {
                    z = true;
                } else {
                    z = false;
                }
                this.mIsNewDataEmpty = z;
                int i = this.mListQueryType;
                if (i != 1) {
                    if (i == 4) {
                        if (r5 != 0 && C086I.LIZIZ(r5.blockList) && r5.hasMore) {
                            this.LLILLJJLI++;
                        } else {
                            this.LLILLJJLI = 0;
                            if (r5 != 0) {
                            }
                            if (this.mIsNewDataEmpty && this.LLILLJJLI < 3) {
                                ((BlackList) this.mData).blockList.addAll(r5.blockList);
                                ((BlackList) this.mData).hasMore = r5.hasMore;
                                this.LL = r5.index;
                                return;
                            }
                            ((BlackList) this.mData).hasMore = false;
                            return;
                        }
                        BlackList blackList = (BlackList) this.mData;
                        blackList.hotsoonFilteredCount = r5.hotsoonFilteredCount;
                        blackList.hotsoonHasMore = r5.hotsoonHasMore;
                        blackList.hotsoonText = r5.hotsoonText;
                        if (this.mIsNewDataEmpty) {
                        }
                        ((BlackList) this.mData).hasMore = false;
                        return;
                    }
                    return;
                }
                this.mData = r5;
                if (z) {
                    return;
                }
                this.LL = r5.index;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1255880imo
            public final void loadMoreList(Object... objArr) {
                int i = this.LL;
                BlackList blackList = (BlackList) this.mData;
                C1BVK.LIZIZ().LIZ(this.mHandler, new CallableC448001ok(this, i, blackList.hotsoonFilteredCount, blackList.hotsoonHasMore), 0);
            }

            @Override // X.AbstractC1255880imo
            public final void refreshList(Object... objArr) {
                C1BVK.LIZIZ().LIZ(this.mHandler, new CallableC448001ok(this, 0, 0, 0), 0);
            }
        });
        C684300Qsm c684300Qsm = this.LLJILJIL;
        if (c684300Qsm != null) {
            c684300Qsm.LLILLJJLI = this;
        }
        final C19EG activity = getActivity();
        final C684300Qsm c684300Qsm2 = this.LLJILJIL;
        this.LLJIJIL = new AbstractC683590Qrd<UserWithBlockSource>(activity, c684300Qsm2) { // from class: X.0Qsl
            public final Activity LL;
            public final C684300Qsm LLILLJJLI;

            @Override // X.AbstractC683510QrV, X.AbstractC438050HFr, X.AbstractC21673619ry
            public final int getItemCount() {
                return (C086I.LIZIZ(this.mmItems) && ((AbstractC1255880imo) this.LLILLJJLI.LL).isHasMore()) ? this.mShowFooter ? getBasicItemCount() + 1 : getBasicItemCount() : super.getItemCount();
            }

            {
                this.LL = activity;
                this.LLILLJJLI = c684300Qsm2;
                setLoadEmptyText(2131848665);
            }

            @Override // X.AbstractC438050HFr
            public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                boolean z;
                boolean z2;
                int i2;
                List<T> list = this.mmItems;
                Objects.requireNonNull(list);
                ((BlackHolder) viewHolder).bind((UserWithBlockSource) ListProtector.get(list, i));
                int basicItemCount = getBasicItemCount();
                View view2 = viewHolder.itemView;
                int i3 = 0;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == basicItemCount - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, view2.getContext());
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = numLIZJ2;
                if (z) {
                    float f = iLIZIZ;
                    c384050F3z.LJIIIIZZ = Float.valueOf(f);
                    c384050F3z.LJIIIZ = Float.valueOf(f);
                }
                if (z2) {
                    float f2 = iLIZIZ;
                    c384050F3z.LJIIJ = Float.valueOf(f2);
                    c384050F3z.LJIIJJI = Float.valueOf(f2);
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(view2.getContext())});
                layerDrawable.setLayerInset(0, iLIZIZ2, 0, iLIZIZ2, 0);
                view2.setBackground(layerDrawable);
                if (iLIZIZ2 > 0 && iLIZIZ3 > 0) {
                    if (z) {
                        i2 = iLIZIZ3;
                    } else {
                        i2 = 0;
                    }
                    if (z2) {
                        i3 = iLIZIZ3;
                    }
                    C426750GoL.LJIIL(view2, Integer.valueOf(iLIZIZ2), Integer.valueOf(i2), Integer.valueOf(iLIZIZ2), Integer.valueOf(i3), 16);
                }
            }

            @Override // X.AbstractC438050HFr
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
                return new BlackHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f70, viewGroup, false), this.LL);
            }
        };
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getContext(), 1);
        RecyclerView recyclerView3 = this.LLJI;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView4 = this.LLJI;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        C665740Q9k.LIZ(recyclerView4, 6);
        RecyclerView recyclerView5 = this.LLJI;
        if (recyclerView5 != null) {
            recyclerView = recyclerView5;
        }
        recyclerView.setAdapter(this.LLJIJIL);
        setLoadMoreListener(this);
        setShowFooter(true);
        LJ();
    }
}
