package com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed;

import X.C04TD;
import X.C0SZ8;
import X.C0T0K;
import X.C128Y;
import X.C1558420qem;
import X.C1558520qew;
import X.C1600700rky;
import X.C19EG;
import X.C2344009Gk;
import X.C294480BgU;
import X.C698670Rar;
import X.C715390S4j;
import X.C715400S4k;
import X.EnumC700430Rdh;
import X.InterfaceC1058480deQ;
import X.InterfaceC1566480qrm;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1603190roz;
import X.InterfaceC1756430vo9;
import X.InterfaceC1756810vol;
import X.InterfaceC20561815d2;
import X.InterfaceC214902198i;
import X.InterfaceC583370MuN;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes25.dex */
public final class CommonFeedDependService implements ICommonFeedDependService {
    public final ConcurrentHashMap<Function0<Unit>, InterfaceC20561815d2<VideoAdaptionResult>> _videoAdaptationListenerMap = new ConcurrentHashMap<>();

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public boolean isUnifyShrinkAbilityEnableFeedParams() {
        return C294480BgU.LIZ() >= 3;
    }

    public static ICommonFeedDependService createICommonFeedDependServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ICommonFeedDependService.class, z);
        if (objLIZ != null) {
            return (ICommonFeedDependService) objLIZ;
        }
        if (C04TD.d == null) {
            synchronized (ICommonFeedDependService.class) {
                if (C04TD.d == null) {
                    C04TD.d = new CommonFeedDependService();
                }
            }
        }
        return C04TD.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public InterfaceC1756430vo9 createECVideoShrinkAbility(Activity activity) {
        Fragment currentFragment;
        DetailFragmentPanel detailFragmentPanelJQ;
        C0SZ8 c0sz8LJLIL;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        final VideoShrinkAbility videoShrinkAbility;
        IDetailPageAbility iDetailPageAbilityLIZ;
        DetailPageFragment detailPageFragmentBc;
        DetailFragmentPanel detailFragmentPanelJQ2;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        IDetailPageAbility iDetailPageAbilityLIZ2;
        C128Y curFragment;
        ComponentCallbacks componentCallbacksUx;
        Object objLJLIL;
        AssemReusedContainer assemReusedContainer;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ3;
        InterfaceC1566480qrm interfaceC1566480qrm;
        BaseListFragmentPanel baseListFragmentPanelOs;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        C19EG c19eg;
        InterfaceC214902198i interfaceC214902198iLJIILLIIL;
        DetailFragmentPanel detailFragmentPanel;
        C0SZ8 c0sz8LJLIL3;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ4;
        if (activity instanceof InterfaceC1603190roz) {
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg)) != null && (interfaceC214902198iLJIILLIIL instanceof InterfaceC1058480deQ)) {
                DetailPageFragment detailPageFragmentBc2 = ((InterfaceC1058480deQ) interfaceC214902198iLJIILLIIL).Bc();
                if ((detailPageFragmentBc2 instanceof DetailPageFragment) && detailPageFragmentBc2 != null) {
                    detailFragmentPanel = detailPageFragmentBc2.LL;
                } else {
                    detailFragmentPanel = null;
                }
                if (!(detailFragmentPanel instanceof BaseListFragmentPanel) || detailFragmentPanel == null || (c0sz8LJLIL3 = detailFragmentPanel.LJLIL()) == null || (interfaceC665370Q7zLIZIZ4 = C0T0K.LIZIZ(c0sz8LJLIL3)) == null) {
                    return null;
                }
                videoShrinkAbility = (VideoShrinkAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ4, VideoShrinkAbility.class, null);
            } else {
                InterfaceC1603190roz interfaceC1603190roz = (InterfaceC1603190roz) activity;
                if (interfaceC1603190roz != null) {
                    curFragment = interfaceC1603190roz.getCurFragment();
                } else {
                    curFragment = null;
                }
                if ((curFragment instanceof InterfaceC1593630rZZ) && (interfaceC1593630rZZ = (InterfaceC1593630rZZ) curFragment) != null) {
                    componentCallbacksUx = interfaceC1593630rZZ.ux();
                } else {
                    componentCallbacksUx = null;
                }
                if ((componentCallbacksUx instanceof InterfaceC1566480qrm) && (interfaceC1566480qrm = (InterfaceC1566480qrm) componentCallbacksUx) != null && (baseListFragmentPanelOs = interfaceC1566480qrm.Os()) != null) {
                    objLJLIL = baseListFragmentPanelOs.LJLIL();
                } else {
                    objLJLIL = null;
                }
                if (!(objLJLIL instanceof VideoBaseCell) || (assemReusedContainer = (AssemReusedContainer) objLJLIL) == null || (interfaceC665370Q7zLIZIZ3 = C1558420qem.LIZIZ(assemReusedContainer)) == null) {
                    return null;
                }
                videoShrinkAbility = (VideoShrinkAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ3, VideoShrinkAbility.class, null);
            }
        } else if (activity instanceof InterfaceC1058480deQ) {
            InterfaceC1058480deQ interfaceC1058480deQ = (InterfaceC1058480deQ) activity;
            if (interfaceC1058480deQ != null) {
                detailPageFragmentBc = interfaceC1058480deQ.Bc();
            } else {
                detailPageFragmentBc = null;
            }
            if ((detailPageFragmentBc instanceof DetailPageFragment) && detailPageFragmentBc != null && (iDetailPageAbilityLIZ2 = C1600700rky.LIZ(detailPageFragmentBc)) != null) {
                detailFragmentPanelJQ2 = iDetailPageAbilityLIZ2.JQ();
            } else {
                detailFragmentPanelJQ2 = null;
            }
            if (!(detailFragmentPanelJQ2 instanceof BaseListFragmentPanel) || detailFragmentPanelJQ2 == null || (c0sz8LJLIL2 = detailFragmentPanelJQ2.LJLIL()) == null || (interfaceC665370Q7zLIZIZ2 = C0T0K.LIZIZ(c0sz8LJLIL2)) == null) {
                return null;
            }
            videoShrinkAbility = (VideoShrinkAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, VideoShrinkAbility.class, null);
        } else {
            if (!(activity instanceof InterfaceC583370MuN)) {
                return null;
            }
            InterfaceC583370MuN interfaceC583370MuN = (InterfaceC583370MuN) activity;
            if (interfaceC583370MuN != null) {
                currentFragment = interfaceC583370MuN.getCurrentFragment();
            } else {
                currentFragment = null;
            }
            if ((currentFragment instanceof DetailPageFragment) && currentFragment != null && (iDetailPageAbilityLIZ = C1600700rky.LIZ(currentFragment)) != null) {
                detailFragmentPanelJQ = iDetailPageAbilityLIZ.JQ();
            } else {
                detailFragmentPanelJQ = null;
            }
            if (!(detailFragmentPanelJQ instanceof BaseListFragmentPanel) || detailFragmentPanelJQ == null || (c0sz8LJLIL = detailFragmentPanelJQ.LJLIL()) == null || (interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(c0sz8LJLIL)) == null) {
                return null;
            }
            videoShrinkAbility = (VideoShrinkAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, VideoShrinkAbility.class, null);
        }
        if (videoShrinkAbility == null) {
            return null;
        }
        return new InterfaceC1756430vo9() { // from class: X.14ay
            @Override // X.InterfaceC1756430vo9
            public final void LIZIZ(Function0<Unit> function0) {
                CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) videoShrinkAbility), CellAdaptionComponentAbility.class, null);
                if (cellAdaptionComponentAbility != null) {
                    CommonFeedDependService commonFeedDependService = this;
                    InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2 = commonFeedDependService._videoAdaptationListenerMap.get(function0);
                    if (interfaceC20561815d2 != null) {
                        cellAdaptionComponentAbility.XX0(interfaceC20561815d2);
                        commonFeedDependService._videoAdaptationListenerMap.remove(function0);
                    }
                }
            }

            @Override // X.InterfaceC1756430vo9
            public final void LIZJ(final Function0<Unit> function0) {
                CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) videoShrinkAbility), CellAdaptionComponentAbility.class, null);
                if (cellAdaptionComponentAbility != null) {
                    CommonFeedDependService commonFeedDependService = this;
                    InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2 = new InterfaceC20561815d2<VideoAdaptionResult>() { // from class: X.14az
                        @Override // X.InterfaceC20561815d2
                        public final void LIZ(C0RAA c0raa) {
                            function0.invoke();
                        }
                    };
                    commonFeedDependService._videoAdaptationListenerMap.put(function0, interfaceC20561815d2);
                    cellAdaptionComponentAbility.aW0(interfaceC20561815d2, false);
                }
            }

            @Override // X.InterfaceC1756430vo9
            public final void LIZLLL(final AwS570S0100000_26 awS570S0100000_26) {
                final VideoShrinkAbility videoShrinkAbility2 = videoShrinkAbility;
                videoShrinkAbility2.EL(new InterfaceC1058490deR() { // from class: X.14b0
                    @Override // X.InterfaceC1058490deR
                    public final void LIZ(float f, float f2) {
                        awS570S0100000_26.invoke();
                        videoShrinkAbility2.CS(this);
                    }
                });
            }

            @Override // X.InterfaceC1756430vo9
            public final void LIZ(float f, float f2) {
                videoShrinkAbility.ob(f, f2, new C20571215eY(false, 0, 1023));
            }

            @Override // X.InterfaceC1756430vo9
            public final void t1(int i, int i2) {
                videoShrinkAbility.t1(i, i2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Aweme getCurrentAweme(Activity activity) {
        Fragment currentFragment;
        DetailFragmentPanel detailFragmentPanelJQ;
        C0SZ8 c0sz8LJLIL;
        IDetailPageAbility iDetailPageAbilityLIZ;
        DetailPageFragment detailPageFragmentBc;
        DetailFragmentPanel detailFragmentPanel;
        C0SZ8 c0sz8LJLIL2;
        C128Y curFragment;
        ComponentCallbacks componentCallbacksUx;
        InterfaceC1566480qrm interfaceC1566480qrm;
        BaseListFragmentPanel baseListFragmentPanelOs;
        C0SZ8 c0sz8LJLIL3;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        C19EG c19eg;
        InterfaceC214902198i interfaceC214902198iLJIILLIIL;
        DetailFragmentPanel detailFragmentPanel2;
        C0SZ8 c0sz8LJLIL4;
        if (activity instanceof InterfaceC1603190roz) {
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg)) != null && (interfaceC214902198iLJIILLIIL instanceof InterfaceC1058480deQ)) {
                DetailPageFragment detailPageFragmentBc2 = ((InterfaceC1058480deQ) interfaceC214902198iLJIILLIIL).Bc();
                if ((detailPageFragmentBc2 instanceof DetailPageFragment) && detailPageFragmentBc2 != null) {
                    detailFragmentPanel2 = detailPageFragmentBc2.LL;
                } else {
                    detailFragmentPanel2 = null;
                }
                if (!(detailFragmentPanel2 instanceof BaseListFragmentPanel) || detailFragmentPanel2 == null || (c0sz8LJLIL4 = detailFragmentPanel2.LJLIL()) == null) {
                    return null;
                }
                return c0sz8LJLIL4.getAweme();
            }
            InterfaceC1603190roz interfaceC1603190roz = (InterfaceC1603190roz) activity;
            if (interfaceC1603190roz != null) {
                curFragment = interfaceC1603190roz.getCurFragment();
            } else {
                curFragment = null;
            }
            if ((curFragment instanceof InterfaceC1593630rZZ) && (interfaceC1593630rZZ = (InterfaceC1593630rZZ) curFragment) != null) {
                componentCallbacksUx = interfaceC1593630rZZ.ux();
            } else {
                componentCallbacksUx = null;
            }
            if (!(componentCallbacksUx instanceof InterfaceC1566480qrm) || (interfaceC1566480qrm = (InterfaceC1566480qrm) componentCallbacksUx) == null || (baseListFragmentPanelOs = interfaceC1566480qrm.Os()) == null || (c0sz8LJLIL3 = baseListFragmentPanelOs.LJLIL()) == null) {
                return null;
            }
            return c0sz8LJLIL3.getAweme();
        }
        if (activity instanceof InterfaceC1058480deQ) {
            InterfaceC1058480deQ interfaceC1058480deQ = (InterfaceC1058480deQ) activity;
            if (interfaceC1058480deQ != null) {
                detailPageFragmentBc = interfaceC1058480deQ.Bc();
            } else {
                detailPageFragmentBc = null;
            }
            if ((detailPageFragmentBc instanceof DetailPageFragment) && detailPageFragmentBc != null) {
                detailFragmentPanel = detailPageFragmentBc.LL;
            } else {
                detailFragmentPanel = null;
            }
            if (!(detailFragmentPanel instanceof BaseListFragmentPanel) || detailFragmentPanel == null || (c0sz8LJLIL2 = detailFragmentPanel.LJLIL()) == null) {
                return null;
            }
            return c0sz8LJLIL2.getAweme();
        }
        if (!(activity instanceof InterfaceC583370MuN)) {
            return null;
        }
        InterfaceC583370MuN interfaceC583370MuN = (InterfaceC583370MuN) activity;
        if (interfaceC583370MuN != null) {
            currentFragment = interfaceC583370MuN.getCurrentFragment();
        } else {
            currentFragment = null;
        }
        if ((currentFragment instanceof DetailPageFragment) && currentFragment != null && (iDetailPageAbilityLIZ = C1600700rky.LIZ(currentFragment)) != null) {
            detailFragmentPanelJQ = iDetailPageAbilityLIZ.JQ();
        } else {
            detailFragmentPanelJQ = null;
        }
        if (!(detailFragmentPanelJQ instanceof BaseListFragmentPanel) || detailFragmentPanelJQ == null || (c0sz8LJLIL = detailFragmentPanelJQ.LJLIL()) == null) {
            return null;
        }
        return c0sz8LJLIL.getAweme();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public Fragment getCurrentFragmnet(Activity activity) {
        InterfaceC583370MuN interfaceC583370MuN;
        InterfaceC214902198i interfaceC214902198iLJIILLIIL;
        InterfaceC1058480deQ interfaceC1058480deQ;
        C19EG c19eg;
        C128Y curFragment;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        C19EG c19eg2;
        InterfaceC214902198i interfaceC214902198iLJIILLIIL2;
        if (activity instanceof InterfaceC1603190roz) {
            if ((activity instanceof C19EG) && (c19eg2 = (C19EG) activity) != null && (interfaceC214902198iLJIILLIIL2 = SAFExtensionKt.LJIILLIIL(c19eg2)) != null && (interfaceC214902198iLJIILLIIL2 instanceof InterfaceC1058480deQ)) {
                return ((InterfaceC1058480deQ) interfaceC214902198iLJIILLIIL2).Bc();
            }
            InterfaceC1603190roz interfaceC1603190roz = (InterfaceC1603190roz) activity;
            if (interfaceC1603190roz != null) {
                curFragment = interfaceC1603190roz.getCurFragment();
            } else {
                curFragment = null;
            }
            if (!(curFragment instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) curFragment) == null) {
                return null;
            }
            return interfaceC1593630rZZ.ux();
        }
        if (activity instanceof InterfaceC1058480deQ) {
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
            } else {
                interfaceC214902198iLJIILLIIL = null;
            }
            if (!(interfaceC214902198iLJIILLIIL instanceof InterfaceC1058480deQ) || (interfaceC1058480deQ = (InterfaceC1058480deQ) interfaceC214902198iLJIILLIIL) == null) {
                return null;
            }
            return interfaceC1058480deQ.Bc();
        }
        if (!(activity instanceof InterfaceC583370MuN) || (interfaceC583370MuN = (InterfaceC583370MuN) activity) == null) {
            return null;
        }
        return interfaceC583370MuN.getCurrentFragment();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public String getCurrentVideoId(Activity activity) {
        Video video;
        Aweme currentAweme = getCurrentAweme(activity);
        if (currentAweme != null && (video = currentAweme.getVideo()) != null) {
            return video.getVideoId();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public Pair<Integer, Integer> getCurrentVideoWidthAndHeight(Activity activity) {
        int width;
        Video video;
        Aweme currentAweme = getCurrentAweme(activity);
        int height = -1;
        if (currentAweme != null && (video = currentAweme.getVideo()) != null) {
            width = video.getWidth();
        } else {
            width = -1;
            if (currentAweme != null) {
            }
            return new Pair<>(Integer.valueOf(width), Integer.valueOf(height));
        }
        Video video2 = currentAweme.getVideo();
        if (video2 != null) {
            height = video2.getHeight();
        }
        return new Pair<>(Integer.valueOf(width), Integer.valueOf(height));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public InterfaceC1756810vol getFeedPlayerAbility(final Activity activity) {
        return new InterfaceC1756810vol() { // from class: X.0deV
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.fragment.app.Fragment] */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v8 */
            @Override // X.InterfaceC1756810vol
            public final void LIZ() {
                Fragment curFragment;
                Fragment fragmentLIZ;
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
                IPlayerComponentAbility iPlayerComponentAbilityX32;
                IPlayerComponentAbility iPlayerComponentAbilityX322;
                C19EG c19eg;
                FragmentManager supportFragmentManager;
                List<Fragment> listLJJLIIIJL;
                Activity activity2 = activity;
                ?? r3 = 0;
                Fragment fragment = null;
                r3 = 0;
                r3 = 0;
                r3 = 0;
                if ((activity2 instanceof C19EG) && (c19eg = (C19EG) activity2) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
                    for (Fragment fragment2 : listLJJLIIIJL) {
                        if ((fragment2 instanceof DetailPageFragment) || (fragment2 instanceof InterfaceC1603190roz)) {
                            fragment = fragment2;
                            break;
                        }
                    }
                    r3 = fragment;
                }
                if (r3 instanceof DetailPageFragment) {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ2 = C0T1R.LIZJ(r3);
                    if (iFeedPanelPlatformAbilityLIZJ2 == null || (iPlayerComponentAbilityX322 = iFeedPanelPlatformAbilityLIZJ2.x32()) == null) {
                        return;
                    }
                    iPlayerComponentAbilityX322.tryResumePlay();
                    return;
                }
                if (!(r3 instanceof InterfaceC1603190roz) || (curFragment = ((InterfaceC1603190roz) r3).getCurFragment()) == null || (fragmentLIZ = C1058520deU.LIZ(curFragment)) == null || (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragmentLIZ)) == null || (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ.x32()) == null) {
                    return;
                }
                iPlayerComponentAbilityX32.tryResumePlay();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void setDescDialogShowing(boolean z) {
        FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
        if (fypAutoScrollService != null) {
            fypAutoScrollService.setDescDialogShowing(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void tryUnifyECommerceAnchorBackground(View view) {
        if (!C715400S4k.LIZIZ()) {
            C715390S4j.LIZ(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void setComponentClickStatusExperimental(View view, EnumC700430Rdh enumC700430Rdh) {
        ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(view, enumC700430Rdh);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void tryAnchorChangeBackgroundWithRadiusV2(View view, int i) {
        C715390S4j.LIZJ(i, view);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void appendCntParams(C2344009Gk c2344009Gk, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void appendCheckParams(C2344009Gk c2344009Gk, Aweme aweme, String str, boolean z) {
        C698670Rar.LIZ.getClass();
        C698670Rar.LIZ(c2344009Gk, aweme, str, z);
    }
}
