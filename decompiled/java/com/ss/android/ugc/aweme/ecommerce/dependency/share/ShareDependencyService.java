package com.ss.android.ugc.aweme.ecommerce.dependency.share;

import X.AbstractC1389240mFu;
import X.AbstractC2361009My;
import X.C04TD;
import X.C0YNP;
import X.C1355090lMp;
import X.C1365870leD;
import X.C1372620lp6;
import X.C1388190mED;
import X.C1389170mFn;
import X.C14EU;
import X.C1599690rjL;
import X.C2188811AlT;
import X.InterfaceC1364520lc2;
import X.InterfaceC1389210mFr;
import X.InterfaceC1389220mFs;
import X.InterfaceC1389230mFt;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.AbsShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareDependencyService extends AbsShareDependencyService {
    public C1365870leD event;
    public final ConcurrentHashMap<AbstractC1389240mFu, AbstractC2361009My> screenShotListenerMap = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public String getShareProductKey() {
        return "product_query_params";
    }

    public static IShareDependencyService createIShareDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IShareDependencyService.class, z);
        if (objLIZ != null) {
            return (IShareDependencyService) objLIZ;
        }
        if (C04TD.R == null) {
            synchronized (IShareDependencyService.class) {
                if (C04TD.R == null) {
                    C04TD.R = new ShareDependencyService();
                }
            }
        }
        return C04TD.R;
    }

    private final String getTipsText(C1365870leD c1365870leD) {
        if (c1365870leD.LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Sent to ");
            sbLIZ.append(c1365870leD.LIZ.getDisplayName());
            sbLIZ.append(" and other users");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c1365870leD.LJII) {
            return "Group message sent";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Sent to ");
        sbLIZ2.append(c1365870leD.LIZ.getDisplayName());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.AbsShareDependencyService, com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void addScreenShotListener(final AbstractC1389240mFu abstractC1389240mFu) {
        if (abstractC1389240mFu == null) {
            return;
        }
        AbstractC2361009My abstractC2361009My = new AbstractC2361009My() { // from class: X.0mFq
            @Override // X.AbstractC2361009My
            public final Map<String, String> mobExtraParams() {
                abstractC1389240mFu.getClass();
                return null;
            }

            @Override // X.AbstractC2361009My
            public final boolean onShot(String str) {
                return abstractC1389240mFu.LIZ(str);
            }
        };
        IScreenshotService iScreenshotService = (IScreenshotService) PluggableExtentionKt.pluggableSpi$default(IScreenshotService.class, false, false, false, 14, null);
        if (iScreenshotService != null) {
            iScreenshotService.LJFF(abstractC2361009My);
            this.screenShotListenerMap.put(abstractC1389240mFu, abstractC2361009My);
        }
    }

    @C14EU
    public final void onShareEvent(C1365870leD c1365870leD) {
        if (!Intrinsics.LJFF("product", c1365870leD.LIZLLL)) {
            return;
        }
        this.event = c1365870leD;
        for (InterfaceC1389230mFt interfaceC1389230mFt : this.subscribers) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (IMContact iMContact : c1365870leD.LIZIZ) {
                if (iMContact instanceof IMUser) {
                    String uid = iMContact.getUid();
                    if (uid != null) {
                        arrayList.add("private");
                        arrayList2.add(uid);
                        arrayList3.add(C0YNP.LJ(uid));
                    }
                } else {
                    String str = "";
                    if (iMContact instanceof IMConversation) {
                        arrayList.add("group");
                        arrayList2.add("-1");
                        String conversationId = ((IMConversation) iMContact).getConversationId();
                        if (conversationId != null) {
                            str = conversationId;
                        }
                        arrayList3.add(str);
                    } else {
                        arrayList.add("");
                        arrayList2.add("");
                        arrayList3.add("");
                    }
                }
            }
            interfaceC1389230mFt.LIZ(getTipsText(c1365870leD), arrayList, arrayList2, arrayList3);
        }
        this.event = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.AbsShareDependencyService, com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void removeScreenShotListener(AbstractC1389240mFu abstractC1389240mFu) {
        AbstractC2361009My abstractC2361009My;
        if (abstractC1389240mFu != null && (abstractC2361009My = this.screenShotListenerMap.get(abstractC1389240mFu)) != null) {
            IScreenshotService iScreenshotService = (IScreenshotService) PluggableExtentionKt.pluggableSpi$default(IScreenshotService.class, false, false, false, 14, null);
            if (iScreenshotService != null) {
                iScreenshotService.LIZLLL(abstractC2361009My);
            }
            this.screenShotListenerMap.remove(abstractC1389240mFu);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void showShareSnakeBar(View view) {
        if (view == null) {
            return;
        }
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LJIL(C1388190mED.LIZ(view.getContext()), view, this.event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.AbsShareDependencyService
    public void subscribeEvent(InterfaceC1389230mFt interfaceC1389230mFt) {
        if (this.subscribers.isEmpty() && !EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.AbsShareDependencyService
    public void unsubscribeEvent(InterfaceC1389230mFt interfaceC1389230mFt) {
        if (this.subscribers.isEmpty() && EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0mFp] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0mFo] */
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public TuxSheet shareProduct(Activity activity, C1389170mFn c1389170mFn, final InterfaceC1389210mFr interfaceC1389210mFr, final InterfaceC1389220mFs interfaceC1389220mFs, String str) {
        return ((ShareService) ServiceManager.get().getService(ShareService.class)).LJJJZ(activity, new C1372620lp6(c1389170mFn.LIZ, c1389170mFn.LIZIZ, c1389170mFn.LIZJ, c1389170mFn.LIZLLL, c1389170mFn.LJ, c1389170mFn.LJFF, c1389170mFn.LJI, c1389170mFn.LJII, c1389170mFn.LJIIIIZZ, c1389170mFn.LJIIIZ, c1389170mFn.LJIIJ, c1389170mFn.LJIIJJI, c1389170mFn.LJIIL), new C1355090lMp() { // from class: X.0mFo
            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LJ(Context context, BaseSharePackage baseSharePackage) {
                interfaceC1389210mFr.LIZ();
            }

            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LJI(Context context, BaseSharePackage baseSharePackage) {
                interfaceC1389210mFr.onDismiss();
            }

            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
                interfaceC1389210mFr.LIZLLL();
            }

            @Override // X.C1355090lMp, X.InterfaceC1361850lXj
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                Bundle bundle;
                InterfaceC1389210mFr interfaceC1389210mFr2 = interfaceC1389210mFr;
                String strKey = interfaceC1369790lkX.key();
                if (baseSharePackage != null) {
                    bundle = baseSharePackage.extras;
                } else {
                    bundle = null;
                }
                interfaceC1389210mFr2.LIZJ(strKey, bundle);
            }

            @Override // X.C1355090lMp, X.InterfaceC1361850lXj
            public final Object LJII(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                String str2;
                InterfaceC1389210mFr interfaceC1389210mFr2 = interfaceC1389210mFr;
                String strKey = interfaceC1369790lkX.key();
                if (baseSharePackage != null) {
                    str2 = baseSharePackage.url;
                } else {
                    str2 = null;
                }
                Unit unitLIZIZ = interfaceC1389210mFr2.LIZIZ(strKey, str2, new AwS600S0100000_21(baseSharePackage, 115));
                if (unitLIZIZ == C099R.LJFF()) {
                    return unitLIZIZ;
                }
                return Unit.LIZ;
            }
        }, new InterfaceC1364520lc2() { // from class: X.0mFp
            @Override // X.InterfaceC1364520lc2
            public final void LIZIZ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LIZLLL(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJ(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIIIZZ(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIL(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJII(BaseSharePackage baseSharePackage) {
                interfaceC1389220mFs.LIZJ();
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIILIIL(BaseSharePackage baseSharePackage) {
                interfaceC1389220mFs.LIZIZ();
            }

            @Override // X.InterfaceC1364520lc2
            public final void LJIIJJI(BaseSharePackage baseSharePackage, String str2) {
                interfaceC1389220mFs.LIZ();
            }
        }, str);
    }
}
