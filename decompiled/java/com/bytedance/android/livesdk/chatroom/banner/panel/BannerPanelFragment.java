package com.bytedance.android.livesdk.chatroom.banner.panel;

import X.C1119170fEJ;
import X.C1119920fFW;
import X.C1151520g4U;
import X.C1161920gLG;
import X.C13BV;
import X.C15438062q;
import X.C1547760qNa;
import X.C16F5;
import X.C1834150xpV;
import X.C19322110iZ;
import X.C19748512Ol;
import X.C20632315oP;
import X.C20736316Cj;
import X.C21546719Ub;
import X.C417850GZz;
import X.C497740JfY;
import X.C766430U4r;
import X.C786410Ut5;
import X.InterfaceC1059280dfi;
import X.InterfaceC21547419Ui;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.banner.panel.BannerPanelFragment;
import com.bytedance.android.livesdk.chatroom.banner.panel.fragment.BannerPanelItemFragment;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerPageV2OptimizeSetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerPageV2Setting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BannerPanelFragment extends LiveSheetFragment implements InterfaceC1059280dfi {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPT08HELIOSJyhiKy49JiA+Zz8yJiAgZw0yJispOx8yJiAgDz0yLygpJzs=";
    public String LLJLLL;
    public List<BannerPanelItem> LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public C20632315oP LLLF;
    public final SparseBooleanArray LLLFF = new SparseBooleanArray();
    public List<? extends C766430U4r> LLLFFI;
    public Room LLLFZ;

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC1059280dfi
    public final void close() {
        C19322110iZ.LIZ(this.LLJJIJIL.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<? extends X.0U4r>] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.13BV] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        Typeface typefaceLIZIZ;
        ?? arrayList;
        View viewFindViewById;
        int size;
        C766430U4r c766430U4r;
        Typeface typeface;
        View view = getView();
        C20632315oP c20632315oP = view != null ? (C20632315oP) view.findViewById(R.id.view_pager) : null;
        this.LLLF = c20632315oP;
        if (c20632315oP != null) {
            c20632315oP.LIZIZ(new C1151520g4U(this, 0));
        }
        C20632315oP c20632315oP2 = this.LLLF;
        if (c20632315oP2 != null) {
            c20632315oP2.setUserInputEnabled(false);
        }
        List<BannerPanelItem> list = this.LLJZ;
        int i = -1;
        int size2 = (list == null || !(list.isEmpty() ^ true)) ? -1 : list.size();
        LiveBannerPageV2OptimizeSetting liveBannerPageV2OptimizeSetting = LiveBannerPageV2OptimizeSetting.INSTANCE;
        if (liveBannerPageV2OptimizeSetting.enable() && liveBannerPageV2OptimizeSetting.cacheSize() >= 0) {
            size2 = liveBannerPageV2OptimizeSetting.cacheSize();
        }
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        List<BannerPanelItem> list2 = this.LLJZ;
        if (list2 != null) {
            Iterator<BannerPanelItem> it2 = list2.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(this.LLJLLL, it2.next().bannerId)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        List<BannerPanelItem> list3 = this.LLJZ;
        if (list3 == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            Iterator<BannerPanelItem> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                BannerPanelItem next = it3.next();
                if (next.title.length() > 18) {
                    typefaceLIZIZ = next != null ? C1119920fFW.LIZIZ(500, 85) : null;
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (BannerPanelItem bannerPanelItem : list3) {
                boolean zLJFF = Intrinsics.LJFF(this.LLJLLL, bannerPanelItem.bannerId);
                String str = bannerPanelItem.schema;
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(C1547760qNa.LIZIZ(str));
                BannerPanelItemFragment bannerPanelItemFragment = new BannerPanelItemFragment(sparkContext);
                sparkContext.LJJJJJ(this);
                sparkContext.LJJJZ("fe_enter_from", zLJFF ? "live_room_banner" : "native_banner_tab");
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, bundle);
                bannerPanelItemFragment.setArguments(bundle);
                C766430U4r c766430U4r2 = new C766430U4r(bannerPanelItemFragment, bannerPanelItem.title);
                c766430U4r2.LIZLLL = false;
                c766430U4r2.LJ = true;
                c766430U4r2.LJFF = 1;
                c766430U4r2.LJI = Integer.MAX_VALUE;
                c766430U4r2.LJII = R.style.a9c;
                c766430U4r2.LJIIIIZZ = C497740JfY.LJIIIZ(R.dimen.b1e);
                if (typefaceLIZIZ != null) {
                    c766430U4r2.LJIIIZ = typefaceLIZIZ;
                }
                arrayList.add(c766430U4r2);
            }
        }
        this.LLLFFI = arrayList;
        C20632315oP c20632315oP3 = this.LLLF;
        c1119170fEJ.LJIIIIZZ = arrayList;
        c1119170fEJ.LJIIIZ = c20632315oP3;
        c1119170fEJ.LJIIJ = i;
        c1119170fEJ.LJIIJJI = false;
        c1119170fEJ.LJIIL = size2;
        c1119170fEJ.LIZ = null;
        c1119170fEJ.LIZIZ = null;
        c1119170fEJ.LJIILIIL = false;
        c1119170fEJ.LJI = false;
        View view2 = getView();
        C21546719Ub c21546719Ub = view2 != null ? (C21546719Ub) view2.findViewById(R.id.wya) : null;
        if (LiveBannerPageV2Setting.INSTANCE.getValue() && c21546719Ub != null) {
            c21546719Ub.setTabGap((int) C497740JfY.LIZIZ(24.0f));
            c21546719Ub.LLIZ = 0;
            c21546719Ub.LLIZLLLIL = 0;
            c21546719Ub.LLJ = 0;
            c21546719Ub.LLJI = 0;
            c21546719Ub.LJIJ();
            c21546719Ub.setSelectedTabIndicatorWidth((int) C497740JfY.LIZIZ(16.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(0.5f));
            gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exp, c21546719Ub.getContext()));
            c21546719Ub.setSelectedTabIndicator(gradientDrawable);
            c21546719Ub.setSelectedTabIndicatorHeight((int) C497740JfY.LIZIZ(2.0f));
            c21546719Ub.setSelectedTabIndicatorMarginBottom((int) C497740JfY.LIZIZ(5.0f));
            c21546719Ub.setSelectedTabIndicatorGravity(4);
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezq, C1834150xpV.LJII(c21546719Ub.getContext()));
            c21546719Ub.setSelectedTabIndicatorColor(iLIZIZ);
            c21546719Ub.setTitleIncludeFontPadding(false);
            c21546719Ub.setRequestedTabMinWidth(0);
            int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezt, C1834150xpV.LJII(c21546719Ub.getContext()));
            c21546719Ub.LLJJI = C21546719Ub.LJII(iLIZIZ2, iLIZIZ);
            c21546719Ub.LLJJ = C21546719Ub.LJII(iLIZIZ2, iLIZIZ);
            c21546719Ub.requestLayout();
            List<? extends C766430U4r> list4 = this.LLLFFI;
            if (list4 != null && 2 <= (size = list4.size()) && size < 4) {
                C16F5 c16f5 = new C16F5(c21546719Ub.getContext(), null);
                c16f5.LJJJI(R.style.a9c);
                List<? extends C766430U4r> list5 = this.LLLFFI;
                if (list5 != null && (c766430U4r = (C766430U4r) ListProtector.get(list5, 0)) != null && (typeface = c766430U4r.LJIIIZ) != null) {
                    c16f5.setTypeface(typeface);
                }
                int iLJIIZILJ = (C497740JfY.LJIIZILJ() - (((int) C497740JfY.LIZIZ(16.0f)) * (size + 1))) / size;
                List<? extends C766430U4r> list6 = this.LLLFFI;
                if (list6 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C766430U4r c766430U4r3 : list6) {
                        if (c16f5.getPaint().measureText(c766430U4r3.LIZ.toString()) > iLJIIZILJ) {
                            arrayList2.add(c766430U4r3);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        c21546719Ub.setTabMode(1);
                        c21546719Ub.setTabGap((int) C497740JfY.LIZIZ(16.0f));
                        c21546719Ub.setTabWidth(iLJIIZILJ);
                    }
                }
            }
        }
        View view3 = getView();
        if (view3 != null && (viewFindViewById = view3.findViewById(R.id.jl0)) != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(C20736316Cj.LIZIZ(R.attr.exe, viewFindViewById.getContext()));
            viewFindViewById.setBackground(gradientDrawable2);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = (int) C497740JfY.LIZIZ(41.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
            viewFindViewById.setLayoutParams(layoutParams);
        }
        if (c21546719Ub != null) {
            c21546719Ub.setTabVisibilityChangeListener(new InterfaceC21547419Ui() { // from class: X.0ehu
                @Override // X.InterfaceC21547419Ui
                public final void O7() {
                }

                @Override // X.InterfaceC21547419Ui
                public final void P7(int i3) {
                    BannerPanelItem bannerPanelItem2;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    if (this.LIZ.LLLFF.get(i3, false)) {
                        return;
                    }
                    List<BannerPanelItem> list7 = this.LIZ.LLJZ;
                    String str7 = null;
                    if (list7 != null) {
                        bannerPanelItem2 = (BannerPanelItem) C13LP.LJJJLZIJ(i3, list7);
                    } else {
                        bannerPanelItem2 = null;
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_banner_multi_tab_show");
                    c474500IjALIZ.LJIL();
                    if (bannerPanelItem2 != null) {
                        str2 = bannerPanelItem2.bannerId;
                    } else {
                        str2 = null;
                    }
                    c474500IjALIZ.LJJII(str2, "banner_id");
                    c474500IjALIZ.LJJII(this.LIZ.LLJLLL, "enter_banner_id");
                    c474500IjALIZ.LJJII(Integer.valueOf(i3), "banner_detail_position");
                    c474500IjALIZ.LJJII("live_take_detail", "banner_page");
                    String str8 = "";
                    if (bannerPanelItem2 == null || (str3 = bannerPanelItem2.activityId) == null) {
                        str3 = "";
                    }
                    c474500IjALIZ.LJJII(str3, "activity_id");
                    if (bannerPanelItem2 != null && (str6 = bannerPanelItem2.bannerType) != null) {
                        str8 = str6;
                    }
                    c474500IjALIZ.LJJII(str8, "banner_type");
                    if (bannerPanelItem2 != null) {
                        str4 = bannerPanelItem2.schema;
                    } else {
                        str4 = null;
                    }
                    c474500IjALIZ.LJJII(str4, "next_page_url");
                    if (bannerPanelItem2 != null) {
                        str7 = bannerPanelItem2.title;
                    }
                    c474500IjALIZ.LJJII(str7, "tab_name");
                    BannerPanelFragment bannerPanelFragment = this.LIZ;
                    if (bannerPanelFragment.LLJZIJLIL) {
                        str5 = "anchor";
                    } else if (bannerPanelFragment.LLL) {
                        str5 = "admin";
                    } else {
                        str5 = "viewer";
                    }
                    c474500IjALIZ.LJJII(str5, "user_type");
                    c474500IjALIZ.LIZ();
                    this.LIZ.LLLFF.put(i3, true);
                }
            });
        }
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        SparkFragment sparkFragment;
        SparkFragment sparkFragment2;
        super.onDestroy();
        List<? extends C766430U4r> list = this.LLLFFI;
        if (list != null) {
            for (C766430U4r c766430U4r : list) {
                Fragment fragment = c766430U4r.LIZJ;
                if ((fragment instanceof SparkFragment) && (sparkFragment2 = (SparkFragment) fragment) != null) {
                    String str = SparkFragment._pnsPageId;
                    sparkFragment2.WR(true);
                }
                Fragment fragment2 = c766430U4r.LIZJ;
                if ((fragment2 instanceof SparkFragment) && (sparkFragment = (SparkFragment) fragment2) != null) {
                    sparkFragment.finish();
                }
            }
        }
        this.LLLFFI = null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exe, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        ArrayList parcelableArrayList;
        boolean z;
        String string2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Room room = null;
        if (arguments != null) {
            string = arguments.getString("focus_banner_id");
        } else {
            string = null;
        }
        this.LLJLLL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            parcelableArrayList = arguments2.getParcelableArrayList("banner_list");
        } else {
            parcelableArrayList = null;
        }
        this.LLJZ = parcelableArrayList;
        Bundle arguments3 = getArguments();
        boolean z2 = false;
        if (arguments3 != null) {
            z = arguments3.getBoolean("is_anchor", false);
        } else {
            z = false;
        }
        this.LLJZIJLIL = z;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z2 = arguments4.getBoolean("is_admin", false);
        }
        this.LLL = z2;
        try {
            Bundle arguments5 = getArguments();
            if (arguments5 != null && (string2 = arguments5.getString("room")) != null) {
                room = (Room) C19748512Ol.LIZIZ.LJII(string2, Room.class);
            }
            this.LLLFZ = room;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.fpl);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            float fLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
            gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f});
            if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).db0(this.LLLFZ, null)) {
                gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exo, viewFindViewById.getContext()));
            } else {
                gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exn, viewFindViewById.getContext()));
            }
            viewFindViewById.setBackground(gradientDrawable);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hfn, viewGroup, false);
        C417850GZz.LIZJ((int) C497740JfY.LIZIZ(12.0f), viewTd);
        return viewTd;
    }
}
