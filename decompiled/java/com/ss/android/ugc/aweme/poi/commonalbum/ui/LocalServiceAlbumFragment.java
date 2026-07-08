package com.ss.android.ugc.aweme.poi.commonalbum.ui;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0H7E;
import X.C0HVP;
import X.C0HVQ;
import X.C0ZP4;
import X.C108600b6;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1189060h32;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1203204nG;
import X.C123100dR;
import X.C1388190mED;
import X.C1391190mJ3;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C15WJ;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C168Q;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C19741112Lp;
import X.C19EG;
import X.C19F0;
import X.C19GS;
import X.C21505619Eg;
import X.C2217381BqS;
import X.C2255108sX;
import X.C2360309Mr;
import X.C338490DOt;
import X.C343970De7;
import X.C442090HVf;
import X.C442100HVg;
import X.C442110HVh;
import X.C442140HVk;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C5185020h;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.RunnableC2359909Mn;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS235S0000000_6;
import kotlin.jvm.internal.AwS2S1010000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalServiceAlbumFragment extends BaseFragment implements InterfaceC724530SbT, ITTLSPhotoAbility {
    public static final C442140HVk LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEwJyghJiHELIOSEyJCc5JGEmIWsAJiwyJBYpOzk6KyANJS0mJQM+KCg+LSs4";
    public final AssemVMLazy LLIZ;
    public Function1<? super C2360309Mr, Unit> LLIZLLLIL;
    public C442110HVh LLJ;
    public C19F0<Intent> LLJI;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0HVk] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalServiceAlbumFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/commonalbum/viewmodel/LocalServiceAlbumVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(LocalServiceAlbumFragment.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiLayoutLocalServiceAlbumBinding;", 0)};
        LLJIJIL = new Object() { // from class: X.0HVk
        };
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

    public LocalServiceAlbumFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocalServiceAlbumVM.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 502);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(245);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 503), aFwS236S0000000_6, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new AwS550S0100000_6((Fragment) this, 504), aFwS236S0000000_6, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 505), aFwS236S0000000_6, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        new AwS235S0000000_6(0);
    }

    public final LocalServiceAlbumVM SR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (LocalServiceAlbumVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.commonalbum.ui.ITTLSPhotoAbility
    public final void u3() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, ITTLSPhotoAbility.class, null);
        if (interfaceC494301wDLIZ != null) {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (!(invocationHandler instanceof C2255108sX)) {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
                C19719512Dh.LIZ(((C2255108sX) invocationHandler).LL).remove(this);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                if (Intrinsics.LJFF(interfaceC494301wDLIZ, this)) {
                    C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, ITTLSPhotoAbility.class, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.commonalbum.ui.ITTLSPhotoAbility
    public final void zU1() {
        Context context = getContext();
        if (context != null) {
            C19741112Lp.LIZ.getClass();
            Intent intentLIZJ = C19741112Lp.LIZJ(context);
            C19F0<Intent> c19f0 = this.LLJI;
            if (c19f0 != null) {
                c19f0.LIZ(intentLIZJ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.commonalbum.ui.ITTLSPhotoAbility
    public final void WW1(MediaModel mediaModel) {
        LocalServiceAlbumVM localServiceAlbumVMSR = SR();
        CopyOnWriteArrayList<C0H7E> copyOnWriteArrayList = ((C0HVP) localServiceAlbumVMSR.getState()).LLIZLLLIL.LIZ;
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        Iterator<C0H7E> it2 = copyOnWriteArrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZ, mediaModel)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        for (C0H7E c0h7e : copyOnWriteArrayList) {
            int i3 = i + 1;
            if (i >= 0) {
                C0H7E c0h7e2 = c0h7e;
                if (i > i2) {
                    c0h7e2.LIZIZ--;
                }
                i = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C15WJ.LIZ(copyOnWriteArrayList, new AwS585S0100000_6(mediaModel, 459));
        if (C1203204nG.LIZ()) {
            localServiceAlbumVMSR.BQ2(copyOnWriteArrayList);
        }
        localServiceAlbumVMSR.setState(new AwS585S0100000_6((CopyOnWriteArrayList) copyOnWriteArrayList, (CopyOnWriteArrayList<C0H7E>) 460));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceAlbumFragment for r11v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceAlbumFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.commonalbum.ui.ITTLSPhotoAbility
    public final void vK0(MediaModel mediaModel) {
        int i;
        String str;
        AlbumTrackParams albumTrackParams;
        C19EG c19egLIZIZ;
        LocalServiceAlbumVM localServiceAlbumVMSR = SR();
        C442110HVh c442110HVh = localServiceAlbumVMSR.LLJI;
        if (c442110HVh != null) {
            i = c442110HVh.LJ;
        } else {
            i = 0;
        }
        CopyOnWriteArrayList<C0H7E> copyOnWriteArrayList = ((C0HVP) localServiceAlbumVMSR.getState()).LLIZLLLIL.LIZ;
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        boolean z = true;
        if (copyOnWriteArrayList.size() >= i) {
            localServiceAlbumVMSR.setState(AFwS236S0000000_6.get$arr$(579));
        } else {
            copyOnWriteArrayList.add(new C0H7E(mediaModel, copyOnWriteArrayList.size() + 1));
            if (C1203204nG.LIZ()) {
                localServiceAlbumVMSR.BQ2(copyOnWriteArrayList);
            }
            localServiceAlbumVMSR.setState(new AwS585S0100000_6((CopyOnWriteArrayList) copyOnWriteArrayList, (CopyOnWriteArrayList<C0H7E>) 458));
        }
        if (((Number) C108600b6.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        Map<String, String> map = null;
        if (z) {
            String strLJFF = mediaModel.LJFF();
            if (C123100dR.LIZ(strLJFF) && strLJFF != null) {
                LocalServiceAlbumVM localServiceAlbumVMSR2 = SR();
                Context context = getContext();
                if (context != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context);
                } else {
                    c19egLIZIZ = null;
                }
                List listSingletonList = Collections.singletonList(strLJFF);
                if (c19egLIZIZ != null) {
                    localServiceAlbumVMSR2.LLJILJILJ.execute(new RunnableC2359909Mn(c19egLIZIZ, listSingletonList, localServiceAlbumVMSR2.LLJI, AFwS231S0000000_3.get$arr$(303)));
                }
            }
        }
        if (SR().LLILLJJLI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        PageFinder pageFinderVia = PageFinder.via((Fragment) this);
        C442110HVh c442110HVh2 = this.LLJ;
        if (c442110HVh2 != null && (albumTrackParams = c442110HVh2.LJFF) != null) {
            map = albumTrackParams.generalMobParams;
        }
        C442090HVf.LIZLLL(pageFinderVia, "image_click", str, map);
        SR().LLILLJJLI = false;
    }

    @Override // com.ss.android.ugc.aweme.poi.commonalbum.ui.ITTLSPhotoAbility
    public final void Bt1(boolean z, String str) {
        C19EG c19egLIZIZ;
        String str2;
        AlbumTrackParams albumTrackParams;
        SR().setState(new AwS2S1010000_6(str, z, 1));
        SR().setState(new AwS21S0010000_6(false, 28));
        int iZQ2 = SR().zQ2();
        boolean zYQ2 = SR().yQ2();
        String strXQ2 = SR().xQ2();
        Context context = getContext();
        Map<String, String> map = null;
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        PageFinder pageFinderVia = PageFinder.via(c19egLIZIZ);
        C442110HVh c442110HVh = SR().LLJI;
        if (c442110HVh != null && (albumTrackParams = c442110HVh.LJFF) != null) {
            map = albumTrackParams.generalMobParams;
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        C1189060h32.LJJ("eligible_post_image_cnt", String.valueOf(iZQ2), linkedHashMap);
        if (zYQ2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C1189060h32.LJJ("is_camera_available", str2, linkedHashMap);
        C1189060h32.LJJ("album_available_type", strXQ2, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_album_switch_click", linkedHashMap, c1185050gwZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Map<String, String> map;
        String str2;
        AlbumTrackParams albumTrackParams;
        AlbumTrackParams albumTrackParams2;
        super.onViewCreated(view, bundle);
        Map<String, String> map2 = null;
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 439), 3);
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 440), 3);
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 441), 3);
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 442), 3);
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 443), 3);
        C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 444), 3);
        this.LLJI = registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.0HVi
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                Context context = this.LIZ.getContext();
                if (context != null) {
                    this.LIZ.SR().vQ2(context);
                }
            }
        });
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0HVj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new C5185020h(this, 53), 4);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0HVT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 173), 4);
        C736680Sv4.LJIIIZ(this, SR(), new C2217381BqS() { // from class: X.0HVV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0HVR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HVP) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS655S0100000_6(this, 16), 8);
        SR().setState(new AwS585S0100000_6(C0HVQ.ALBUM_PERMISSION_CHECK, 461));
        Context context = getContext();
        if (context != null) {
            SR().vQ2(context);
        }
        Context context2 = getContext();
        if (context2 != null) {
            int iZQ2 = SR().zQ2();
            boolean zLIZIZ = C442100HVg.LIZIZ(context2, new String[]{"android.permission.CAMERA"});
            if (C442100HVg.LIZIZ(context2, (String[]) C442100HVg.LIZ.getValue())) {
                str = "total";
            } else if (C442100HVg.LIZ(context2)) {
                str = "partial";
            } else {
                str = "none";
            }
            PageFinder pageFinderVia = PageFinder.via((Fragment) this);
            C442110HVh c442110HVh = this.LLJ;
            if (c442110HVh != null && (albumTrackParams2 = c442110HVh.LJFF) != null) {
                map = albumTrackParams2.generalMobParams;
            } else {
                map = null;
            }
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null && (!map.isEmpty())) {
                linkedHashMap.putAll(map);
            }
            C1189060h32.LJJ("eligible_post_image_cnt", String.valueOf(iZQ2), linkedHashMap);
            if (zLIZIZ) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C1189060h32.LJJ("is_camera_available", str2, linkedHashMap);
            C1189060h32.LJJ("album_available_type", str, linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_album_page_show", linkedHashMap, c1185050gwZ);
            PageFinder pageFinderVia2 = PageFinder.via((Fragment) this);
            C442110HVh c442110HVh2 = this.LLJ;
            if (c442110HVh2 != null && (albumTrackParams = c442110HVh2.LJFF) != null) {
                map2 = albumTrackParams.generalMobParams;
            }
            C442090HVf.LIZLLL(pageFinderVia2, "container_show", "", map2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.e42, viewGroup, false);
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
