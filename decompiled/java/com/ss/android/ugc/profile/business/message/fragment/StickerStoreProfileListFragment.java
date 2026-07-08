package com.ss.android.ugc.profile.business.message.fragment;

import X.AbstractC480470Isn;
import X.C098200Yq;
import X.C0BI9;
import X.C10EU;
import X.C1257720ipm;
import X.C1257890iq3;
import X.C14EU;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1843500y4a;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C339190DRl;
import X.C451740HnY;
import X.C454640HsE;
import X.C622680Oba;
import X.C786410Ut5;
import X.EnumC356430DyD;
import X.EnumC454550Hs5;
import X.InterfaceC1257980iqC;
import X.InterfaceC1846110y8n;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.profile.business.message.fragment.StickerStoreProfileListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class StickerStoreProfileListFragment extends ProfileListFragment implements InterfaceC1257980iqC {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9JSA/Oi40HELIOSLWsqOy40JSAiPWEAPCwvIiohGzEjOyoDOioqICM2BCw/PQkhKSIhLCEn";
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public C1749280vcc LLJIJIL;
    public User LLJILJIL;
    public ViewPager LLJILJILJ;
    public C1257720ipm LLJILLL;
    public C1846060y8i LLJJ;
    public StickerTab LLJJI;
    public final List<Fragment> LLJJIII = new ArrayList();
    public final List<Integer> LLJJIJI = new ArrayList();

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return false;
    }

    @Override // X.InterfaceC1257980iqC
    public final void PB(String str) {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC1257980iqC
    public final void q3(boolean z) {
    }

    @Override // X.InterfaceC1257980iqC
    public final void za(MiniUser miniUser) {
    }

    @Override // X.InterfaceC1257980iqC
    public final void LJFF() {
        Iterator<Fragment> it2 = this.LLJJIII.iterator();
        while (it2.hasNext()) {
            IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJJIII(it2.next(), this.LLJILJIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    @Override // X.InterfaceC1258040iqI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJLIIIJILLIZJL() {
        /*
            r3 = this;
            java.util.List<androidx.fragment.app.Fragment> r0 = r3.LLJJIII
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 == 0) goto Lc
            return r2
        Lc:
            androidx.viewpager.widget.ViewPager r0 = r3.LLJILJILJ
            if (r0 == 0) goto L29
            int r1 = r0.getCurrentItem()
            X.0ipm r0 = r3.LLJILLL
            if (r0 == 0) goto L29
            androidx.fragment.app.Fragment r1 = r0.LJJIJIL(r1)
        L1c:
            boolean r0 = r1 instanceof X.InterfaceC1258040iqI
            if (r0 == 0) goto L28
            X.0iqI r1 = (X.InterfaceC1258040iqI) r1
            if (r1 == 0) goto L28
            android.view.View r2 = r1.LJJLIIIJILLIZJL()
        L28:
            return r2
        L29:
            r1 = r2
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.message.fragment.StickerStoreProfileListFragment.LJJLIIIJILLIZJL():android.view.View");
    }

    public final void yS() {
        C1845940y8W c1845940y8WLJII;
        Integer num;
        C1846060y8i c1846060y8i = this.LLJJ;
        if (c1846060y8i == null || (c1845940y8WLJII = c1846060y8i.LJII(0)) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context context = getContext();
        sbLIZ.append(context != null ? context.getString(2131848877) : null);
        sbLIZ.append(' ');
        StickerTab stickerTab = this.LLJJI;
        sbLIZ.append(C1843500y4a.LIZIZ((stickerTab == null || (num = stickerTab.videoStickerCount) == null) ? 0L : num.intValue()));
        c1845940y8WLJII.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    public final void Gn(User user) {
        String uid;
        User user2 = this.LLJILJIL;
        String uid2 = null;
        if (user2 != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        if (user != null) {
            uid2 = user.getUid();
        }
        if (!Intrinsics.LJFF(uid, uid2)) {
            this.LLJILJIL = user;
            LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void HP(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
        String string;
        String strJ4;
        String strLIZJ;
        String strLIZJ2;
        if (!isViewValid()) {
            return;
        }
        if (!this.LLJ && !this.LLILZLL && !this.LLIZ && !this.LLIZLLLIL && !this.LLJI) {
            C1749280vcc c1749280vcc = this.LLJIJIL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            ViewPager viewPager = this.LLJILJILJ;
            if (viewPager != null) {
                C786410Ut5.LLJ(viewPager, 0);
                return;
            }
            return;
        }
        Context context = getContext();
        if (context != null) {
            C1749280vcc c1749280vcc2 = this.LLJIJIL;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 0);
            }
            C1749280vcc c1749280vcc3 = this.LLJIJIL;
            if (c1749280vcc3 != null) {
                boolean z2 = this.LLJ;
                boolean z3 = this.LLIZLLLIL;
                boolean z4 = this.LLILZLL;
                boolean z5 = this.LLJI;
                boolean z6 = this.LLIZ;
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                String str = "";
                if (z2) {
                    string = context.getString(2131822989);
                    strJ4 = context.getString(2131822987);
                } else if (!z3) {
                    string = "";
                    strJ4 = "";
                } else {
                    string = context.getString(2131822977);
                    String string2 = context.getString(2131822976);
                    Object[] objArr = new Object[1];
                    User user = this.LLJILJIL;
                    if (user == null || (strLIZJ = C10EU.LIZJ(user)) == null) {
                        strLIZJ = "";
                    }
                    objArr[0] = strLIZJ;
                    strJ4 = C786410Ut5.j4(string2, Arrays.copyOf(objArr, 1));
                }
                if (z5) {
                    string = context.getString(2131824639);
                    strJ4 = context.getString(2131824638);
                } else if (z4) {
                    String string3 = context.getString(2131822983);
                    strJ4 = context.getString(2131822982);
                    Object[] objArr2 = new Object[1];
                    User user2 = this.LLJILJIL;
                    if (user2 != null && (strLIZJ2 = C10EU.LIZJ(user2)) != null) {
                        str = strLIZJ2;
                    }
                    objArr2[0] = str;
                    string = C786410Ut5.j4(string3, Arrays.copyOf(objArr2, 1));
                } else if (z6) {
                    string = context.getString(2131822989);
                    strJ4 = context.getString(2131822987);
                }
                c1722300uv6.LJI = string;
                c1722300uv6.LJIIIIZZ = strJ4;
                c1749280vcc3.setStatus(c1722300uv6);
            }
        }
        ViewPager viewPager2 = this.LLJILJILJ;
        if (viewPager2 == null) {
            return;
        }
        C786410Ut5.LLJ(viewPager2, 8);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Sl(boolean z) {
        this.LLJ = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Wb(boolean z) {
        this.LLILZLL = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        View viewLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (viewLJJLIIIJILLIZJL instanceof RecyclerView) {
            if (z) {
                ((RecyclerView) viewLJJLIIIJILLIZJL).smoothScrollToPosition(0);
                return;
            } else {
                ((RecyclerView) viewLJJLIIIJILLIZJL).scrollToPosition(0);
                return;
            }
        }
        if (viewLJJLIIIJILLIZJL instanceof ScrollView) {
            ((ScrollView) viewLJJLIIIJILLIZJL).scrollTo(0, 0);
        } else {
            if (!(viewLJJLIIIJILLIZJL instanceof ListView)) {
                return;
            }
            if (z) {
                ((ListView) viewLJJLIIIJILLIZJL).smoothScrollToPosition(0);
            } else {
                viewLJJLIIIJILLIZJL.scrollTo(0, 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void ro(boolean z) {
        this.LLIZ = z;
    }

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
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void updateStickerTabCount(C1257890iq3 c1257890iq3) {
        Integer num = c1257890iq3.LIZIZ;
        StickerTab stickerTabCopy = null;
        StickerTab stickerTabCopy2 = null;
        Integer numValueOf = null;
        StickerTab stickerTabCopy3 = null;
        Integer numValueOf2 = null;
        if (num != null) {
            int iIntValue = num.intValue();
            StickerTab stickerTab = this.LLJJI;
            if (stickerTab != null) {
                stickerTabCopy2 = stickerTab.copy(stickerTab.showStickerTab, stickerTab.showStickerSetSticker, stickerTab.showVideoSticker, stickerTab.stickerSetCount, Integer.valueOf(iIntValue));
            }
            this.LLJJI = stickerTabCopy2;
            yS();
            return;
        }
        int i = c1257890iq3.LIZ;
        if (i == EnumC356430DyD.ADD.getType()) {
            StickerTab stickerTab2 = this.LLJJI;
            if (stickerTab2 != null) {
                Integer num2 = stickerTab2.videoStickerCount;
                if (num2 != null) {
                    numValueOf = Integer.valueOf(num2.intValue() + 1);
                }
                stickerTabCopy3 = stickerTab2.copy(stickerTab2.showStickerTab, stickerTab2.showStickerSetSticker, stickerTab2.showVideoSticker, stickerTab2.stickerSetCount, numValueOf);
            }
            this.LLJJI = stickerTabCopy3;
            yS();
            return;
        }
        if (i != EnumC356430DyD.REMOVE.getType()) {
            return;
        }
        StickerTab stickerTab3 = this.LLJJI;
        if (stickerTab3 != null) {
            if (stickerTab3.videoStickerCount != null) {
                numValueOf2 = Integer.valueOf(r0.intValue() - 1);
            }
            stickerTabCopy = stickerTab3.copy(stickerTab3.showStickerTab, stickerTab3.showStickerSetSticker, stickerTab3.showVideoSticker, stickerTab3.stickerSetCount, numValueOf2);
        }
        this.LLJJI = stickerTabCopy;
        yS();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void vs(boolean z) {
        this.LLJI = z;
    }

    public final String wS(int i) {
        Integer num;
        Integer num2;
        long jIntValue = 0;
        String string = null;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131848877);
            }
            sbLIZ.append(string);
            sbLIZ.append(' ');
            StickerTab stickerTab = this.LLJJI;
            if (stickerTab != null && (num2 = stickerTab.videoStickerCount) != null) {
                jIntValue = num2.intValue();
            }
            sbLIZ.append(C1843500y4a.LIZIZ(jIntValue));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        Context context2 = getContext();
        if (context2 != null) {
            string = context2.getString(2131848873);
        }
        sbLIZ2.append(string);
        sbLIZ2.append(' ');
        StickerTab stickerTab2 = this.LLJJI;
        if (stickerTab2 != null && (num = stickerTab2.stickerSetCount) != null) {
            jIntValue = num.intValue();
        }
        sbLIZ2.append(C1843500y4a.LIZIZ(jIntValue));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0ipm, androidx.viewpager.widget.PagerAdapter] */
    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Integer numValueOf;
        int type;
        StickerTab stickerTab;
        C1846060y8i c1846060y8i;
        Fragment fragmentLJJI;
        StickerTab stickerTab2;
        Fragment fragmentLJIL;
        super.onViewCreated(view, bundle);
        this.LLJIJIL = (C1749280vcc) view.findViewById(R.id.s68);
        Bundle arguments = getArguments();
        Integer numValueOf2 = null;
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("uid");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("sec_userid");
        } else {
            string3 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            boolValueOf = Boolean.valueOf(arguments4.getBoolean("is_self"));
        } else {
            boolValueOf = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            boolValueOf2 = Boolean.valueOf(arguments5.getBoolean("key_show_sticker_set_sticker"));
        } else {
            boolValueOf2 = null;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            boolValueOf3 = Boolean.valueOf(arguments6.getBoolean("key_show_video_sticker"));
        } else {
            boolValueOf3 = null;
        }
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            numValueOf = Integer.valueOf(arguments7.getInt("key_sticker_set_count"));
        } else {
            numValueOf = null;
        }
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            numValueOf2 = Integer.valueOf(arguments8.getInt("key_video_sticker_count"));
        }
        this.LLJJI = new StickerTab(null, boolValueOf2, boolValueOf3, numValueOf, numValueOf2);
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        c454640HsE.LIZIZ().getImStickerStoreService().LIZJ();
        if (!Intrinsics.LJFF(string, "sticker_set_details_page") && !Intrinsics.LJFF(string, "video_sticker_rank_list")) {
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                type = EnumC454550Hs5.PERSONAL_PROFILE_NOT_FROM_STICKER_STORE.getType();
            } else {
                type = EnumC454550Hs5.OTHERS_PROFILE_NOT_FROM_STICKER_STORE.getType();
            }
        } else if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            type = EnumC454550Hs5.PERSONAL_PROFILE_FROM_STICKER_STORE.getType();
        } else {
            type = EnumC454550Hs5.OTHERS_PROFILE_FROM_STICKER_STORE.getType();
        }
        ((ArrayList) this.LLJJIII).clear();
        if (C451740HnY.LIZ() && (stickerTab2 = this.LLJJI) != null && Intrinsics.LJFF(stickerTab2.showVideoSticker, Boolean.TRUE) && (fragmentLJIL = c454640HsE.LIZIZ().getImStickerStoreService().LJIL(type, string3, String.valueOf(hashCode()))) != null) {
            ((ArrayList) this.LLJJIII).add(fragmentLJIL);
            ((ArrayList) this.LLJJIJI).add(1);
        }
        StickerTab stickerTab3 = this.LLJJI;
        if (stickerTab3 != null && Intrinsics.LJFF(stickerTab3.showStickerSetSticker, Boolean.TRUE) && (fragmentLJJI = c454640HsE.LIZIZ().getImStickerStoreService().LJJI(type, string2, String.valueOf(hashCode()))) != null) {
            ((ArrayList) this.LLJJIII).add(fragmentLJJI);
            ((ArrayList) this.LLJJIJI).add(0);
        }
        final FragmentManager childFragmentManager = getChildFragmentManager();
        ?? r3 = new AbstractC480470Isn(childFragmentManager) { // from class: X.0ipm
            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return ((ArrayList) this.LLIZ.LLJJIII).size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIJJLI(int i) {
                StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLIZ;
                return stickerStoreProfileListFragment.wS(((Number) ListProtector.get(stickerStoreProfileListFragment.LLJJIJI, i)).intValue());
            }

            @Override // X.AbstractC480470Isn
            public final Fragment LJJIJIL(int i) {
                return (Fragment) ListProtector.get(this.LLIZ.LLJJIII, i);
            }
        };
        this.LLJILLL = r3;
        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.s6_);
        this.LLJILJILJ = viewPager;
        C1846060y8i c1846060y8i2 = (C1846060y8i) view.findViewById(R.id.s6a);
        c1846060y8i2.getTabSelectedIndicator().getBounds().set(0, 0, 0, 0);
        this.LLJJ = c1846060y8i2;
        viewPager.setAdapter(r3);
        StickerTab stickerTab4 = this.LLJJI;
        if (stickerTab4 != null && Intrinsics.LJFF(stickerTab4.showStickerSetSticker, Boolean.TRUE) && (stickerTab = this.LLJJI) != null && Intrinsics.LJFF(stickerTab.showVideoSticker, Boolean.TRUE)) {
            C1846060y8i c1846060y8i3 = this.LLJJ;
            if (c1846060y8i3 != null) {
                C339190DRl.LIZLLL(c1846060y8i3);
            }
            Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
            while (it2.hasNext()) {
                String strWS = wS(((Number) it2.next()).intValue());
                if (strWS != null && (c1846060y8i = this.LLJJ) != null) {
                    C1845940y8W c1845940y8WLJIIIZ = c1846060y8i.LJIIIZ();
                    c1845940y8WLJIIIZ.LIZIZ(strWS);
                    c1846060y8i.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i.LLILZLL.size(), c1846060y8i.LLILZLL.isEmpty());
                }
            }
            C1846060y8i c1846060y8i4 = this.LLJJ;
            if (c1846060y8i4 != null) {
                C1846060y8i.LJIJI(c1846060y8i4, viewPager);
                c1846060y8i4.LIZ(new InterfaceC1846110y8n() { // from class: X.0ipr
                    @Override // X.InterfaceC1846110y8n
                    public final void LIZ(C1845940y8W c1845940y8W) {
                    }

                    @Override // X.InterfaceC1846110y8n
                    public final void LIZJ(C1845940y8W c1845940y8W) {
                    }

                    @Override // X.InterfaceC1846110y8n
                    public final void LIZIZ(C1845940y8W c1845940y8W) {
                        viewPager.setCurrentItem(c1845940y8W.LIZLLL, true);
                    }
                });
            }
            if (Intrinsics.LJFF(string, "sticker_set_details_page")) {
                viewPager.setCurrentItem(1, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (C0BI9.LIZ()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.edv, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.edu, viewGroup, false);
        }
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
