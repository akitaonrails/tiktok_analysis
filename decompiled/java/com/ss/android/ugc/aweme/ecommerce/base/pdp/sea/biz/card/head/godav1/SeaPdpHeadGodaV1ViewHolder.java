package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.godav1;

import X.AbstractC1764240w0k;
import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C04FS;
import X.C04FY;
import X.C04G1;
import X.C0QSJ;
import X.C1054104Ah;
import X.C1120604Zw;
import X.C11EA;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1697810uHb;
import X.C1713070ugD;
import X.C1743750vTh;
import X.C1745060vVo;
import X.C1750140ve0;
import X.C1755850vnD;
import X.C1764130w0Z;
import X.C1764140w0a;
import X.C1764480w18;
import X.C1764510w1B;
import X.C1764560w1G;
import X.C1764780w1c;
import X.C1764840w1i;
import X.C1765020w20;
import X.C19719912Dl;
import X.C1AQS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.EnumC1764120w0Y;
import X.InterfaceC1146704e9;
import X.InterfaceC1755440vmY;
import X.InterfaceC1764620w1M;
import X.InterfaceC1764720w1W;
import X.InterfaceC1766040w3e;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC713360RyY;
import Y.ARunnableS95S0200000_26;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.SeaHeadViewHolderScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.pendant.ISeaPendantHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.PDPSeaHeaderConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadFeatures;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.godav1.SeaPdpHeadGodaV1ViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonutils.CommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpHeadGodaV1ViewHolder extends AbsFullSpanVH<C04FS> implements InterfaceC1766040w3e, InterfaceC1764720w1W, InterfaceC1755440vmY, InterfaceC713360RyY, C0QSJ, InterfaceC1146704e9 {
    public final Fragment LLJJIJIL;
    public final C1764130w0Z LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public C1764510w1B LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C1764560w1G LLJLLL;
    public ISeaHeadContainerHelper LLJZ;
    public ISeaHeadImageHelper LLJZIJLIL;
    public ISeaListHelper LLL;
    public ISeaPendantHelper LLLF;
    public ISeaTrackHelper LLLFF;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ISeaHeadContainerHelper.class) {
            this.LLJZ = (ISeaHeadContainerHelper) obj;
        } else if (cls == ISeaHeadImageHelper.class) {
            this.LLJZIJLIL = (ISeaHeadImageHelper) obj;
        } else if (cls == ISeaListHelper.class) {
            this.LLL = (ISeaListHelper) obj;
        } else if (cls == ISeaPendantHelper.class) {
            this.LLLF = (ISeaPendantHelper) obj;
        } else if (cls == ISeaTrackHelper.class) {
            this.LLLFF = (ISeaTrackHelper) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SeaPdpFragmentScope.class, SeaHeadViewHolderScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ISeaHeadContainerHelper.class) {
            return this.LLJZ;
        }
        if (cls == ISeaHeadImageHelper.class) {
            return this.LLJZIJLIL;
        }
        if (cls == ISeaListHelper.class) {
            return this.LLL;
        }
        if (cls == ISeaPendantHelper.class) {
            return this.LLLF;
        }
        if (cls == ISeaTrackHelper.class) {
            return this.LLLFF;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        arrayList.add(SeaHeadViewHolderScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaHeadViewHolderScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onStop() {
        b6(null);
        C1764130w0Z c1764130w0Z = this.LLJJJ;
        if (c1764130w0Z != null) {
            Iterator<T> it2 = c1764130w0Z.LLILLJJLI.getCurrentPendantMap().values().iterator();
            while (it2.hasNext()) {
                AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) it2.next();
                if ((abstractC1764240w0k instanceof InterfaceC1764620w1M) && abstractC1764240w0k.LL.getVisibility() == 0) {
                    ((InterfaceC1764620w1M) abstractC1764240w0k).LJII();
                }
            }
        }
    }

    @Override // X.InterfaceC1755440vmY
    public final void onViewAttachedToWindow() {
    }

    @Override // X.InterfaceC1755440vmY
    public final void onViewDetachedFromWindow() {
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ISeaHeadContainerHelper.class) {
            this.LLJZ = null;
        } else if (cls == ISeaHeadImageHelper.class) {
            this.LLJZIJLIL = null;
        } else if (cls == ISeaListHelper.class) {
            this.LLL = null;
        } else if (cls == ISeaPendantHelper.class) {
            this.LLLF = null;
        } else if (cls == ISeaTrackHelper.class) {
            this.LLLFF = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLJJJJ.getValue();
    }

    public final SeaPdpViewModel d6() {
        return (SeaPdpViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e6() {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.godav1.SeaPdpHeadGodaV1ViewHolder.e6():void");
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1558360qeg.LJ(this.itemView, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        AnonymousClass0317 anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin;
        this.itemView.setTag(R.id.ehk, C1558420qem.LIZIZ(this));
        C1764480w18 c1764480w18 = (C1764480w18) this.LLJL.getValue();
        c1764480w18.getClass();
        C687700QyG.LJIIIIZZ(c1764480w18);
        super.onCreate();
        C1713070ugD.LIZ(this);
        C1750140ve0.LIZ(this.itemView, false);
        C1764130w0Z c1764130w0Z = this.LLJJJ;
        if (c1764130w0Z != null) {
            c1764130w0Z.LIZ();
        }
        C1764130w0Z c1764130w0Z2 = this.LLJJJ;
        if (c1764130w0Z2 != null) {
            IPdpStarter.PdpEnterParam pdpEnterParam = d6().LLIZ;
            c1764130w0Z2.setFullScreenMode(pdpEnterParam != null && pdpEnterParam.fullScreen);
        }
        C1764130w0Z c1764130w0Z3 = this.LLJJJ;
        if (c1764130w0Z3 != null) {
            c1764130w0Z3.setListener(this);
        }
        C1764130w0Z c1764130w0Z4 = this.LLJJJ;
        if (c1764130w0Z4 != null) {
            c1764130w0Z4.setAdapter((C1764140w0a) this.LLJLIL.getValue());
        }
        C1764130w0Z c1764130w0Z5 = this.LLJJJ;
        if (c1764130w0Z5 != null) {
            Iterator<T> it2 = c1764130w0Z5.LLILLJJLI.getCurrentPendantMap().values().iterator();
            while (it2.hasNext()) {
                AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) it2.next();
                if ((abstractC1764240w0k instanceof InterfaceC1764620w1M) && abstractC1764240w0k.LL.getVisibility() == 0) {
                    ((InterfaceC1764620w1M) abstractC1764240w0k).LJFF();
                }
            }
        }
        d6().hR2(new C2217381BqS() { // from class: X.0vnH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SeaPdpMainState) obj).isFullScreen());
            }
        }, new AwS605S0100000_26(this, 202));
        SeaPdpViewModel seaPdpViewModelD6 = d6();
        C1755850vnD c1755850vnD = new C2217381BqS() { // from class: X.0vnD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((SeaPdpMainState) obj).getBottomSheetSlideOffset());
            }
        };
        C1765020w20 c1765020w20 = new C1765020w20();
        c1765020w20.LIZ = true;
        C11EA.LJI(this, seaPdpViewModelD6, c1755850vnD, c1765020w20, new AwS640S0100000_26(this, 19));
        PageStateContext pageStateContext = (PageStateContext) this.LLJLL.getValue();
        if (pageStateContext != null) {
            PageStateContext.LIZIZ(pageStateContext, "header_list_key", this.LLJLLL);
        }
        d6().hR2(new C2217381BqS() { // from class: X.0vnC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getScrollOffset());
            }
        }, new AwS605S0100000_26(this, 203));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = CommonUtilsDependencyService.createICommonUtilsDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICommonUtilsDependencyService.class.getName(), anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonUtilsDependencyService.class);
        }
        ((ICommonUtilsDependencyService) anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin).getConfigurationChangedManager().LIZ(C1745060vVo.LIZ(this), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        AnonymousClass0317 anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin;
        this.LLJL.getValue().getClass();
        C1743750vTh.LIZ(this);
        C1713070ugD.LIZIZ(this);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = CommonUtilsDependencyService.createICommonUtilsDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICommonUtilsDependencyService.class.getName(), anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonUtilsDependencyService.class);
        }
        ((ICommonUtilsDependencyService) anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin).getConfigurationChangedManager().LIZIZ(this);
        C1764130w0Z c1764130w0Z = this.LLJJJ;
        if (c1764130w0Z != null) {
            Iterator<T> it2 = c1764130w0Z.LLILLJJLI.getCurrentPendantMap().values().iterator();
            while (it2.hasNext()) {
                AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) it2.next();
                if ((abstractC1764240w0k instanceof InterfaceC1764620w1M) && abstractC1764240w0k.LL.getVisibility() == 0) {
                    ((InterfaceC1764620w1M) abstractC1764240w0k).LJI();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        C1764130w0Z c1764130w0Z = this.LLJJJ;
        if (c1764130w0Z != null) {
            Iterator<T> it2 = c1764130w0Z.LLILLJJLI.getCurrentPendantMap().values().iterator();
            while (it2.hasNext()) {
                AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) it2.next();
                if ((abstractC1764240w0k instanceof InterfaceC1764620w1M) && abstractC1764240w0k.LL.getVisibility() == 0) {
                    ((InterfaceC1764620w1M) abstractC1764240w0k).LJIIJ();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        C1764130w0Z c1764130w0Z = this.LLJJJ;
        if (c1764130w0Z != null) {
            Iterator<T> it2 = c1764130w0Z.LLILLJJLI.getCurrentPendantMap().values().iterator();
            while (it2.hasNext()) {
                AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) it2.next();
                if ((abstractC1764240w0k instanceof InterfaceC1764620w1M) && abstractC1764240w0k.LL.getVisibility() == 0) {
                    ((InterfaceC1764620w1M) abstractC1764240w0k).LJIIIIZZ();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        super.I5();
        C1764130w0Z c1764130w0Z = this.LLJJJ;
        if (c1764130w0Z != null) {
            Iterator<T> it2 = c1764130w0Z.LLILLJJLI.getCurrentPendantMap().values().iterator();
            while (it2.hasNext()) {
                AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) it2.next();
                if ((abstractC1764240w0k instanceof InterfaceC1764620w1M) && abstractC1764240w0k.LL.getVisibility() == 0) {
                    ((InterfaceC1764620w1M) abstractC1764240w0k).LIZLLL();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        C1764130w0Z c1764130w0Z = this.LLJJJ;
        if (c1764130w0Z != null) {
            Iterator<T> it2 = c1764130w0Z.LLILLJJLI.getCurrentPendantMap().values().iterator();
            while (it2.hasNext()) {
                AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) it2.next();
                if ((abstractC1764240w0k instanceof InterfaceC1764620w1M) && abstractC1764240w0k.LL.getVisibility() == 0) {
                    ((InterfaceC1764620w1M) abstractC1764240w0k).LIZ();
                }
            }
        }
    }

    @C14EU
    public final void onChangeHeaderViewIndexEvent(C1764780w1c c1764780w1c) {
        ISeaListHelper iSeaListHelper;
        if (Intrinsics.LJFF(c1764780w1c.LIZIZ, d6().getProductId()) && (iSeaListHelper = (ISeaListHelper) this.LLJLILLLLZIIL.getValue()) != null) {
            iSeaListHelper.Qi2(c1764780w1c.LIZ, EnumC1764120w0Y.BLACK_PAGE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCloseHeadViewEvent(X.C1764830w1h r10) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.godav1.SeaPdpHeadGodaV1ViewHolder.onCloseHeadViewEvent(X.0w1h):void");
    }

    @C14EU
    public final void onScreenshotCaptureEvent(C1764840w1i c1764840w1i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "picture_detail");
        linkedHashMap.put("previous_page", "product_detail");
        C1054104Ah c1054104Ah = d6().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJIL("", linkedHashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        List<ProductBannerLabel> list;
        int size;
        int i;
        int size2;
        Object obj2;
        Map<String, Object> map;
        ProductBase productBase;
        List<Image> list2;
        C04G1 currentCardNode;
        C04FY c04fy;
        List<C04G1> list3;
        List<String> list4;
        e6();
        if (!d6().LLLFF) {
            ProductPackStruct productPackStruct = d6().LLJIJIL;
            String str = null;
            if (productPackStruct != null) {
                list = productPackStruct.productBannerLabel;
            } else {
                list = null;
            }
            String strLIZIZ = "";
            if (list != null) {
                int i2 = 0;
                for (ProductBannerLabel productBannerLabel : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(productBannerLabel.eventTrackingName);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (i2 < list.size() - 1) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append(',');
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            C1764510w1B c1764510w1B = this.LLJJJJJIL;
            if (c1764510w1B != null && (list3 = c1764510w1B.LIZIZ) != null) {
                ArrayList arrayList = new ArrayList();
                for (C04G1 c04g1 : list3) {
                    SeaPdpHeadFeatures seaPdpHeadFeatures = c04g1.LJIL;
                    if (seaPdpHeadFeatures != null && (list4 = seaPdpHeadFeatures.tags) != null && list4.contains("video_group")) {
                        arrayList.add(c04g1);
                    }
                }
                size = arrayList.size();
            } else {
                size = 0;
            }
            C1764130w0Z c1764130w0Z = this.LLJJJ;
            if (c1764130w0Z != null && (currentCardNode = c1764130w0Z.getCurrentCardNode()) != null && (c04fy = currentCardNode.LJIJJLI) != null) {
                str = c04fy.LIZ;
            }
            boolean zLJFF = Intrinsics.LJFF(str, "video_style");
            C1054104Ah c1054104Ah = d6().LLJLIL;
            if (c1054104Ah != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> mapLJ = d6().LLLLL.LJ("c54417.d0");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : mapLJ.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.putAll(linkedHashMap2);
                ProductPackStruct productPackStruct2 = d6().LLJIJIL;
                if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null && (list2 = productBase.images) != null) {
                    Iterator<Image> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Image next = it2.next();
                        Integer sourceType = next.getSourceType();
                        if (sourceType != null && sourceType.intValue() == 1) {
                            if (next != null) {
                                i = 1;
                            }
                        }
                    }
                    i = 0;
                } else {
                    i = 0;
                }
                linkedHashMap.put("is_algo_cut", Integer.valueOf(i));
                Pair[] pairArr = new Pair[3];
                if (list != null) {
                    size2 = list.size();
                } else {
                    size2 = 0;
                }
                pairArr[0] = new Pair("rights_cnt", Integer.valueOf(size2));
                pairArr[1] = new Pair("rights_content", strLIZIZ);
                String str2 = "1";
                if (size > 0) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[2] = new Pair("has_video", obj2);
                linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(pairArr));
                PDPSeaHeaderConfig pDPSeaHeaderConfig = ((C04FS) this.LLILLJJLI).LL.config;
                if (pDPSeaHeaderConfig != null && (map = pDPSeaHeaderConfig.daInfo) != null) {
                    linkedHashMap.putAll(map);
                }
                if (!zLJFF) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("video_is_showing", str2);
                c1054104Ah.LJJIII("head_pic", false, null, null, linkedHashMap, null, null, null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0w1G] */
    public SeaPdpHeadGodaV1ViewHolder(ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        C1764130w0Z c1764130w0Z;
        super(new C1764130w0Z(viewGroup.getContext()));
        this.LLJJIJIL = eCBaseFragment;
        View view = this.itemView;
        if (view instanceof C1764130w0Z) {
            c1764130w0Z = (C1764130w0Z) view;
        } else {
            c1764130w0Z = null;
        }
        this.LLJJJ = c1764130w0Z;
        this.LLJJJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(2));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 11));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 2));
        this.LLJL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 7));
        this.LLJLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 6));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 8));
        this.LLJLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 9));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 10));
        this.LLJLLL = new IPageStateContextCallback() { // from class: X.0w1G
            @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback
            public final void invoke(Object obj, Object obj2) {
                SeaPdpHeadGodaV1ViewHolder seaPdpHeadGodaV1ViewHolder = this.LIZ;
                HandlerHook.viewPost(seaPdpHeadGodaV1ViewHolder.itemView, new ARunnableS95S0200000_26(seaPdpHeadGodaV1ViewHolder, obj2, 1));
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r7 == null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    @Override // X.InterfaceC1764720w1W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLL(int r14, X.EnumC1764120w0Y r15) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.godav1.SeaPdpHeadGodaV1ViewHolder.LLJLL(int, X.0w0Y):void");
    }

    @Override // X.InterfaceC1766040w3e
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C1764130w0Z c1764130w0Z = this.LLJJJ;
        if (c1764130w0Z != null) {
            c1764130w0Z.LIZ();
        }
    }

    public static String c6(int i, String str, String str2) {
        if (Intrinsics.LJFF(str, "video_style")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c54417.d93546_i");
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (Intrinsics.LJFF(str2, "spu_image")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("c54417.d11256_i");
            sbLIZ2.append(i);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (Intrinsics.LJFF(str2, "size_guide")) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("c54417.d8413_i");
            sbLIZ3.append(i);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return "";
    }
}
