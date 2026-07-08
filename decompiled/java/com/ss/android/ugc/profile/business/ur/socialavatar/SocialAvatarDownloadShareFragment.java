package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0HFS;
import X.C0HFT;
import X.C0HFV;
import X.C0HWW;
import X.C0PEM;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12ES;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1369580lkC;
import X.C1374550lsD;
import X.C1377070lwH;
import X.C1378150ly1;
import X.C1378160ly2;
import X.C13LE;
import X.C1463680oBy;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C418440Gaw;
import X.C438450HHf;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C516560KNq;
import X.C531650Kt9;
import X.C621180OYa;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1368050lhj;
import X.InterfaceC1369790lkX;
import X.InterfaceC1378050lxr;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS141S0100000_6;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareFragment;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SocialAvatarDownloadShareFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final C1378160ly2 LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiOiAwISHELIOSQgKDkyPCQ+Zxw8KywtJQ4lKTEtOws8PysgJi43Gy0tOyoVOiQrJCo9PA==";
    public File LLIZ;
    public File LLIZLLLIL;
    public File LLJ;
    public File LLJI;
    public File LLJIJIL;
    public File LLJILJIL;
    public Integer LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public Long LLJJIII;
    public SmartImageView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public SurfaceView LLJJIJIL;
    public C1369580lkC LLJJJ;
    public View LLJJJIL;
    public List<InterfaceC1369790lkX> LLJJJJ;
    public final Set<InterfaceC1369790lkX> LLJJJJJIL = new LinkedHashSet();
    public final Set<InterfaceC1369790lkX> LLJJJJLIIL = new LinkedHashSet();
    public final Set<InterfaceC1369790lkX> LLJJL = new LinkedHashSet();
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public File LLJL;
    public Long LLJLIL;
    public Long LLJLILLLLZIIL;
    public Long LLJLL;
    public final C01GW LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialAvatarDownloadShareFragment.class, "avatarDownloadShareVM", "getAvatarDownloadShareVM()Lcom/ss/android/ugc/profile/business/ur/socialavatar/SocialAvatarDownloadShareVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLLL = new C1378160ly2();
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public SocialAvatarDownloadShareFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarDownloadShareVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 1160);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(304);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1161), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new AwS565S0100000_21((Fragment) this, 1162), aFwS259S0000000_21, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1163), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJLIIIJLLLLLLLZ = assemVMLazy;
        this.LLJLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(416));
    }

    public final SocialAvatarDownloadShareVM SR() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (SocialAvatarDownloadShareVM) assemVMLazy.getValue();
    }

    public final void UR() {
        SurfaceView surfaceView = this.LLJJIJIL;
        if (surfaceView != null) {
            C786410Ut5.H7(surfaceView, null);
        }
        C0HWW c0hww = C0HWW.LIZ;
        String str = this.LLJJI;
        if (str == null) {
            str = "";
        }
        float fLongValue = this.LLJLILLLLZIIL != null ? r0.longValue() : -1.0f;
        c0hww.getClass();
        C0HWW.LJIILL(fLongValue, "close", str);
        if (this.LLJLIL == null) {
            String str2 = this.LLJJI;
            if (str2 == null) {
                str2 = "";
            }
            C0HWW.LJIJJ("close", "composition_failure", str2);
        }
        if (this.LLJLL == null) {
            C0HWW.LJIILJJIL("close", "");
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS252S0000000_16.get$arr$(361));
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        SurfaceView surfaceView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        int iLIZIZ2;
        float f;
        float f2;
        C438450HHf c438450HHf;
        C0HFV c0hfv;
        URI uri;
        super.onViewCreated(view, bundle);
        this.LLJJIJI = (SmartImageView) view.findViewById(R.id.bok);
        File file = this.LLIZ;
        if (file == null || (uri = file.toURI()) == null || (string = uri.toString()) == null) {
            string = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(string);
        c1331670kl3LJIIIZ.LJJ(this.LLJJIJI);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        Integer num = this.LLJILJILJ;
        if (num != null) {
            C0HFS c0hfsLIZ = C0HFT.LIZ(num.intValue());
            SmartImageView smartImageView = this.LLJJIJI;
            if (smartImageView != null) {
                if (c0hfsLIZ != null && (c438450HHf = c0hfsLIZ.LJ) != null && (c0hfv = c438450HHf.LJFF) != null) {
                    f2 = c0hfv.LIZLLL;
                } else {
                    f2 = 1.0f;
                }
                C786410Ut5.u5(smartImageView, f2);
            }
        }
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.hfi);
        SurfaceView surfaceView2 = (SurfaceView) view.findViewById(R.id.gcz);
        if (surfaceView2 != null) {
            ViewGroup.LayoutParams layoutParams = surfaceView2.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int iLJIIIIZZ = C12ES.LJIIIIZZ(surfaceView2.getContext()) + C12ES.LJIIJJI(surfaceView2.getContext());
                float fLJIIJ = C12ES.LJIIJ(surfaceView2.getContext());
                if (fLJIIJ > C12ES.LIZJ(600.0f, surfaceView2.getContext())) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(376));
                } else if (iLJIIIIZZ <= C12ES.LIZJ(667.0f, surfaceView2.getContext())) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(256));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(326));
                }
                if (fLJIIJ > C12ES.LIZJ(600.0f, surfaceView2.getContext())) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(469.42d)));
                } else if (iLJIIIIZZ <= C12ES.LIZJ(667.0f, surfaceView2.getContext())) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(319.61d)));
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(407));
                }
                float f3 = iLJIIIIZZ;
                if (f3 < C12ES.LIZJ(640.0f, surfaceView2.getContext())) {
                    f = 0.11f;
                } else {
                    f = 0.18f;
                }
                marginLayoutParams.topMargin = Math.max(0, (int) ((f3 * f) - C12ES.LJIIJJI(surfaceView2.getContext())));
                marginLayoutParams.width = iLIZIZ;
                marginLayoutParams.height = iLIZIZ2;
                C786410Ut5.H7(surfaceView2, new ACListenerS155S0100000_21(this, 270));
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.U5(surfaceView2, marginLayoutParams);
        } else {
            surfaceView2 = null;
        }
        this.LLJJIJIL = surfaceView2;
        this.LLJJJ = (C1369580lkC) view.findViewById(R.id.user_avatar_share_channel_bar);
        View viewFindViewById = view.findViewById(R.id.v2f);
        this.LLJJJIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(4, viewFindViewById);
        }
        C1369580lkC c1369580lkC = this.LLJJJ;
        if (c1369580lkC != null) {
            c1369580lkC.setSquareStyle(true);
        }
        final C19EG activity = getActivity();
        final Context context = getContext();
        if (context != null) {
            C1377070lwH c1377070lwH = new C1377070lwH(new InterfaceC1378050lxr() { // from class: X.0ly4
                @Override // X.InterfaceC1378050lxr
                public final Activity get() {
                    return activity;
                }
            }, AFwS259S0000000_21.get$arr$(433));
            this.LLJJJJJIL.addAll(C1374550lsD.LIZ(new ShareContentType[]{ShareContentType.LINK_PLUS_VIDEO}, c1377070lwH));
            this.LLJJJJLIIL.addAll(C1374550lsD.LIZ(new ShareContentType[]{ShareContentType.VIDEO}, c1377070lwH));
            this.LLJJL.addAll(C1374550lsD.LIZ(new ShareContentType[]{ShareContentType.LINK}, c1377070lwH));
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.LLJJJJJIL);
            arrayList.addAll(this.LLJJJJLIIL);
            arrayList.addAll(this.LLJJL);
            boolean z = !C516560KNq.LIZ(context, "com.facebook.katana");
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((InterfaceC1369790lkX) obj).key())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) obj2;
                if (!Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy") && (!z || !Intrinsics.LJFF(interfaceC1369790lkX.key(), "facebook"))) {
                    arrayList3.add(obj2);
                }
            }
            List<InterfaceC1369790lkX> listLJ = C621180OYa.LIZ.LJ(context, arrayList3);
            if (listLJ != null) {
                this.LLJJJJ = listLJ;
                List listLJIIJJI = C1697810uHb.LJIIJJI("facebook", "facebook_lite", "facebook_group");
                List listLJIIJJI2 = C1697810uHb.LJIIJJI("instagram", "instagram_story", "instagram_dm");
                C531650Kt9 it2 = C1697810uHb.LJIIIZ(listLJ).iterator();
                loop2: while (true) {
                    int i = 0;
                    int i2 = 0;
                    while (it2.LLILLL) {
                        int iNextInt = it2.nextInt();
                        InterfaceC1369790lkX interfaceC1369790lkX2 = (InterfaceC1369790lkX) ListProtector.get(listLJ, iNextInt);
                        if (listLJIIJJI.contains(interfaceC1369790lkX2.key())) {
                            i++;
                        } else if (listLJIIJJI2.contains(interfaceC1369790lkX2.key())) {
                            i2++;
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        if (i == 3 || i2 == 3) {
                            int i3 = iNextInt + 1;
                            if (Intrinsics.LJFF(((InterfaceC1369790lkX) ListProtector.get(listLJ, i3)).key(), "more")) {
                                Object obj3 = ListProtector.get(listLJ, iNextInt);
                                Object obj4 = ListProtector.get(listLJ, i3);
                                ListProtector.remove(listLJ, i3);
                                ListProtector.remove(listLJ, iNextInt);
                                ListProtector.add(listLJ, iNextInt, obj4);
                                ListProtector.add(listLJ, i3, obj3);
                            } else if (iNextInt >= 3) {
                                int i4 = iNextInt - 2;
                                int i5 = iNextInt - 3;
                                Object obj5 = ListProtector.get(listLJ, i4);
                                Object obj6 = ListProtector.get(listLJ, i5);
                                ListProtector.remove(listLJ, i4);
                                ListProtector.remove(listLJ, i5);
                                ListProtector.add(listLJ, i5, obj6);
                                ListProtector.add(listLJ, i5, obj5);
                            }
                        }
                    }
                    break loop2;
                }
                List<InterfaceC1369790lkX> list = this.LLJJJJ;
                if (list != null) {
                    C1369580lkC c1369580lkC2 = this.LLJJJ;
                    if (c1369580lkC2 != null) {
                        c1369580lkC2.LJIIZILJ(list, false);
                    }
                    C1369580lkC c1369580lkC3 = this.LLJJJ;
                    if (c1369580lkC3 != null) {
                        c1369580lkC3.LLJJ = new InterfaceC1368050lhj() { // from class: X.0ltZ
                            @Override // X.InterfaceC1368050lhj
                            public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX3, View view2) {
                                String absolutePath;
                                SocialAvatarDownloadShareFragment socialAvatarDownloadShareFragment = this.LL;
                                String strKey = interfaceC1369790lkX3.key();
                                socialAvatarDownloadShareFragment.getClass();
                                C0LAB c0lab = new C0LAB();
                                c0lab.LJ("enter_from", "social_avatar_download_share_page");
                                c0lab.LJ("author_id", socialAvatarDownloadShareFragment.LLJJ);
                                c0lab.LJ("platform", strKey);
                                C20684815ws.LJIILLIIL("share_person", c0lab.LIZ);
                                SocialAvatarDownloadShareFragment socialAvatarDownloadShareFragment2 = this.LL;
                                Context context2 = context;
                                File file2 = socialAvatarDownloadShareFragment2.LLJL;
                                if (file2 != null && (absolutePath = file2.getAbsolutePath()) != null) {
                                    C259800zU c259800zU = new C259800zU();
                                    if (socialAvatarDownloadShareFragment2.LLJJJJJIL.contains(interfaceC1369790lkX3)) {
                                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(socialAvatarDownloadShareFragment2), null, null, new C1375380ltY(socialAvatarDownloadShareFragment2, interfaceC1369790lkX3, c259800zU, absolutePath, context2, null), 3);
                                        return;
                                    }
                                    if (socialAvatarDownloadShareFragment2.LLJJJJLIIL.contains(interfaceC1369790lkX3)) {
                                        C1374270lrl c1374270lrl = new C1374270lrl(C1374720lsU.LJFF(C1374720lsU.LIZIZ(), absolutePath), null, null, null, 60);
                                        String str = c1374270lrl.LJ;
                                        if (str == null) {
                                            str = "";
                                        }
                                        c1374270lrl.LIZIZ("content_url", str);
                                        c1374270lrl.LIZIZ("media_type", "video/*");
                                        interfaceC1369790lkX3.LJIJ(c1374270lrl, context2, null);
                                        return;
                                    }
                                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(socialAvatarDownloadShareFragment2), null, null, new C1074920e4w(socialAvatarDownloadShareFragment2, interfaceC1369790lkX3, context2, null), 3);
                                }
                            }
                        };
                    }
                }
            }
        }
        Context context2 = getContext();
        if (context2 != null && (surfaceView = this.LLJJIJIL) != null) {
            SocialAvatarDownloadShareVM socialAvatarDownloadShareVMSR = SR();
            SocialAvatarDownloadArgument socialAvatarDownloadArgument = new SocialAvatarDownloadArgument(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, null, null);
            try {
                File file2 = socialAvatarDownloadArgument.downloadCardResource;
                if (file2 != null) {
                    File file3 = socialAvatarDownloadArgument.downloadMaskResource;
                    if (file3 != null) {
                        File file4 = socialAvatarDownloadArgument.staticAvatarResource;
                        if (file4 != null) {
                            File file5 = socialAvatarDownloadArgument.dynamicAvatarResource;
                            if (file5 != null) {
                                File file6 = socialAvatarDownloadArgument.downloadStaticBackgroundResource;
                                if (file6 != null) {
                                    C1463680oBy c1463680oBy = new C1463680oBy(file2, file3, file6, file4, file5, context2);
                                    socialAvatarDownloadShareVMSR.LLILLJJLI = c1463680oBy;
                                    c1463680oBy.LJII(surfaceView);
                                } else {
                                    throw new Exception("downloadStaticResource is null");
                                }
                            } else {
                                throw new Exception("dynamicAvatarResource is null");
                            }
                        } else {
                            throw new Exception("staticAvatarResource is null");
                        }
                    } else {
                        throw new Exception("downloadMaskResource is null");
                    }
                } else {
                    throw new Exception("downloadCardResource is null");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0ly8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj7) {
                return ((C1378210ly7) obj7).LL;
            }
        }, null, new AwS635S0100000_21(this, 195), 6);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0ly9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj7) {
                return ((C1378210ly7) obj7).LLILLJJLI;
            }
        }, null, new AwS635S0100000_21(this, 196), 6);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0lyA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj7) {
                return ((C1378210ly7) obj7).LLILLL;
            }
        }, null, new AwS635S0100000_21(this, 197), 6);
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 161));
        }
        Context context3 = getContext();
        if (context3 != null) {
            SocialAvatarDownloadShareVM socialAvatarDownloadShareVMSR2 = SR();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(socialAvatarDownloadShareVMSR2), C0PEM.LIZJ, null, new C1378150ly1(new SocialAvatarDownloadArgument(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, null, null), socialAvatarDownloadShareVMSR2, context3, null), 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.edr, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
