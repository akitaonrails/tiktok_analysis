package com.bytedance.tiktok.homepage.mainfragment.inflate;

import X.AbstractC848400XPy;
import X.C0C0H;
import X.C0XQ7;
import X.C10VO;
import X.C1157804fw;
import X.C1308910kAL;
import X.C1324840ka2;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C14TF;
import X.C1586220rNc;
import X.C1586270rNh;
import X.C1591480rW6;
import X.C1591880rWk;
import X.C1600680rkw;
import X.C1828207Ea;
import X.C19252910Tv;
import X.C1AV3;
import X.C1E83;
import X.C20642515q3;
import X.C2180521AVm;
import X.C341940Daq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C422820Gi0;
import X.C424700Gl2;
import X.C435490H5v;
import X.C443120HZe;
import X.C486530J6d;
import X.C786410Ut5;
import X.C814420VxA;
import X.C890330YwJ;
import X.InterfaceC1570900qyu;
import X.InterfaceC1611110s1l;
import X.InterfaceC1617760sCU;
import X.InterfaceC435500H5w;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class HomepageIconServiceImpl implements HomepageIconServiceApi {
    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final C486530J6d LIZIZ() {
        C1600680rkw.LIZ.getClass();
        return C1600680rkw.LJ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final C486530J6d LIZJ() {
        C1600680rkw.LIZ.getClass();
        return C1600680rkw.LIZLLL();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rNh] */
    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final C1586270rNh LIZ(InterfaceC1617760sCU interfaceC1617760sCU) {
        return new InterfaceC1570900qyu(interfaceC1617760sCU) { // from class: X.0rNh
            public C424700Gl2 LL;
            public final InterfaceC1617760sCU LLILLJJLI;

            @Override // X.InterfaceC1570900qyu
            public final void LIZ() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void T1() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void V1(InterfaceC1617760sCU interfaceC1617760sCU2) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU2) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void X1(int i) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void Z1() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void a2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean b2() {
                return false;
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean c2() {
                return false;
            }

            @Override // X.InterfaceC1570900qyu
            public final void d2(Integer num) {
            }

            @Override // X.InterfaceC1570900qyu
            public final void e2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void g2() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onCreate() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onDestroyView() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onPause() {
            }

            @Override // X.InterfaceC1570900qyu
            public final void onResume() {
            }

            @Override // X.InterfaceC1570900qyu
            public final String getTag() {
                return EnumC1584350rKb.SPECIAL.getTag();
            }

            public static SpecialTopicEntry LIZIZ() {
                try {
                    C0C64.LJIILLIIL().getClass();
                    return (SpecialTopicEntry) C0C64.LJJI(SpecialTopicEntry.class, "special_event_entrypoint", true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }

            @Override // X.InterfaceC1570900qyu
            public final boolean enabled() {
                SpecialTopicEntry specialTopicEntryLIZIZ = LIZIZ();
                if (specialTopicEntryLIZIZ == null || !specialTopicEntryLIZIZ.enable || TextUtils.isEmpty(specialTopicEntryLIZIZ.landingRoute) || TextUtils.isEmpty(specialTopicEntryLIZIZ.iconUrl)) {
                    return false;
                }
                return !C10EU.LJIIIIZZ() || specialTopicEntryLIZIZ.childViewable;
            }

            {
                this.LLILLJJLI = interfaceC1617760sCU;
            }

            @Override // X.InterfaceC1570900qyu
            public final void S1(boolean z) {
                SpecialTopicEntry specialTopicEntryLIZIZ = LIZIZ();
                if (this.LL != null && specialTopicEntryLIZIZ != null && specialTopicEntryLIZIZ.enable && !TextUtils.isEmpty(specialTopicEntryLIZIZ.landingRoute) && !TextUtils.isEmpty(specialTopicEntryLIZIZ.iconUrl)) {
                    if (!C10EU.LJIIIIZZ() || specialTopicEntryLIZIZ.childViewable) {
                        String strF3 = this.LLILLJJLI.f3();
                        if (ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", strF3);
                            c2344009Gk.LJIIIIZZ("type", specialTopicEntryLIZIZ.eventName);
                            c2344009Gk.LJIIIIZZ("url", specialTopicEntryLIZIZ.landingRoute);
                            C20684815ws.LJIILLIIL("topic_entrance_show", c2344009Gk.LIZ);
                        }
                    }
                }
            }

            @Override // X.InterfaceC1570900qyu
            public final void U1(View view) {
                SpecialTopicEntry specialTopicEntryLIZIZ = LIZIZ();
                if (specialTopicEntryLIZIZ == null) {
                    return;
                }
                SmartRouter.buildRoute(this.LLILLJJLI.getActivity(), specialTopicEntryLIZIZ.landingRoute).open();
                String strF3 = this.LLILLJJLI.f3();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", strF3);
                c2344009Gk.LJIIIIZZ("type", specialTopicEntryLIZIZ.eventName);
                c2344009Gk.LJIIIIZZ("url", specialTopicEntryLIZIZ.landingRoute);
                C20684815ws.LJIILLIIL("topic_entrance_click", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC1570900qyu
            public final View f2(Context context) {
                SpecialTopicEntry specialTopicEntryLIZIZ = LIZIZ();
                if (specialTopicEntryLIZIZ == null) {
                    return null;
                }
                if (C303200BuY.LIZ == 2) {
                    C424700Gl2 c424700Gl2 = (C424700Gl2) ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getInflatedSpecialIcon(this.LLILLJJLI.getActivity());
                    this.LL = c424700Gl2;
                    if (c424700Gl2 == null) {
                        return null;
                    }
                    ViewGroup viewGroup = (ViewGroup) c424700Gl2.getParent();
                    if (viewGroup != null) {
                        C786410Ut5.LJJJLZIJ(this.LL, viewGroup);
                    }
                } else {
                    HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) PluggableExtentionKt.pluggableSpi(HomepageIconServiceApi.class);
                    if (homepageIconServiceApi != null) {
                        this.LL = homepageIconServiceApi.LJIIIZ(this.LLILLJJLI.getActivity());
                    }
                }
                C1324840ka2.LJIIJ(this.LL, specialTopicEntryLIZIZ.iconUrl, -1, -1);
                String strF3 = this.LLILLJJLI.f3();
                if (ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", strF3);
                    c2344009Gk.LJIIIIZZ("type", specialTopicEntryLIZIZ.eventName);
                    c2344009Gk.LJIIIIZZ("url", specialTopicEntryLIZIZ.landingRoute);
                    C20684815ws.LJIILLIIL("topic_entrance_show", c2344009Gk.LIZ);
                }
                return this.LL;
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final View LIZLLL(Context context) {
        C1600680rkw.LIZ.getClass();
        int iLIZ = C341940Daq.LIZ(12.0d);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(iLIZ, iLIZ, iLIZ, iLIZ);
        imageView.setImageResource(R.drawable.c3o);
        double d = 44;
        C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(C341940Daq.LIZ(d), C341940Daq.LIZ(d)));
        return imageView;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final C422820Gi0 LJ(Context context) {
        int iIntValue;
        C1600680rkw.LIZ.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C341940Daq.LIZ(28.0d), C341940Daq.LIZ(28.0d));
        C422820Gi0 c422820Gi0 = new C422820Gi0(context);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c422820Gi0);
        c422820Gi0.setLayoutParams(layoutParams);
        c422820Gi0.LLJJ = true;
        C1331070kk5 hierarchy = c422820Gi0.getHierarchy();
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJFF(C418440Gaw.LIZIZ(1));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1331100kk8.LJFF = iIntValue;
        c1331100kk8.LIZIZ = true;
        hierarchy.LJJIII(c1331100kk8);
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && !((AbstractC848400XPy) iAccountUserServiceLJFF).isLogin()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
            c422820Gi0.setImageDrawable(c419910GdJ.LIZ(context));
            return c422820Gi0;
        }
        C0XQ7.LJ();
        C1324840ka2.LJIIJ(c422820Gi0, C0XQ7.LIZ.LJIIJ().getAvatarUrl(), -1, -1);
        return c422820Gi0;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final View LJI(Context context) {
        C1600680rkw.LIZ.getClass();
        IMChatListApi.LJJIII.getClass();
        return C890330YwJ.LIZ().LJJIIZ(context);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final TuxIconView LJII(Context context) {
        C1600680rkw.LIZ.getClass();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZ = R.raw.icon_inbox;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = true;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C10VO.LIZJ(tuxIconView, 0.75f);
        tuxIconView.setTuxIcon(c419910GdJ);
        tuxIconView.setClickable(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        layoutParams.gravity = 17;
        C786410Ut5.M6(tuxIconView, layoutParams);
        C1600680rkw.LJFF(tuxIconView, "inboxicon");
        return tuxIconView;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final ImageView LJIIIIZZ(Context context) {
        C1600680rkw.LIZ.getClass();
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
            ImageView imageViewLJJIJIIJIL = c19252910Tv.LIZLLL().LJIJI().LJJIJIIJIL(context);
            if (imageViewLJJIJIIJIL == null) {
                return C1600680rkw.LIZ(context);
            }
            return imageViewLJJIJIIJIL;
        }
        if (C0C0H.LIZ()) {
            return C1600680rkw.LIZ(context);
        }
        if (C1591480rW6.LJI()) {
            C486530J6d c486530J6dLIZLLL = C1600680rkw.LIZLLL();
            if (c486530J6dLIZLLL == null) {
                return C1600680rkw.LIZ(context);
            }
            TuxIconView tuxIconViewLIZJ = C1600680rkw.LIZJ(context, c486530J6dLIZLLL);
            tuxIconViewLIZJ.setId(R.id.jqq);
            C1600680rkw.LJFF(tuxIconViewLIZJ, "liveicon");
            C2180521AVm.LIZLLL(tuxIconViewLIZJ, 8, C1AV3.LIZ(1, "Feed", null, "top_generator"));
            return tuxIconViewLIZJ;
        }
        return C1600680rkw.LIZ(context);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final C424700Gl2 LJIIIZ(Context context) {
        int i;
        C1600680rkw.LIZ.getClass();
        C424700Gl2 c424700Gl2 = new C424700Gl2(context);
        c424700Gl2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (C1591880rWk.LIZIZ.LJIIJ().LIZ()) {
            i = 56;
        } else {
            i = 40;
        }
        double d = i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C341940Daq.LIZ(d), C341940Daq.LIZ(d));
        double d2 = 8;
        layoutParams.setMargins(0, 0, C341940Daq.LIZ(d2), 0);
        layoutParams.setMarginEnd(C341940Daq.LIZ(d2));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424700Gl2);
        c424700Gl2.setLayoutParams(layoutParams);
        return c424700Gl2;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final View LJIIJ(Context context) {
        Object service;
        C1600680rkw.LIZ.getClass();
        if (((Boolean) C1E83.LJII.getValue()).booleanValue()) {
            if (C1157804fw.LIZ()) {
                service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                if (service == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
                }
            } else {
                service = ServiceManager.get().getService(ISearchService.class);
                if (service == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
                }
            }
            ((InterfaceC1611110s1l) service).LLIIIZ();
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
            View viewLJIIIIZZ = c19252910Tv.LIZLLL().LJIJI().LJIIIIZZ(context);
            if (viewLJIIIIZZ == null) {
                return C1600680rkw.LIZIZ(context);
            }
            return viewLJIIIIZZ;
        }
        if (C1591480rW6.LJI()) {
            C486530J6d c486530J6dLJ = C1600680rkw.LJ();
            if (c486530J6dLJ == null) {
                return C1600680rkw.LIZIZ(context);
            }
            TuxIconView tuxIconViewLIZJ = C1600680rkw.LIZJ(context, c486530J6dLJ);
            tuxIconViewLIZJ.setContentDescription(context.getString(R.string.spp));
            InterfaceC435500H5w.LIZ.getClass();
            C435490H5v.LIZ();
            tuxIconViewLIZJ.setId(R.id.jqt);
            C1600680rkw.LJFF(tuxIconViewLIZJ, "searchicon");
            return tuxIconViewLIZJ;
        }
        return C1600680rkw.LIZIZ(context);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final TuxIconView LJIIJJI(Context context) {
        C1600680rkw.LIZ.getClass();
        int iLIZIZ = C14TF.LIZIZ.LJJLIIIJ().LIZIZ(true);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        tuxIconView.setImageResource(iLIZIZ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        layoutParams.gravity = 8388627;
        C786410Ut5.M6(tuxIconView, layoutParams);
        tuxIconView.setContentDescription("Chat with TikTok Tako");
        return tuxIconView;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi
    public final C443120HZe LJFF(int i, Context context) {
        C1600680rkw.LIZ.getClass();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZ = R.raw.icon_magnifying_glass;
        Integer numValueOf = Integer.valueOf(R.attr.ef);
        c419910GdJ.LJ = numValueOf;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextColorRes(R.attr.ef);
        C1586220rNc.LIZ.getClass();
        String string = context.getString(R.string.spp);
        if (string == null) {
            string = C20642515q3.LJI(R.string.spp);
        }
        tuxTextView.setText(string);
        tuxTextView.setTuxFont(62);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0);
        layoutParams.gravity = 17;
        C786410Ut5.R6(tuxTextView, layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        layoutParams2.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
        C786410Ut5.a6(frameLayout, layoutParams2);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(32));
        boolean zLIZ = C1157804fw.LIZ();
        Integer numValueOf2 = Integer.valueOf(R.attr.e9);
        if (zLIZ) {
            if (C1828207Ea.LIZ()) {
                c384050F3z.LJFF = numValueOf;
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            } else {
                c384050F3z.LIZIZ = numValueOf2;
            }
        } else if (((ISearchService) ServiceManager.get().getService(ISearchService.class)).e0()) {
            c384050F3z.LJFF = numValueOf;
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        } else {
            c384050F3z.LIZIZ = numValueOf2;
        }
        frameLayout.setBackground(c384050F3z.LIZ(context));
        frameLayout.addView(tuxTextView);
        return new C443120HZe(frameLayout, tuxTextView, Integer.valueOf((i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38))) - 10));
    }
}
