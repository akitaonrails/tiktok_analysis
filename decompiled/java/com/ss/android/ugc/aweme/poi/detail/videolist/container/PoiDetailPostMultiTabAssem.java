package com.ss.android.ugc.aweme.poi.detail.videolist.container;

import X.C1188280h1m;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C166V;
import X.C1845930y8V;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C2217381BqS;
import X.C2255108sX;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1846110y8n;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostMultiTabAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailPostMultiTabAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C166V LLJJI = new C166V(new AwS597S0100000_18((UISlotAssem) this, 370));
    public boolean LLJJIII = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailPostMultiTabAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiDetailLayoutListMultiTabBinding;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e0g;
    }

    public final C1188280h1m hp() {
        C166V c166v = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (C1188280h1m) c166v.LIZ(this);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, getContentView());
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IPoiDetailPostDataChangeAbility iPoiDetailPostDataChangeAbility = new IPoiDetailPostDataChangeAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostMultiTabAssem$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostDataChangeAbility
                public final void V02(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
                    Object obj;
                    String str;
                    IPoiDetailPostMultiTabAbility iPoiDetailPostMultiTabAbility;
                    Object obj2;
                    PoiListApi.PostTab postTab;
                    PoiDetailPostMultiTabAssem poiDetailPostMultiTabAssem = this.LL;
                    if (!poiDetailPostMultiTabAssem.LLJJIII) {
                        return;
                    }
                    int i = 0;
                    if (poiMergedListResponse != null) {
                        poiDetailPostMultiTabAssem.LLJJIII = false;
                        if (poiMergedListResponse != null && poiMergedListResponse.hasMultiTab$poi_release()) {
                            C786410Ut5.LJLLLLLL(0, this.LL.getContentView());
                            PoiDetailPostMultiTabAssem poiDetailPostMultiTabAssem2 = this.LL;
                            List<PoiListApi.PostTab> postTabList = poiMergedListResponse.getPostTabList();
                            String currentPostTabCode = poiMergedListResponse.getCurrentPostTabCode();
                            if (postTabList != null) {
                                poiDetailPostMultiTabAssem2.hp().LLILLJJLI.LJIIJJI();
                                for (PoiListApi.PostTab postTab2 : postTabList) {
                                    C1846060y8i c1846060y8i = poiDetailPostMultiTabAssem2.hp().LLILLJJLI;
                                    C1845940y8W c1845940y8WLJIIIZ = poiDetailPostMultiTabAssem2.hp().LLILLJJLI.LJIIIZ();
                                    c1845940y8WLJIIIZ.LIZIZ(postTab2.tabName);
                                    c1845940y8WLJIIIZ.LIZ = postTab2;
                                    c1846060y8i.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i.LLILZLL.size(), c1846060y8i.LLILZLL.isEmpty());
                                }
                            }
                            int tabCount = poiDetailPostMultiTabAssem2.hp().LLILLJJLI.getTabCount();
                            while (true) {
                                if (i >= tabCount) {
                                    break;
                                }
                                C1845940y8W c1845940y8WLJII = poiDetailPostMultiTabAssem2.hp().LLILLJJLI.LJII(i);
                                PoiListApi.PostTab postTab3 = null;
                                if (c1845940y8WLJII != null) {
                                    obj = c1845940y8WLJII.LIZ;
                                } else {
                                    obj = null;
                                }
                                if ((obj instanceof PoiListApi.PostTab) && (postTab = (PoiListApi.PostTab) obj) != null) {
                                    str = postTab.tabCode;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(str, currentPostTabCode)) {
                                    poiDetailPostMultiTabAssem2.hp().LLILLJJLI.LJIILL(c1845940y8WLJII, true);
                                    Fragment fragmentLJI2 = C724240Sb0.LJI(poiDetailPostMultiTabAssem2);
                                    if (fragmentLJI2 != null && (iPoiDetailPostMultiTabAbility = (IPoiDetailPostMultiTabAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), IPoiDetailPostMultiTabAbility.class, null)) != null) {
                                        if (c1845940y8WLJII != null) {
                                            obj2 = c1845940y8WLJII.LIZ;
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 instanceof PoiListApi.PostTab) {
                                            postTab3 = (PoiListApi.PostTab) obj2;
                                        }
                                        iPoiDetailPostMultiTabAbility.jL2(postTab3);
                                    }
                                } else {
                                    i++;
                                }
                            }
                            final PoiDetailPostMultiTabAssem poiDetailPostMultiTabAssem3 = this.LL;
                            poiDetailPostMultiTabAssem3.hp().LLILLJJLI.LIZ(new InterfaceC1846110y8n() { // from class: X.0h1l
                                @Override // X.InterfaceC1846110y8n
                                public final void LIZ(C1845940y8W c1845940y8W) {
                                    Fragment fragmentLJI3 = C724240Sb0.LJI(poiDetailPostMultiTabAssem3);
                                    if (fragmentLJI3 != null) {
                                        PoiListApi.PostTab postTab4 = null;
                                        IPoiDetailPostMultiTabAbility iPoiDetailPostMultiTabAbility2 = (IPoiDetailPostMultiTabAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI3, null), IPoiDetailPostMultiTabAbility.class, null);
                                        if (iPoiDetailPostMultiTabAbility2 != null) {
                                            Object obj3 = c1845940y8W.LIZ;
                                            if (obj3 instanceof PoiListApi.PostTab) {
                                                postTab4 = (PoiListApi.PostTab) obj3;
                                            }
                                            iPoiDetailPostMultiTabAbility2.Yq0(postTab4);
                                        }
                                    }
                                }

                                @Override // X.InterfaceC1846110y8n
                                public final void LIZIZ(C1845940y8W c1845940y8W) {
                                    Fragment fragmentLJI3 = C724240Sb0.LJI(poiDetailPostMultiTabAssem3);
                                    if (fragmentLJI3 != null) {
                                        PoiListApi.PostTab postTab4 = null;
                                        IPoiDetailPostMultiTabAbility iPoiDetailPostMultiTabAbility2 = (IPoiDetailPostMultiTabAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI3, null), IPoiDetailPostMultiTabAbility.class, null);
                                        if (iPoiDetailPostMultiTabAbility2 != null) {
                                            Object obj3 = c1845940y8W.LIZ;
                                            if (obj3 instanceof PoiListApi.PostTab) {
                                                postTab4 = (PoiListApi.PostTab) obj3;
                                            }
                                            iPoiDetailPostMultiTabAbility2.jL2(postTab4);
                                        }
                                    }
                                }

                                @Override // X.InterfaceC1846110y8n
                                public final void LIZJ(C1845940y8W c1845940y8W) {
                                    Fragment fragmentLJI3 = C724240Sb0.LJI(poiDetailPostMultiTabAssem3);
                                    if (fragmentLJI3 != null) {
                                        PoiListApi.PostTab postTab4 = null;
                                        IPoiDetailPostMultiTabAbility iPoiDetailPostMultiTabAbility2 = (IPoiDetailPostMultiTabAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI3, null), IPoiDetailPostMultiTabAbility.class, null);
                                        if (iPoiDetailPostMultiTabAbility2 != null) {
                                            Object obj3 = c1845940y8W.LIZ;
                                            if (obj3 instanceof PoiListApi.PostTab) {
                                                postTab4 = (PoiListApi.PostTab) obj3;
                                            }
                                            iPoiDetailPostMultiTabAbility2.Wa2(postTab4);
                                        }
                                    }
                                }
                            });
                            return;
                        }
                    }
                    C786410Ut5.LJLLLLLL(8, this.LL.getContentView());
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiDetailPostDataChangeAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiDetailPostDataChangeAbility, IPoiDetailPostDataChangeAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiDetailPostDataChangeAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiDetailPostDataChangeAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiDetailPostDataChangeAbility.class.getClassLoader(), new Class[]{IPoiDetailPostDataChangeAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiDetailPostDataChangeAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostDataChangeAbility");
                    }
                }
            }
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI2, null);
            IPoiDetailPostMultiTabClickAbility iPoiDetailPostMultiTabClickAbility = new IPoiDetailPostMultiTabClickAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostMultiTabAssem$loadAbility$2
                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostMultiTabClickAbility
                public final void LJLIIL() {
                    C1845930y8V c1845930y8V;
                    int tabCount = this.LL.hp().LLILLJJLI.getTabCount();
                    for (int i = 0; i < tabCount; i++) {
                        C1845940y8W c1845940y8WLJII = this.LL.hp().LLILLJJLI.LJII(i);
                        if (c1845940y8WLJII != null && (c1845930y8V = c1845940y8WLJII.LJFF) != null) {
                            c1845930y8V.setClickable(true);
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostMultiTabClickAbility
                public final void LLILZIL() {
                    C1845930y8V c1845930y8V;
                    int tabCount = this.LL.hp().LLILLJJLI.getTabCount();
                    for (int i = 0; i < tabCount; i++) {
                        C1845940y8W c1845940y8WLJII = this.LL.hp().LLILLJJLI.LJII(i);
                        if (c1845940y8WLJII != null && (c1845930y8V = c1845940y8WLJII.LJFF) != null) {
                            c1845930y8V.setClickable(false);
                        }
                    }
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLJFF2, IPoiDetailPostMultiTabClickAbility.class, null);
            if (interfaceC494301wDLIZ2 == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF2, iPoiDetailPostMultiTabClickAbility, IPoiDetailPostMultiTabClickAbility.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(interfaceC494301wDLIZ2);
                if (invocationHandler2 instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler2).LL.add(iPoiDetailPostMultiTabClickAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2255108sX c2255108sX2 = new C2255108sX();
                c2255108sX2.LL.add(iPoiDetailPostMultiTabClickAbility);
                c2255108sX2.LL.add((T) interfaceC494301wDLIZ2);
                Object objNewProxyInstance2 = Proxy.newProxyInstance(IPoiDetailPostMultiTabClickAbility.class.getClassLoader(), new Class[]{IPoiDetailPostMultiTabClickAbility.class}, c2255108sX2);
                if (objNewProxyInstance2 != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF2, (InterfaceC494301wD) objNewProxyInstance2, IPoiDetailPostMultiTabClickAbility.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.videolist.container.IPoiDetailPostMultiTabClickAbility");
            }
        }
    }
}
