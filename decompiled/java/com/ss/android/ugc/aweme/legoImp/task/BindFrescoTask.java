package com.ss.android.ugc.aweme.legoImp.task;

import X.C0B5Q;
import X.C0CCZ;
import X.C0VZ0;
import X.C2258961DbK;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.ARunnableS83S0000000_3;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.core.config.ILightenConfigOutService;
import com.bytedance.lighten.core.config.SRConfig;
import com.bytedance.lighten.core.config.SharpConfig;
import com.fackbook.drawee.DraweeConfigOutServiceDowngrade;
import com.fackbook.drawee.IDraweeConfigOutService;
import com.fackbook.imagepipeline.IImagePipelineOutService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.network.INetwork;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
@InterfaceC20234614Fk
public class BindFrescoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "BindFrescoTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!((Boolean) C2258961DbK.LIZIZ.getValue()).booleanValue()) {
            if (!((Boolean) C0B5Q.LIZ.getValue()).booleanValue()) {
                ServiceManager.get().bind(IDraweeConfigOutService.class, new ServiceProvider() { // from class: X.0kkL
                    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                    public final Object get() {
                        return new DraweeConfigOutServiceDowngrade();
                    }
                }).asSingleton();
                ServiceManager.get().bind(IImagePipelineOutService.class, new ServiceProvider() { // from class: X.0kkK
                    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                    public final Object get() {
                        return new IImagePipelineOutService() { // from class: X.0kgk
                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Bitmap.Config LIZ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1320070kSL<C1329770khz> LIZIZ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Long LIZJ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LIZLLL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1330460kj6 LJFF() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJI() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1330230kij LJII() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Integer LJIIIIZZ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1328230kfV LJIIIZ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJIIJ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Integer LJIIJJI() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1320070kSL<C1329770khz> LJIIL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final void LJIILIIL() {
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJIILJJIL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final C1329030kgn LJIILL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final void LJIILLIIL() {
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1325590kbF LJIIZILJ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJIJ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1328030kfB LJIJI() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final void LJIJJ() {
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final C1329030kgn LJIJJLI() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJIL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJJ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final C1328770kgN LJJI() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final HashMap<String, C1329030kgn> LJJIFFI() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJJII() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final C1328130kfL LJJIII() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1328250kfX LJJIIJ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJJIIJZLJL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1320070kSL<Boolean> LJJIIZ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1328710kgH<? extends C1328680kgE> LJJIIZI() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Set<InterfaceC1325670kbN> LJJIJ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final C1329060kgq LJJIJIIJI() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final C1328150kfN LJJIJIIJIL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJJIJIL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJJIJL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1320070kSL<C1329770khz> LJJIJLIJ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Boolean LJJIL() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1327000kdW LJJIZ() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final void LJJJ() {
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final InterfaceC1320070kSL<C1329770khz> LJJJI() {
                                return null;
                            }

                            @Override // com.fackbook.imagepipeline.IImagePipelineOutService
                            public final Context getContext() {
                                return null;
                            }
                        };
                    }
                }).asSingleton();
                ServiceManager.get().bind(ILightenConfigOutService.class, new ServiceProvider() { // from class: X.0kqY
                    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                    public final Object get() {
                        return new ILightenConfigOutService() { // from class: X.0kqU
                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Bitmap.Config LIZ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Integer LIZIZ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Long LIZJ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LIZLLL() {
                                return false;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final void LJ() {
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final InterfaceC1331200kkI LJFF() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Long LJII() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final C1332160klq LJIIIIZZ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJIIIZ() {
                                return false;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final InterfaceC1334020koq LJIIJ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final String[] LJIIJJI() {
                                return new String[0];
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final int LJIIL() {
                                return 0;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJIILIIL() {
                                return false;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final SRConfig LJIILJJIL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Long LJIILL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJIIZILJ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final String LJIJ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJIJI() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final File LJIJJLI() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final AbstractC1334330kpL LJIL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Map<String, Long> LJJ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJI() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Long LJJII() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Long LJJIIJZLJL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final InterfaceC1330810kjf LJJIIZI() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJJIJ() {
                                return false;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJIJIIJI() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final InterfaceC658750Psf LJJIJIIJIL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final InterfaceC1335580krM LJJIJIL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJJIJLIJ() {
                                return false;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final List<C1330790kjd> LJJIL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJJ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJJI() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Long LJJJIL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJJJI() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJJJJIZL() {
                                return false;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final SharpConfig LJJJJJL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Integer LJJJJLI() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final void LJJJJLL() {
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final void LJJJJZ() {
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJJJZI() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJJLIIL() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final void LJJJLL() {
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Long LJJJZ() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Context getContext() {
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final void isLocalTest() {
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final InterfaceC1334030kor LJJIJL() {
                                return new InterfaceC1334030kor() { // from class: X.0kqX
                                    @Override // X.InterfaceC1334030kor
                                    public final void LIZ() {
                                    }
                                };
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final InterfaceC1332280km2 LJJIZ() {
                                return new InterfaceC1332280km2() { // from class: X.0kqV
                                    @Override // X.InterfaceC1332280km2
                                    public final long LIZIZ() {
                                        return ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
                                    }
                                };
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final C437000HBq LJJJJ() {
                                return new C437000HBq();
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final InterfaceC1333840koY LJI() {
                                SettingsManager.LIZLLL().getClass();
                                if (SettingsManager.LIZ("tt_lighten_enable_auto_biz_tag", true)) {
                                    return new InterfaceC1333840koY() { // from class: X.0kqW
                                        @Override // X.InterfaceC1333840koY
                                        public final String LIZ() {
                                            return C2211631BhB.LJII();
                                        }
                                    };
                                }
                                return null;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJIILLIIL() {
                                SettingsManager.LIZLLL().getClass();
                                return SettingsManager.LIZ("tt_lighten_downgrade_cancellable", false);
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJJIIJ() {
                                SettingsManager.LIZLLL().getClass();
                                return SettingsManager.LIZ("lighten_attach_bug_fix_switch", true);
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJJIIZ() {
                                SettingsManager.LIZLLL().getClass();
                                return SettingsManager.LIZ("tt_lighten_downgrade_async", false);
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJJJJJ() {
                                SettingsManager.LIZLLL().getClass();
                                return SettingsManager.LIZ("tt_lighten_enable_fix_invalid_request", true);
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJJL() {
                                SettingsManager.LIZLLL().getClass();
                                return SettingsManager.LIZ("tt_lighten_url_expire_check", true);
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final boolean LJJLI() {
                                SettingsManager.LIZLLL().getClass();
                                return SettingsManager.LIZ("tt_lighten_enable_force_run_in_sub_thread", true);
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJIJJ() {
                                return Boolean.FALSE;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJIFFI() {
                                return Boolean.FALSE;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJIII() {
                                return Boolean.FALSE;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJJJL() {
                                return Boolean.FALSE;
                            }

                            @Override // com.bytedance.lighten.core.config.ILightenConfigOutService
                            public final Boolean LJJJLZIJ() {
                                return Boolean.FALSE;
                            }
                        };
                    }
                }).asSingleton();
            }
            C823050WQl.LIZJ().execute(new ARunnableS83S0000000_3(16));
        }
    }
}
