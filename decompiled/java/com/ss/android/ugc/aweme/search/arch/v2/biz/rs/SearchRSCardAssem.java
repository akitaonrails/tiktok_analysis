package com.ss.android.ugc.aweme.search.arch.v2.biz.rs;

import X.C01GW;
import X.C07E5;
import X.C0DXR;
import X.C0HXV;
import X.C0PJ4;
import X.C0Q3E;
import X.C1196320hEk;
import X.C1210504oR;
import X.C1308910kAL;
import X.C13BV;
import X.C13LP;
import X.C1558520qew;
import X.C1616640sAg;
import X.C1821707Bn;
import X.C1839807Im;
import X.C1913107eT;
import X.C19252910Tv;
import X.C20684815ws;
import X.C21565319aV;
import X.C2344009Gk;
import X.C2552909zT;
import X.C418440Gaw;
import X.C446200Hec;
import X.C452501pT;
import X.C487280J9a;
import X.C497820Jfg;
import X.C645860PUy;
import X.C645900PVc;
import X.C648880Pck;
import X.C650240Pew;
import X.C661350Pwr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC487330J9f;
import X.InterfaceC712990Rxx;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchRSCardAssem extends ReusedUISlotAssem<SearchRSCardAssem> implements InterfaceC712990Rxx<C645900PVc>, View.OnAttachStateChangeListener, InterfaceC487330J9f {
    public RecyclerView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public final int LLJLL;
    public final int LLJLLIL;
    public C645900PVc LLJLLL;
    public C645900PVc LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public final C01GW LLLF;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ets;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public SearchRSCardAssem() {
        Integer numValueOf = Integer.valueOf(C1913107eT.LJI());
        this.LLJLL = numValueOf.intValue() > 0 ? numValueOf.intValue() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        Integer numValueOf2 = Integer.valueOf(C1913107eT.LJI());
        this.LLJLLIL = numValueOf2.intValue() > 0 ? numValueOf2.intValue() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLJZIJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        this.LLL = 6;
        this.LLLF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 196));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0253, code lost:
    
        r3.add(new X.C645810PUt(r5, r4, java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019f A[PHI: r4
      0x019f: PHI (r4v1 X.0PWx) = (r4v0 X.0PWx), (r4v6 X.0PWx) binds: [B:102:0x019b, B:32:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.biz.rs.SearchRSCardAssem.onViewAttachedToWindow(android.view.View):void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float fLIZIZ;
        WrapGridLayoutManager wrapGridLayoutManager;
        Integer numLIZJ;
        Integer numLIZJ2;
        this.LLJLILLLLZIIL = view;
        view.addOnAttachStateChangeListener(this);
        this.LLJLIL = view.findViewById(R.id.ttc);
        View viewFindViewById = view.findViewById(R.id.u7t);
        if (C1821707Bn.LIZ() != 1 && C1821707Bn.LIZ() != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (C1821707Bn.LIZ() == 1) {
                C648880Pck.LIZJ(viewFindViewById);
            } else if (C1821707Bn.LIZ() == 2 && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, viewFindViewById.getContext())) != null) {
                viewFindViewById.setBackgroundColor(numLIZJ2.intValue());
            }
            C21565319aV.LIZIZ(viewFindViewById, Float.valueOf(C1839807Im.LIZ()), null, null, null, null, 30);
            C0HXV.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), viewFindViewById);
        } else {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (C0PJ4.LIZ()) {
                    fLIZIZ = C418440Gaw.LIZIZ(8);
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(16);
                }
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(fLIZIZ);
            }
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tte);
        int i = C2552909zT.LIZ;
        if (i != 1) {
            C0HXV.LJI(this.LLJLLIL, recyclerView);
            C0HXV.LIZIZ(this.LLJLLIL, recyclerView);
        }
        recyclerView.setNestedScrollingEnabled(false);
        this.LLJJLIIIJLLLLLLLZ = recyclerView;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tti);
        if (i != 1) {
            if (i != 2) {
                C0HXV.LJI(this.LLJLL, tuxTextView);
                C0HXV.LIZIZ(this.LLJLL, tuxTextView);
                tuxTextView.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                tuxTextView.setGravity(16);
            } else {
                tuxTextView.setTuxFont(62);
                tuxTextView.setTextColorRes(R.attr.a1k);
                C0HXV.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), tuxTextView);
                C0HXV.LIZIZ(this.LLJLL, tuxTextView);
                View viewLJJIJL = LJJIJL();
                Context context = tuxTextView.getContext();
                int iIntValue = R.attr.zp;
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                }
                viewLJJIJL.setBackgroundColor(iIntValue);
                tuxTextView.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                tuxTextView.setGravity(48);
            }
        } else {
            tuxTextView.setTuxFont(43);
            tuxTextView.setTextColorRes(R.attr.a1h);
            C0HXV.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), tuxTextView);
            C0HXV.LIZIZ(this.LLJLL, tuxTextView);
            tuxTextView.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            tuxTextView.setGravity(48);
        }
        this.LLJL = tuxTextView;
        RecyclerView recyclerView2 = this.LLJJLIIIJLLLLLLLZ;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        if (C0PJ4.LIZ()) {
            wrapGridLayoutManager = new WrapGridLayoutManager(1, 1, view.getContext(), false);
        } else {
            wrapGridLayoutManager = new WrapGridLayoutManager(2, 1, view.getContext(), false);
        }
        recyclerView2.setLayoutManager(wrapGridLayoutManager);
        RecyclerView recyclerView3 = this.LLJJLIIIJLLLLLLLZ;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(new C0DXR() { // from class: X.0PUv
            public final int LL = (int) C418040GaI.LIZ(8);

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                boolean zLIZLLL;
                Context context2 = view2.getContext();
                if (context2 != null) {
                    zLIZLLL = C426750GoL.LIZLLL(context2);
                } else {
                    zLIZLLL = false;
                }
                if (C0PJ4.LIZ()) {
                    if (recyclerView4.getChildAdapterPosition(view2) > 0) {
                        rect.top = this.LL;
                        return;
                    }
                    return;
                }
                int childAdapterPosition = recyclerView4.getChildAdapterPosition(view2);
                if (childAdapterPosition > 1) {
                    rect.top = this.LL;
                }
                int i2 = childAdapterPosition % 2;
                if (i2 == 0) {
                    if (zLIZLLL) {
                        rect.left = this.LL / 2;
                        return;
                    } else {
                        rect.right = this.LL / 2;
                        return;
                    }
                }
                if (i2 != 1) {
                    return;
                }
                if (zLIZLLL) {
                    rect.right = this.LL / 2;
                } else {
                    rect.left = this.LL / 2;
                }
            }
        });
        RecyclerView recyclerView4 = this.LLJJLIIIJLLLLLLLZ;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C487280J9a.LIZJ(this);
    }

    public final boolean op(Integer num) {
        int iLIZJ;
        int iLIZ;
        Context context = getContext();
        if (context != null) {
            if (num != null) {
                iLIZ = num.intValue();
            } else {
                iLIZ = C497820Jfg.LIZ(context);
            }
            iLIZJ = iLIZ + C497820Jfg.LIZJ(context);
        } else {
            iLIZJ = 0;
        }
        if (iLIZJ >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(568))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C645900PVc c645900PVc) {
        View view;
        ISearchContextAbility iSearchContextAbilityLIZ;
        ViewGroup.LayoutParams layoutParams;
        ISearchContextAbility iSearchContextAbilityLIZ2;
        ISearchContextAbility iSearchContextAbilityLIZ3;
        RecyclerView.ViewHolder viewHolderK4;
        C645900PVc c645900PVc2 = c645900PVc;
        RecyclerView recyclerView = null;
        String imprId = null;
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class, null);
        if (searchServiceCenter$CardCommonAbility != null && (viewHolderK4 = searchServiceCenter$CardCommonAbility.k4()) != null) {
            view = viewHolderK4.itemView;
        } else {
            view = null;
        }
        int size = 0;
        if (c645900PVc2.LL.isQrecVirtualEnable()) {
            this.LLJZ = c645900PVc2;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                C786410Ut5.W5(view, new RecyclerView.LayoutParams(-1, 0));
            }
            if (!C1210504oR.LIZ()) {
                List<RelatedWord> relatedWordList = c645900PVc2.LL.getRelatedWordList();
                if (relatedWordList != null) {
                    size = relatedWordList.size();
                }
                View view2 = this.LLJLILLLLZIIL;
                if (view2 != null) {
                    iSearchContextAbilityLIZ2 = C0Q3E.LIZ(view2);
                } else {
                    iSearchContextAbilityLIZ2 = null;
                }
                C645860PUy.LJI(size, iSearchContextAbilityLIZ2, Integer.valueOf(c645900PVc2.LL.getGroupPosition()), c645900PVc2.LL.getRank());
                List<RelatedWord> relatedWordList2 = c645900PVc2.LL.getRelatedWordList();
                if (relatedWordList2 != null) {
                    for (RelatedWord relatedWord : relatedWordList2) {
                        View view3 = this.LLJLILLLLZIIL;
                        if (view3 != null) {
                            iSearchContextAbilityLIZ3 = C0Q3E.LIZ(view3);
                        } else {
                            iSearchContextAbilityLIZ3 = null;
                        }
                        C645860PUy.LJFF(relatedWord, iSearchContextAbilityLIZ3, Integer.valueOf(c645900PVc2.LL.getGroupPosition()), c645900PVc2.LL.getRank());
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
            if (view != null && ((layoutParams = view.getLayoutParams()) == null || layoutParams.height != -2)) {
                C786410Ut5.W5(view, new RecyclerView.LayoutParams(-1, -2));
            }
        }
        this.LLJLLL = c645900PVc2;
        List<RelatedWord> relatedWordList3 = c645900PVc2.LL.getRelatedWordList();
        if (relatedWordList3 == null) {
            relatedWordList3 = C13BV.INSTANCE;
        }
        if (C0PJ4.LIZ() && relatedWordList3.size() != 6) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(6, "estimate_words_num");
            c2344009Gk.LIZJ(relatedWordList3.size(), "response_words_num");
            LogPbBean lobPb = c645900PVc2.LL.getLobPb();
            if (lobPb != null) {
                imprId = lobPb.getImprId();
            }
            c2344009Gk.LJIIIIZZ("impr_id", imprId);
            C20684815ws.LJIILLIIL("search_single_rs_count_mistake_rd", c2344009Gk.LIZ);
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                C786410Ut5.W5(view, new RecyclerView.LayoutParams(-1, 0));
                return;
            }
            return;
        }
        if (!relatedWordList3.isEmpty()) {
            if (op(null) || sp(null)) {
                if (C19252910Tv.LIZIZ.LIZLLL().LJII().LLLLIIL()) {
                    relatedWordList3 = C13LP.LL(relatedWordList3, this.LLL);
                } else {
                    relatedWordList3 = C13LP.LL(relatedWordList3, 5);
                }
            }
            RecyclerView recyclerView2 = this.LLJJLIIIJLLLLLLLZ;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            C446200Hec c446200Hec = new C446200Hec();
            View view4 = this.LLJLILLLLZIIL;
            if (view4 != null) {
                iSearchContextAbilityLIZ = C0Q3E.LIZ(view4);
            } else {
                iSearchContextAbilityLIZ = null;
            }
            int groupPosition = c645900PVc2.LL.getGroupPosition();
            int rank = c645900PVc2.LL.getRank();
            int i = this.LLJZIJLIL;
            c446200Hec.LLILLJJLI = iSearchContextAbilityLIZ;
            c446200Hec.LLILLL = groupPosition;
            c446200Hec.LL = relatedWordList3;
            c446200Hec.LLILZ = rank;
            c446200Hec.LLILZIL = i;
            c446200Hec.notifyDataSetChanged();
            recyclerView2.setAdapter(c446200Hec);
            RecyclerView recyclerView3 = this.LLJJLIIIJLLLLLLLZ;
            if (recyclerView3 != null) {
                recyclerView = recyclerView3;
            }
            C1196320hEk.LIZIZ(recyclerView, C1558520qew.LJIIL(this));
        }
        if (C0PJ4.LIZ()) {
            C661350Pwr.LIZJ(this.LLJLIL);
        } else {
            C661350Pwr.LJIIL(this.LLJLIL);
        }
    }

    public final boolean sp(Integer num) {
        int iIntValue;
        Integer numValueOf;
        int height;
        int i;
        double dLIZIZ;
        int iLIZIZ;
        if (!C0PJ4.LIZ()) {
            return false;
        }
        TuxTextView tuxTextView = null;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Context context = getContext();
            if (context != null && (numValueOf = Integer.valueOf(C497820Jfg.LIZIZ(context))) != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
        int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        if (C650240Pew.LIZ()) {
            C650240Pew.LIZ.getClass();
            int i2 = (iIntValue - (C650240Pew.LIZJ * 3)) / 2;
            double dLIZLLL = (((double) i2) / 0.625d) + ((double) C650240Pew.LIZLLL()) + ((double) C650240Pew.LJFF);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) dLIZLLL, Integer.MIN_VALUE);
            TuxTextView tuxTextView2 = this.LLJL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            TuxTextView tuxTextView3 = this.LLJL;
            if (tuxTextView3 != null) {
                tuxTextView = tuxTextView3;
            }
            this.LLJZIJLIL = (int) (((dLIZLLL - ((double) tuxTextView.getMeasuredHeight())) - ((double) iLIZIZ5)) / ((double) 6));
            return false;
        }
        if (C2552909zT.LIZ == 2) {
            TuxTextView tuxTextView4 = this.LLJL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            height = tuxTextView4.getHeight();
            i = 8;
        } else {
            TuxTextView tuxTextView5 = this.LLJL;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            height = tuxTextView5.getHeight();
            i = 12;
        }
        int iLIZIZ6 = height + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
        if (C19252910Tv.LIZIZ.LIZLLL().LJII().LLLLIIL()) {
            dLIZIZ = (((double) ((iIntValue - iLIZIZ2) / C1616640sAg.LIZ(null))) / 0.625d) + ((double) iLIZIZ3) + ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            dLIZIZ = (((double) ((iIntValue - iLIZIZ2) / 2)) / 0.625d) + ((double) iLIZIZ3) + ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        double d = (((dLIZIZ + ((double) iLIZIZ)) + ((double) iLIZIZ4)) - ((double) iLIZIZ6)) - ((double) iLIZIZ5);
        int i3 = (int) (d / ((double) 6));
        if (i3 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42))) {
            int iLIZIZ7 = (int) (d / ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42))));
            this.LLL = iLIZIZ7;
            this.LLJZIJLIL = (int) (d / ((double) iLIZIZ7));
            return true;
        }
        this.LLL = 6;
        this.LLJZIJLIL = i3;
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C645900PVc c645900PVc) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C645900PVc c645900PVc) {
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C645900PVc c645900PVc;
        if (!C19252910Tv.LIZIZ.LIZLLL().LJII().LLLLIIL() || (c645900PVc = this.LLJLLL) == null || c645900PVc.LL.isQrecVirtualEnable()) {
            return;
        }
        List<RelatedWord> relatedWordList = c645900PVc.LL.getRelatedWordList();
        if (relatedWordList == null) {
            relatedWordList = C13BV.INSTANCE;
        }
        if ((!C0PJ4.LIZ() || relatedWordList.size() == 6) && (!relatedWordList.isEmpty())) {
            if (sp(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(configuration.screenWidthDp)))))) {
                relatedWordList = C13LP.LL(relatedWordList, this.LLL);
            } else if (op(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(configuration.screenHeightDp)))))) {
                relatedWordList = C13LP.LL(relatedWordList, 5);
            }
            RecyclerView recyclerView = this.LLJJLIIIJLLLLLLLZ;
            ISearchContextAbility iSearchContextAbilityLIZ = null;
            if (recyclerView == null) {
                recyclerView = null;
            }
            C446200Hec c446200Hec = new C446200Hec();
            View view = this.LLJLILLLLZIIL;
            if (view != null) {
                iSearchContextAbilityLIZ = C0Q3E.LIZ(view);
            }
            int groupPosition = c645900PVc.LL.getGroupPosition();
            int rank = c645900PVc.LL.getRank();
            int i = this.LLJZIJLIL;
            c446200Hec.LLILLJJLI = iSearchContextAbilityLIZ;
            c446200Hec.LLILLL = groupPosition;
            c446200Hec.LL = relatedWordList;
            c446200Hec.LLILZ = rank;
            c446200Hec.LLILZIL = i;
            c446200Hec.notifyDataSetChanged();
            recyclerView.setAdapter(c446200Hec);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
