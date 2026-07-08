package com.ss.android.ugc.aweme.im.saas.host.impl.deeplink;

import X.C1390520mHy;
import X.C1390530mHz;
import X.C13LE;
import X.C19719912Dl;
import X.C904510Ze5;
import X.InterfaceC2244421Csy;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.ss.android.ugc.aweme.im.saas.host.api.deeplink.IActionNavigationService;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ActionNavigationService implements IActionNavigationService {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.deeplink.IActionNavigationService
    public final InterfaceC2244421Csy LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (Intrinsics.LJFF(str, "now_invite")) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C1390520mHy.class);
            if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1390530mHz.class))) {
                return new InterfaceC2244421Csy() { // from class: X.0mHz
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(491));

                    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[PHI: r3
                      0x003e: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:10:0x0022, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC2244421Csy
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LIZ(android.view.View r6, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r7) {
                        /*
                            r5 = this;
                            java.util.List<java.lang.String> r0 = r7.data
                            java.util.Iterator r1 = r0.iterator()
                        L6:
                            boolean r0 = r1.hasNext()
                            r4 = 0
                            if (r0 == 0) goto L7a
                            java.lang.Object r3 = r1.next()
                            r0 = r3
                            java.lang.String r0 = (java.lang.String) r0
                            int r0 = r0.length()
                            if (r0 <= 0) goto L6
                        L1a:
                            java.lang.String r3 = (java.lang.String) r3
                            if (r3 == 0) goto L58
                            boolean r0 = X.C255950A1h.LIZ()
                            if (r0 == 0) goto L3e
                            com.bytedance.android.btm.api.model.PageFinder r1 = com.bytedance.android.btm.api.model.PageFinder.via(r6)
                            java.lang.String r0 = "c00258.d0"
                            java.lang.String r2 = X.C18JG.LIZ(r0, r1, r4)
                            X.0XI4 r1 = new X.0XI4
                            r1.<init>(r3)
                            java.lang.String r0 = "source_btm_token"
                            r1.LJ(r0, r2)
                            java.lang.String r3 = r1.LJFF()
                            if (r3 == 0) goto L58
                        L3e:
                            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                            java.lang.Class<com.ss.android.ugc.aweme.poi_api.service.IPoiService> r0 = com.ss.android.ugc.aweme.poi_api.service.IPoiService.class
                            java.lang.Object r0 = r1.getService(r0)
                            com.ss.android.ugc.aweme.poi_api.service.IPoiService r0 = (com.ss.android.ugc.aweme.poi_api.service.IPoiService) r0
                            boolean r0 = r0.LJJJJL()
                            if (r0 == 0) goto L57
                            java.lang.String r1 = "poi/detail"
                            java.lang.String r0 = "poi/map"
                            kotlin.text.u.LJJIIJ(r3, r1, r0)
                        L57:
                            r4 = r3
                        L58:
                            boolean r0 = X.C123100dR.LIZ(r4)
                            if (r0 == 0) goto L7c
                            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r2 = new com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent
                            java.util.List r1 = java.util.Collections.singletonList(r4)
                            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType.DEEP_LINK
                            r2.<init>(r1, r0)
                            X.01GW r0 = r5.LIZ
                            java.lang.Object r1 = r0.getValue()
                            X.0Ze5 r1 = (X.C904510Ze5) r1
                            android.content.Context r0 = r6.getContext()
                            boolean r0 = r1.LIZ(r0, r2)
                            return r0
                        L7a:
                            r3 = r4
                            goto L1a
                        L7c:
                            X.01GW r0 = r5.LIZ
                            java.lang.Object r1 = r0.getValue()
                            X.0Ze5 r1 = (X.C904510Ze5) r1
                            android.content.Context r0 = r6.getContext()
                            boolean r0 = r1.LIZ(r0, r7)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1390530mHz.LIZ(android.view.View, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent):boolean");
                    }
                };
            }
            if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1390520mHy.class))) {
                return new InterfaceC2244421Csy() { // from class: X.0mHy
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(490));

                    @Override // X.InterfaceC2244421Csy
                    public final boolean LIZ(View view, ActionLinkComponent actionLinkComponent) {
                        String next;
                        Iterator<String> it2 = actionLinkComponent.data.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next.length() > 0) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        String str2 = next;
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "uid");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                            IMContactApi.LIZ.getClass();
                            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null, "im_local_db");
                            if (iMUserLJIIL != null) {
                                C0XI4 c0xi4 = new C0XI4(str2);
                                c0xi4.LJ("nickname", iMUserLJIIL.getNickName());
                                c0xi4.LJ("avatar", C1324840ka2.LJIILLIIL(iMUserLJIIL.getAvatarMedium()));
                                return ((C904510Ze5) this.LIZ.getValue()).LIZ(view.getContext(), new ActionLinkComponent(Collections.singletonList(c0xi4.LJFF()), ActionLinkType.DEEP_LINK));
                            }
                        }
                        return ((C904510Ze5) this.LIZ.getValue()).LIZ(view.getContext(), actionLinkComponent);
                    }
                };
            }
            throw new IllegalArgumentException();
        }
        if (!Intrinsics.LJFF(str, "point_of_interest")) {
            return null;
        }
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(C1390530mHz.class);
        if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1390530mHz.class))) {
            return new InterfaceC2244421Csy() { // from class: X.0mHz
                public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(491));

                @Override // X.InterfaceC2244421Csy
                public final boolean LIZ(View v, ActionLinkComponent v2) {
                    /*
                        this = this;
                        java.util.List<java.lang.String> r0 = r7.data
                        java.util.Iterator r1 = r0.iterator()
                    L6:
                        boolean r0 = r1.hasNext()
                        r4 = 0
                        if (r0 == 0) goto L7a
                        java.lang.Object r3 = r1.next()
                        r0 = r3
                        java.lang.String r0 = (java.lang.String) r0
                        int r0 = r0.length()
                        if (r0 <= 0) goto L6
                    L1a:
                        java.lang.String r3 = (java.lang.String) r3
                        if (r3 == 0) goto L58
                        boolean r0 = X.C255950A1h.LIZ()
                        if (r0 == 0) goto L3e
                        com.bytedance.android.btm.api.model.PageFinder r1 = com.bytedance.android.btm.api.model.PageFinder.via(r6)
                        java.lang.String r0 = "c00258.d0"
                        java.lang.String r2 = X.C18JG.LIZ(r0, r1, r4)
                        X.0XI4 r1 = new X.0XI4
                        r1.<init>(r3)
                        java.lang.String r0 = "source_btm_token"
                        r1.LJ(r0, r2)
                        java.lang.String r3 = r1.LJFF()
                        if (r3 == 0) goto L58
                    L3e:
                        com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                        java.lang.Class<com.ss.android.ugc.aweme.poi_api.service.IPoiService> r0 = com.ss.android.ugc.aweme.poi_api.service.IPoiService.class
                        java.lang.Object r0 = r1.getService(r0)
                        com.ss.android.ugc.aweme.poi_api.service.IPoiService r0 = (com.ss.android.ugc.aweme.poi_api.service.IPoiService) r0
                        boolean r0 = r0.LJJJJL()
                        if (r0 == 0) goto L57
                        java.lang.String r1 = "poi/detail"
                        java.lang.String r0 = "poi/map"
                        kotlin.text.u.LJJIIJ(r3, r1, r0)
                    L57:
                        r4 = r3
                    L58:
                        boolean r0 = X.C123100dR.LIZ(r4)
                        if (r0 == 0) goto L7c
                        com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r2 = new com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent
                        java.util.List r1 = java.util.Collections.singletonList(r4)
                        com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType.DEEP_LINK
                        r2.<init>(r1, r0)
                        X.01GW r0 = r5.LIZ
                        java.lang.Object r1 = r0.getValue()
                        X.0Ze5 r1 = (X.C904510Ze5) r1
                        android.content.Context r0 = r6.getContext()
                        boolean r0 = r1.LIZ(r0, r2)
                        return r0
                    L7a:
                        r3 = r4
                        goto L1a
                    L7c:
                        X.01GW r0 = r5.LIZ
                        java.lang.Object r1 = r0.getValue()
                        X.0Ze5 r1 = (X.C904510Ze5) r1
                        android.content.Context r0 = r6.getContext()
                        boolean r0 = r1.LIZ(r0, r7)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1390530mHz.LIZ(android.view.View, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent):boolean");
                }
            };
        }
        if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1390520mHy.class))) {
            return new InterfaceC2244421Csy() { // from class: X.0mHy
                public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(490));

                @Override // X.InterfaceC2244421Csy
                public final boolean LIZ(View view, ActionLinkComponent actionLinkComponent) {
                    String next;
                    Iterator<String> it2 = actionLinkComponent.data.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.length() > 0) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    String str2 = next;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "uid");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        IMContactApi.LIZ.getClass();
                        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null, "im_local_db");
                        if (iMUserLJIIL != null) {
                            C0XI4 c0xi4 = new C0XI4(str2);
                            c0xi4.LJ("nickname", iMUserLJIIL.getNickName());
                            c0xi4.LJ("avatar", C1324840ka2.LJIILLIIL(iMUserLJIIL.getAvatarMedium()));
                            return ((C904510Ze5) this.LIZ.getValue()).LIZ(view.getContext(), new ActionLinkComponent(Collections.singletonList(c0xi4.LJFF()), ActionLinkType.DEEP_LINK));
                        }
                    }
                    return ((C904510Ze5) this.LIZ.getValue()).LIZ(view.getContext(), actionLinkComponent);
                }
            };
        }
        throw new IllegalArgumentException();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.deeplink.IActionNavigationService
    public final boolean LIZIZ(Context context, ActionLinkComponent actionLinkComponent) {
        return new C904510Ze5(null).LIZ(context, actionLinkComponent);
    }
}
