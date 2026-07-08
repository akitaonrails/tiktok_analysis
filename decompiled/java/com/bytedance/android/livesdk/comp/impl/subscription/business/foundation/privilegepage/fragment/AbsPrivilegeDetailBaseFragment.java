package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment;

import X.AbstractC509530JyZ;
import X.C0IJT;
import X.C0KA3;
import X.C0KCF;
import X.C0KVU;
import X.C1100630ekP;
import X.C1106750euH;
import X.C1122210fJD;
import X.C1161920gLG;
import X.C13LP;
import X.C15438062q;
import X.C16F5;
import X.C16FS;
import X.C1826730xdX;
import X.C197039127h;
import X.C20736316Cj;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C474500IjA;
import X.C492290JSh;
import X.C494680Jac;
import X.C495170JbP;
import X.C497390Jez;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501610Jln;
import X.C507390Jv7;
import X.C508400Jwk;
import X.C508700JxE;
import X.C508770JxL;
import X.C508820JxQ;
import X.C508890JxX;
import X.C509050Jxn;
import X.C509520JyY;
import X.C513690KCp;
import X.C513920KDm;
import X.C513970KDr;
import X.C517510KRh;
import X.C520010KaN;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC507490JvH;
import X.EnumC513390KBl;
import X.InterfaceC1121830fIb;
import X.InterfaceC495060JbE;
import X.InterfaceC517590KRp;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubOnlySpacePreviewUxOptimizationSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.OpenPackagePageEvent;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.bytedance.android.livesdk.livesetting.subscription.LivePcsTurnOffSubSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbsPrivilegeDetailBaseFragment extends BaseFragment implements InterfaceC495060JbE {
    public static final /* synthetic */ int LLLJ = 0;
    public Boolean LL;
    public GetSubPrivilegeDetailResponse.Data LLILLJJLI;
    public TemplateListData LLIZLLLIL;
    public List<C495170JbP> LLJ;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public DataChannel LLJJ;
    public String LLJJI;
    public C508400Jwk LLJJIII;
    public final Map<String, String> LLJJIJI;
    public long LLJJIJIIJIL;
    public String LLJJIJIL;
    public final Map<String, String> LLJJJ;
    public float LLJJJIL;
    public ViewGroup LLJJJJ;
    public C16F5 LLJJJJJIL;
    public C16F5 LLJJJJLIIL;
    public C16FS LLJJL;
    public C16FS LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public C16FS LLJLIL;
    public C197039127h LLJLILLLLZIIL;
    public C197039127h LLJLL;
    public C197039127h LLJLLIL;
    public Integer LLJLLL;
    public ViewGroup LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public C16F5 LLLFFI;
    public ViewGroup LLLFZ;
    public String LLLI;
    public Function2<? super Integer, ? super Float, Unit> LLLII;
    public Function1<? super String, Unit> LLLIIII;
    public Function0<Unit> LLLIIIIL;
    public Function1<? super GetSubPrivilegeDetailResponse.Data, Unit> LLLIIIL;
    public boolean LLLIIL;
    public long LLLIILIL;
    public long LLLIL;
    public String LLLILZ;
    public long LLLILZJ;
    public final Map<String, Long> LLLILZLLLI;
    public boolean LLLIZZ;
    public EnumC507490JvH LLILLL = EnumC507490JvH.POPUP;
    public Function0<Unit> LLILZ = new C508890JxX();
    public String LLILZIL = "";
    public String LLILZLL = "";
    public Function1<? super Boolean, Unit> LLIZ = new C508820JxQ();
    public int LLJI = 1001;
    public String LLJIJIL = "";

    public abstract int VR();

    public abstract PrivilegeDetailViewModel ZR();

    public abstract void gS();

    public void mS(AbstractC509530JyZ abstractC509530JyZ) {
    }

    public final Room aS() {
        Room room;
        C508400Jwk c508400Jwk = this.LLJJIII;
        if (c508400Jwk != null && c508400Jwk.LJIIJ && (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null) {
            return room;
        }
        DataChannel dataChannel = this.LLJJ;
        if (dataChannel != null) {
            return C500260Jjc.LJJLIIIIJ(dataChannel);
        }
        return null;
    }

    public final void kS() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_click");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(this.LLJILJIL)) ? 1 : 0), "has_tpl_cache");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(this.LLJILLL)) ? 1 : 0), "has_sku_cache");
        qS(c474500IjALIZ);
        UR(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public final void rS() {
        CharSequence text;
        CharSequence charSequenceLIZLLL;
        C508400Jwk c508400Jwk;
        SubInfo subInfo;
        if (LiveSubOnlySpacePreviewSetting.INSTANCE.enable()) {
            GetSubPrivilegeDetailResponse.Data data = this.LLILLJJLI;
            if (data == null || !C507390Jv7.LJFF(data)) {
                GetSubPrivilegeDetailResponse.Data data2 = this.LLILLJJLI;
                if (data2 == null || (subInfo = data2.subInfo) == null || !Intrinsics.LJFF(subInfo.isSubscribing, Boolean.TRUE)) {
                    if (!Intrinsics.LJFF(this.LL, Boolean.TRUE) || ((c508400Jwk = this.LLJJIII) != null && c508400Jwk.LIZ())) {
                        SubOnlySpacePreviewUxOptimizationSetting subOnlySpacePreviewUxOptimizationSetting = SubOnlySpacePreviewUxOptimizationSetting.INSTANCE;
                        if (!subOnlySpacePreviewUxOptimizationSetting.isEnabled()) {
                            TemplateInfo templateInfoYQ2 = ZR().yQ2();
                            String strLIZ = C509050Jxn.LIZ(ZR().xQ2());
                            CharSequence charSequence = "";
                            if (strLIZ == null) {
                                strLIZ = "";
                            }
                            if (C500260Jjc.LJJIIZ(strLIZ)) {
                                C16FS c16fs = this.LLILLL == EnumC507490JvH.POPUP ? this.LLJJLIIIJLLLLLLLZ : this.LLJLIL;
                                if (c16fs != null) {
                                    c16fs.setText(C497740JfY.LJIJJ(2131849267, strLIZ));
                                }
                            }
                            C16F5 c16f5 = this.LLJJJJLIIL;
                            if (c16f5 != null) {
                                Context context = getContext();
                                if (context != null && templateInfoYQ2 != null && (charSequenceLIZLLL = C507390Jv7.LIZLLL(templateInfoYQ2, context)) != null) {
                                    charSequence = charSequenceLIZLLL;
                                }
                                c16f5.setText(charSequence);
                            }
                            C16F5 c16f52 = this.LLJJJJLIIL;
                            if ((c16f52 == null || (text = c16f52.getText()) == null || text.length() != 0) && !subOnlySpacePreviewUxOptimizationSetting.isEnabled()) {
                                C16F5 c16f53 = this.LLJJJJLIIL;
                                if (c16f53 != null) {
                                    C500260Jjc.LLFFF(c16f53);
                                    return;
                                }
                                return;
                            }
                            C16F5 c16f54 = this.LLJJJJLIIL;
                            if (c16f54 != null) {
                                C500260Jjc.LJIILIIL(c16f54);
                                return;
                            }
                            return;
                        }
                    }
                    C16F5 c16f55 = this.LLJJJJLIIL;
                    if (c16f55 != null) {
                        C500260Jjc.LJIILIIL(c16f55);
                    }
                }
            }
        }
    }

    public final boolean sS() {
        GetSubPrivilegeDetailResponse.Data data;
        User user;
        C508400Jwk c508400Jwk = this.LLJJIII;
        return (c508400Jwk == null || c508400Jwk.LJIIJ || !Intrinsics.LJFF(this.LLILZIL, "video_anchor") || (data = this.LLILLJJLI) == null || (user = data.anchorDetail) == null || UserService.getInstance().user().getCurrentUserId() != user.getId()) ? false : true;
    }

    public AbsPrivilegeDetailBaseFragment() {
        DataChannel dataChannel = this.LLJJ;
        if (dataChannel != null) {
            C500260Jjc.LJJLIIIIJ(dataChannel);
        }
        this.LLJJI = "";
        this.LLJJIJI = new LinkedHashMap();
        this.LLJJIJIL = "";
        this.LLJJJ = new LinkedHashMap();
        this.LLLI = "";
        this.LLLILZ = "";
        this.LLLILZLLLI = new LinkedHashMap();
    }

    public final void NR() {
        List<SubPackagePrivilege> list = ZR().LLJJIJIIJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SubPackagePrivilege> it2 = list.iterator();
        while (it2.hasNext()) {
            SubPackageSummary subPackageSummary = it2.next().packageSummary;
            arrayList.add(subPackageSummary != null ? subPackageSummary.id : null);
        }
        for (Object obj : C13LP.LJJJJLI(arrayList)) {
            if (Intrinsics.LJFF(this.LLLI, obj)) {
                Long l = (Long) ((LinkedHashMap) this.LLLILZLLLI).get(obj);
                this.LLLILZLLLI.put((String) obj, Long.valueOf((l != null ? l.longValue() : 0L) + (SystemClock.elapsedRealtime() - this.LLLILZJ)));
            }
        }
        this.LLLILZJ = SystemClock.elapsedRealtime();
    }

    public void RR() {
        Drawable drawableLIZ;
        View view;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (view = parentFragment.getView()) != null) {
            this.LLJZ = (ViewGroup) view.findViewById(R.id.d7i);
            this.LLJJL = (C16FS) view.findViewById(R.id.cux);
            this.LLJJLIIIJLLLLLLLZ = (C16FS) view.findViewById(R.id.cvf);
            this.LLJJJJJIL = (C16F5) view.findViewById(R.id.cvh);
            this.LLJJJJLIIL = (C16F5) view.findViewById(R.id.sai);
            this.LLJL = (ViewGroup) view.findViewById(R.id.f688cx4);
            this.LLJLIL = (C16FS) view.findViewById(R.id.wi0);
            this.LLJJJJ = (ViewGroup) view.findViewById(R.id.mg1);
            this.LLJLILLLLZIIL = (C197039127h) view.findViewById(R.id.n2w);
            this.LLJLL = (C197039127h) view.findViewById(R.id.watch_live_btn);
            this.LLJLLIL = (C197039127h) view.findViewById(R.id.watch_live_btn_v2);
            this.LLLFZ = (ViewGroup) view.findViewById(R.id.mdn);
            this.LLLFFI = (C16F5) view.findViewById(R.id.soj);
        }
        ViewGroup viewGroup = this.LLJJJJ;
        if (viewGroup != null) {
            C786410Ut5.LJLLLLLL(8, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLJJJJ;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0JxW
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        ViewGroup viewGroup3 = this.LLJZ;
        if (viewGroup3 != null) {
            Context context = getContext();
            if (context != null) {
                drawableLIZ = C501610Jln.LIZ(context, this.LLILLL == EnumC507490JvH.POPUP);
            } else {
                drawableLIZ = null;
            }
            viewGroup3.setBackground(drawableLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String WR() {
        /*
            r8 = this;
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel r0 = r8.ZR()
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege> r1 = r0.LLJJIJIIJIL
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege r0 = (com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege) r0
            com.bytedance.android.livesdk.chatroom.api.SubPackageSummary r0 = r0.packageSummary
            r2.add(r0)
            goto L15
        L27:
            X.0JxH r0 = new X.0JxH
            r0.<init>()
            java.util.List r0 = X.C13LP.LJLLLL(r0, r2)
            java.util.Iterator r2 = r0.iterator()
            r7 = 0
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdk.chatroom.api.SubPackageSummary r0 = (com.bytedance.android.livesdk.chatroom.api.SubPackageSummary) r0
            if (r0 == 0) goto L50
            java.lang.String r1 = r0.id
        L45:
            java.lang.String r0 = r8.LLLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L53
            int r7 = r7 + 1
            goto L35
        L50:
            r1 = 0
            goto L45
        L52:
            r7 = -1
        L53:
            int r6 = r8.VR()
            r5 = 1
            if (r6 == r5) goto L77
            java.lang.String r4 = "high"
            java.lang.String r3 = "low"
            r2 = 2
            java.lang.String r1 = ""
            if (r6 == r2) goto L70
            r0 = 3
            if (r6 != r0) goto L6c
            if (r7 == 0) goto L76
            if (r7 == r5) goto L6d
            if (r7 == r2) goto L75
        L6c:
            return r1
        L6d:
            java.lang.String r4 = "middle"
            return r4
        L70:
            if (r7 == 0) goto L76
            if (r7 == r5) goto L75
            return r1
        L75:
            return r4
        L76:
            return r3
        L77:
            java.lang.String r4 = "null"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment.WR():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[PHI: r4
      0x0039: PHI (r4v1 float) = (r4v0 float), (r4v3 float), (r4v3 float) binds: [B:42:0x0074, B:16:0x0033, B:18:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String bS() {
        /*
            r7 = this;
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel r0 = r7.ZR()
            java.util.List r0 = r0.BQ2()
            r3 = 0
            if (r0 == 0) goto L79
            java.util.Iterator r2 = r0.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r6 = r2.next()
            r0 = r6
            webcast.api.sub.TemplateInfo r0 = (webcast.api.sub.TemplateInfo) r0
            java.lang.String r1 = r0.packageId
            java.lang.String r0 = r7.LLLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lf
        L26:
            webcast.api.sub.TemplateInfo r6 = (webcast.api.sub.TemplateInfo) r6
        L28:
            r5 = 0
            if (r6 == 0) goto L73
            webcast.api.sub.OfferInfo r0 = r6.offerInfo
            if (r0 == 0) goto L73
            float r4 = r0.discountRate
        L31:
            webcast.api.sub.TagInfo r0 = r6.tagInfo
            if (r0 == 0) goto L39
            java.lang.String r3 = r0.promotionButton
            if (r3 != 0) goto L3b
        L39:
            java.lang.String r3 = ""
        L3b:
            X.0KEN r2 = X.C0KE1.Companion
            if (r6 == 0) goto L70
            webcast.api.sub.OfferInfo r0 = r6.offerInfo
            if (r0 == 0) goto L70
            long r0 = r0.offerType
        L45:
            r2.getClass()
            X.0KE1 r1 = X.C0KEN.LIZ(r0)
            X.0KE1 r0 = X.C0KE1.FREE_TRIAL_7DAYS
            if (r1 != r0) goto L6e
            r1 = 1
        L51:
            webcast.api.sub.GetSubPrivilegeDetailResponse$Data r0 = r7.LLILLJJLI
            if (r0 == 0) goto L60
            com.bytedance.android.livesdk.chatroom.api.SubInfo r0 = r0.subInfo
            if (r0 == 0) goto L60
            java.lang.Boolean r0 = r0.isSubscribing
            if (r0 == 0) goto L60
            r0.booleanValue()
        L60:
            boolean r0 = r7.sS()
            if (r0 == 0) goto L7b
            r0 = 2131853489(0x7f1180b1, float:1.9340626E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            return r0
        L6e:
            r1 = 0
            goto L51
        L70:
            r0 = 0
            goto L45
        L73:
            r4 = 0
            if (r6 == 0) goto L39
            goto L31
        L77:
            r6 = r3
            goto L26
        L79:
            r6 = r3
            goto L28
        L7b:
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L85
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L8f
        L85:
            if (r1 != 0) goto L8f
            r0 = 2131844418(0x7f115d42, float:1.9322228E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            return r0
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment.bS():java.lang.String");
    }

    public final String cS() {
        AbstractC509530JyZ abstractC509530JyZLIZJ;
        C492290JSh c492290JSh = ZR().LLLF;
        if (c492290JSh == null || (abstractC509530JyZLIZJ = c492290JSh.LIZJ()) == null) {
            abstractC509530JyZLIZJ = C509520JyY.LIZJ;
        }
        return abstractC509530JyZLIZJ.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment.onDestroy():void");
    }

    public static void UR(C474500IjA c474500IjA) {
        c474500IjA.LJJII(C513970KDr.LIZ, "auto_discount_1m");
        c474500IjA.LJJII(C513970KDr.LIZIZ, "auto_discount_package_quantity_1m");
    }

    public final void OR(long j) {
        C197039127h c197039127h = this.LLJLILLLLZIIL;
        if (c197039127h != null) {
            if (j == 1) {
                c197039127h.LJJJLZIJ(Integer.valueOf(C20736316Cj.LJ(R.attr.ctd, c197039127h.getContext())), null);
                return;
            }
            if (j == 2) {
                c197039127h.LJJJLZIJ(Integer.valueOf(C20736316Cj.LJ(R.attr.ctc, c197039127h.getContext())), null);
            } else if (j == 3) {
                c197039127h.LJJJLZIJ(Integer.valueOf(C20736316Cj.LJ(R.attr.ctg, c197039127h.getContext())), null);
            } else {
                c197039127h.LJJJLZIJ(Integer.valueOf(C20736316Cj.LJ(R.attr.ctc, c197039127h.getContext())), null);
            }
        }
    }

    public final String SR(Long l) {
        if (l == null) {
            return "null";
        }
        return C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(l.longValue() / 1000000.0d)}, 1));
    }

    @Override // X.InterfaceC495060JbE
    public final void a2(Function1<? super String, Unit> function1) {
        this.LLLIIII = function1;
    }

    public final void dS(final GetSubPrivilegeDetailResponse.Data.GiftSubscribePermission giftSubscribePermission) {
        InterfaceC1121830fIb interfaceC1121830fIbOr0;
        C1106750euH c1106750euHLJJIIZI;
        String string;
        User owner;
        C16FS c16fs = this.LLJJLIIIJLLLLLLLZ;
        if (c16fs != null) {
            c16fs.setRadius((int) C497740JfY.LIZIZ(8.0f));
        }
        C16FS c16fs2 = this.LLJJL;
        if (c16fs2 != null) {
            c16fs2.setRadius((int) C497740JfY.LIZIZ(8.0f));
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()) {
            C16FS c16fs3 = this.LLJJL;
            if (c16fs3 != null) {
                c16fs3.j0(R.style.a7_);
            }
            C16FS c16fs4 = this.LLJJL;
            if (c16fs4 != null) {
                C786410Ut5.h8(c16fs4, new View.OnClickListener() { // from class: X.0JxI
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C766270U4b.LJIIIZ(C500260Jjc.LJ(this.LL.getContext()), C497740JfY.LJIJI(2131842412));
                    }
                });
                return;
            }
            return;
        }
        if (LivePcsTurnOffSubSetting.turnOffSub() && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isM2()) {
            C16FS c16fs5 = this.LLJJL;
            if (c16fs5 != null) {
                c16fs5.j0(R.style.a7_);
            }
            C16FS c16fs6 = this.LLJJL;
            if (c16fs6 == null) {
                return;
            }
            C786410Ut5.h8(c16fs6, new View.OnClickListener() { // from class: X.0JxJ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C766270U4b.LJIIIZ(C500260Jjc.LJ(this.LL.getContext()), C497740JfY.LJIJI(2131844424));
                }
            });
            return;
        }
        if (giftSubscribePermission != null && (!giftSubscribePermission.canSendGiftSub)) {
            C16FS c16fs7 = this.LLJJL;
            if (c16fs7 != null) {
                c16fs7.j0(R.style.a7_);
            }
            C16FS c16fs8 = this.LLJJL;
            if (c16fs8 != null) {
                C786410Ut5.h8(c16fs8, new View.OnClickListener() { // from class: X.0JxK
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String str;
                        GetSubPrivilegeDetailResponse.Data.GiftSubscribePermission giftSubscribePermission2 = giftSubscribePermission;
                        if (giftSubscribePermission2 != null && (str = giftSubscribePermission2.forbiddenToast) != null) {
                            C766270U4b.LJIIIZ(C500260Jjc.LJ(this.getContext()), str);
                        }
                    }
                });
                return;
            }
            return;
        }
        C16FS c16fs9 = this.LLJJL;
        if (c16fs9 != null) {
            c16fs9.j0(R.style.a82);
        }
        C16FS c16fs10 = this.LLJJL;
        if (c16fs10 != null) {
            C786410Ut5.h8(c16fs10, new View.OnClickListener() { // from class: X.0JxU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        if (!C1122210fJD.LIZ("/webcast/sub/gift/send_subscription_panel/") || (interfaceC1121830fIbOr0 = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0()) == null || (c1106750euHLJJIIZI = interfaceC1121830fIbOr0.LJJIIZI()) == null) {
            return;
        }
        C1100630ekP c1100630ekP = new C1100630ekP(C0KA3.LIZ);
        Pair[] pairArr = new Pair[4];
        Room roomAS = aS();
        String secUid = null;
        if (roomAS != null && (owner = roomAS.getOwner()) != null) {
            secUid = owner.getSecUid();
        }
        String str = "";
        if (secUid == null) {
            secUid = "";
        }
        pairArr[0] = new Pair("sec_anchor_id", secUid);
        pairArr[1] = new Pair("selected_id", Long.valueOf(this.LLJJIJIIJIL));
        Room roomAS2 = aS();
        if (roomAS2 != null && (string = Long.valueOf(roomAS2.getId()).toString()) != null) {
            str = string;
        }
        pairArr[2] = new Pair("room_id", str);
        pairArr[3] = new Pair("version", "1");
        c1106750euHLJJIIZI.LIZIZ(c1100630ekP, "/webcast/sub/gift/send_subscription_panel/", C2097608Jq.LJIIIIZZ(pairArr), AFwS237S0000000_7.get$arr$(363), AFwS237S0000000_7.get$arr$(364));
    }

    @Override // X.InterfaceC495060JbE
    public final void f(Function2<? super Integer, ? super Float, Unit> function2) {
        this.LLLII = function2;
    }

    @Override // X.InterfaceC495060JbE
    public final void n(Function0<Unit> function0) {
        this.LLLIIIIL = function0;
    }

    public final void nS(GetSubPrivilegeDetailResponse.Data data) {
        String str;
        String strLIZIZ;
        int i;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Map<String, String> mapLJ;
        String string;
        String type;
        String string2;
        boolean z;
        Long lValueOf;
        boolean z2;
        String str2;
        User owner;
        long j;
        long j2;
        String string3;
        Uri uri;
        String str3;
        String str4;
        long j3;
        long j4;
        if (Intrinsics.LJFF(this.LLJJIJIL, "share")) {
            str = "h5";
        } else if (!Intrinsics.LJFF(this.LLILZIL, "others_homepage")) {
            str = "";
        } else {
            str = "homepage-entry";
        }
        EnumC507490JvH enumC507490JvH = this.LLILLL;
        EnumC507490JvH enumC507490JvH2 = EnumC507490JvH.POPUP;
        if (enumC507490JvH != enumC507490JvH2) {
            strLIZIZ = "";
        } else {
            Map<String, String> map = this.LLJJJ;
            C508400Jwk c508400Jwk = this.LLJJIII;
            if (c508400Jwk == null || (str3 = c508400Jwk.LIZ) == null) {
                str3 = "";
            }
            map.put("log_param", str3);
            Map<String, String> map2 = this.LLJJJ;
            C508400Jwk c508400Jwk2 = this.LLJJIII;
            if (c508400Jwk2 == null || (str4 = c508400Jwk2.LJ) == null) {
                str4 = "";
            }
            map2.put("extra_log_pb", str4);
            Map<String, String> map3 = this.LLJJJ;
            C508400Jwk c508400Jwk3 = this.LLJJIII;
            if (c508400Jwk3 != null) {
                j3 = c508400Jwk3.LIZJ;
            } else {
                j3 = 0;
            }
            map3.put("liveSubOnlyLiveTier", String.valueOf(j3));
            Map<String, String> map4 = this.LLJJJ;
            C508400Jwk c508400Jwk4 = this.LLJJIII;
            if (c508400Jwk4 != null) {
                j4 = c508400Jwk4.LIZLLL;
            } else {
                j4 = 0;
            }
            map4.put("liveSubOnlyLiveMonth", String.valueOf(j4));
            strLIZIZ = C497390Jez.LIZIZ(this.LLJJI, "popup", this.LLJJJ);
        }
        if (this.LLILLL == enumC507490JvH2) {
            i = 1;
        } else {
            i = 2;
        }
        C508400Jwk c508400Jwk5 = this.LLJJIII;
        if (c508400Jwk5 != null && (uri = c508400Jwk5.LJI) != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_benefit_page");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (C500260Jjc.LJJIIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        if (sS()) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), UriProtector.parse("sslocal://webcast_subscribe/settings?enter_from=native_privilege_page").buildUpon().appendQueryParameter("enter_from", "native_privilege_page").build().toString());
            return;
        }
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(getContext(), false);
        if (fragmentManagerLJIL == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) this.LLJJIJI).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap.put(key, value);
        }
        C508400Jwk c508400Jwk6 = this.LLJJIII;
        if (c508400Jwk6 == null || c508400Jwk6.LIZ.length() == 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = C500260Jjc.LL(c508400Jwk6.LIZ);
        }
        linkedHashMap.putAll(mapLJ);
        linkedHashMap.put("anchor_id", this.LLJJI);
        User user = data.anchorDetail;
        String str5 = CardStruct.IStatusCode.DEFAULT;
        if (user == null || (string = Long.valueOf(user.getId()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("log_anchor_id", string);
        linkedHashMap.put("from_sub_enter", str);
        linkedHashMap.put("show_entrance", this.LLILZIL);
        linkedHashMap.put("subscribe_state", cS());
        linkedHashMap.put("need_high_state_page", "false");
        linkedHashMap.put("privilege_show_type", "vertical");
        linkedHashMap.put("privilege_page", "main_page");
        linkedHashMap.put("use_spark", "1");
        linkedHashMap.put("user_present", "1");
        linkedHashMap.put("is_native", "1");
        linkedHashMap.put("package_quantity", String.valueOf(VR()));
        linkedHashMap.put("package_id", this.LLLI);
        EnumC507490JvH enumC507490JvH3 = this.LLILLL;
        if (enumC507490JvH3 == null || (type = enumC507490JvH3.getType()) == null) {
            type = "";
        }
        linkedHashMap.put("previous_page_type", type);
        TemplateListData templateListData = this.LLIZLLLIL;
        if (templateListData == null || (string2 = Integer.valueOf(templateListData.templateVersion).toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("template_version", string2);
        linkedHashMap.put("sec_anchor_id", this.LLJJI);
        if (this.LLILLL == EnumC507490JvH.FULL_PAGE) {
            z = true;
        } else {
            z = false;
        }
        linkedHashMap.put("is_full_page", String.valueOf(z));
        linkedHashMap.put("price_rank", WR());
        String str6 = this.LLJJI;
        User user2 = data.anchorDetail;
        if (user2 != null) {
            lValueOf = Long.valueOf(user2.getId());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        String str7 = this.LLLI;
        String str8 = this.LLILZIL;
        String str9 = this.LLILZLL;
        if (aS() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strCS = cS();
        Room roomAS = aS();
        if (roomAS != null && (string3 = Long.valueOf(roomAS.getId()).toString()) != null) {
            str5 = string3;
        }
        boolean z3 = !Intrinsics.LJFF(((LinkedHashMap) this.LLJJIJI).get("show_back"), "false");
        String str10 = (String) ((LinkedHashMap) this.LLJJIJI).get("backPage");
        if (str10 == null) {
            str10 = "";
        }
        C508400Jwk c508400Jwk7 = this.LLJJIII;
        if (c508400Jwk7 == null || (str2 = c508400Jwk7.LJ) == null) {
            str2 = "";
        }
        String pageName = EnumC513390KBl.PACKAGE_PAGE.getPageName();
        int i2 = this.LLJI;
        Room roomAS2 = aS();
        if (roomAS2 == null || (owner = roomAS2.getOwner()) == null) {
            owner = data.anchorDetail;
        }
        String strLIZ = C0KVU.LIZ(owner);
        C508400Jwk c508400Jwk8 = this.LLJJIII;
        if (c508400Jwk8 != null) {
            j = c508400Jwk8.LIZJ;
            j2 = c508400Jwk8.LIZLLL;
        } else {
            j = 0;
            j2 = 0;
        }
        C513690KCp.LIZ(new C0KCF(str6, strValueOf, "", true, 0, "normal_sub", str7, str8, str9, Boolean.valueOf(z2), str, strCS, "vertical", "main_page", str5, z3, str10, true, strLIZIZ, i, null, str2, null, pageName, strLIZ, i2, null, j, j2, false, 1228931840, 14), linkedHashMap, null, 12).show(fragmentManagerLJIL, "");
    }

    public final void oS(GetSubPrivilegeDetailResponse.Data data) {
        String str;
        String secUid;
        User owner;
        this.LLLIZZ = true;
        if (!Intrinsics.LJFF(this.LL, Boolean.TRUE)) {
            kS();
        }
        if (this.LLJJI.length() == 0 && aS() != null) {
            Room roomAS = aS();
            if (roomAS == null || (owner = roomAS.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                secUid = "";
            }
            this.LLJJI = secUid;
        }
        if (sS()) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), UriProtector.parse("sslocal://webcast_subscribe/settings?enter_from=native_privilege_page").buildUpon().appendQueryParameter("enter_from", "native_privilege_page").build().toString());
        } else {
            C508400Jwk c508400Jwk = this.LLJJIII;
            if (c508400Jwk != null) {
                str = c508400Jwk.LJIIIIZZ;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, "package_page_new") && data != null) {
                nS(data);
            }
        }
        if (this.LLILLL == EnumC507490JvH.POPUP && !sS()) {
            this.LLILZ.invoke();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIIIZZ("Privilege", new C517510KRh(hashCode(), this.LLJI, this.LLILZIL, this.LLJJIJI));
        }
    }

    public final C474500IjA qS(C474500IjA c474500IjA) {
        Integer numValueOf;
        boolean z;
        GetSubPrivilegeDetailResponse.Data data;
        Long lValueOf;
        User owner;
        String str;
        Integer numValueOf2;
        int i;
        int i2;
        boolean z2;
        List<TemplateInfo> list;
        List<TemplateInfo> list2;
        List<SubPackagePrivilege> list3;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo2;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo3;
        GetSubPrivilegeDetailResponse.Data.SubscribePermission subscribePermission;
        int iIntValue;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Integer numLJIIJJI;
        c474500IjA.LJIL();
        c474500IjA.LJJIIZI(this.LLJJJ);
        C508400Jwk c508400Jwk = this.LLJJIII;
        TemplateInfo templateInfo = null;
        if (c508400Jwk != null) {
            Uri uri = c508400Jwk.LJI;
            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_next_page")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            numValueOf = Integer.valueOf(iIntValue);
        } else {
            numValueOf = null;
        }
        c474500IjA.LJJII(numValueOf, "from_next_page");
        gS();
        Boolean bool = Boolean.TRUE;
        c474500IjA.LJJII(String.valueOf(C500260Jjc.LJJJI(bool) ? 1 : 0), "is_new_page");
        c474500IjA.LJJII(Integer.valueOf(VR()), "package_quantity");
        c474500IjA.LJJII(cS(), "subscribe_state");
        GetSubPrivilegeDetailResponse.Data data2 = this.LLILLJJLI;
        if (data2 != null && (subscribePermission = data2.subscribePermission) != null) {
            z = subscribePermission.canSubscribe;
        } else {
            z = false;
        }
        c474500IjA.LJJIIZI(C494680Jac.LJJIFFI(z, false, false));
        c474500IjA.LJJII(this.LLILZIL, "show_entrance");
        Room roomAS = aS();
        if ((roomAS != null && (owner = roomAS.getOwner()) != null) || ((data = this.LLILLJJLI) != null && (owner = data.anchorDetail) != null)) {
            lValueOf = Long.valueOf(owner.getId());
        } else {
            lValueOf = null;
        }
        c474500IjA.LJJII(lValueOf, "anchor_id");
        c474500IjA.LJJII("vertical", "privilege_show_type");
        c474500IjA.LJJII(1, "is_native");
        if (Intrinsics.LJFF(this.LL, bool)) {
            str = "anchor";
        } else {
            str = "audience";
        }
        c474500IjA.LJJII(str, "user_type");
        c474500IjA.LJJII(Integer.valueOf((int) this.LLJJJIL), "auto_discount");
        GetSubPrivilegeDetailResponse.Data data3 = this.LLILLJJLI;
        if (data3 != null && (subOnlyVideosBriefInfo3 = data3.subOnlyVideosBriefInfo) != null) {
            numValueOf2 = Integer.valueOf(subOnlyVideosBriefInfo3.totalCount);
        } else {
            numValueOf2 = null;
        }
        c474500IjA.LJJII(numValueOf2, "sub_only_video_cnt");
        GetSubPrivilegeDetailResponse.Data data4 = this.LLILLJJLI;
        if (data4 != null && (subOnlyVideosBriefInfo2 = data4.subOnlyVideosBriefInfo) != null && subOnlyVideosBriefInfo2.creatorStatus == 1) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i), "subonly_video_status");
        GetSubPrivilegeDetailResponse.Data data5 = this.LLILLJJLI;
        if (data5 != null && (subOnlyVideosBriefInfo = data5.subOnlyVideosBriefInfo) != null && subOnlyVideosBriefInfo.creatorStatus == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i2), "sub_only_status");
        c474500IjA.LJJII(WR(), "price_rank");
        GetSubPrivilegeDetailResponse.Data data6 = this.LLILLJJLI;
        if (data6 != null && (list3 = data6.packagePrivilegeList) != null && (!list3.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            TemplateListData templateListData = this.LLIZLLLIL;
            if (templateListData != null && (list2 = templateListData.templateList) != null) {
                Iterator<TemplateInfo> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TemplateInfo next = it2.next();
                    TemplateInfo templateInfo2 = next;
                    if (Intrinsics.LJFF(templateInfo2.packageId, this.LLLI) && templateInfo2.tplType == 2) {
                        templateInfo = next;
                        break;
                    }
                }
                templateInfo = templateInfo;
            }
        } else {
            TemplateListData templateListData2 = this.LLIZLLLIL;
            if (templateListData2 != null && (list = templateListData2.templateList) != null) {
                Iterator<TemplateInfo> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    TemplateInfo next2 = it3.next();
                    if (next2.tplType == 2) {
                        templateInfo = next2;
                        break;
                    }
                }
                templateInfo = templateInfo;
            }
        }
        C513920KDm.LJ(c474500IjA, templateInfo);
        return c474500IjA;
    }

    @Override // X.InterfaceC495060JbE
    public final void xI(List<C495170JbP> list) {
        List<C495170JbP> list2 = this.LLJ;
        if (list2 != null) {
            list2.clear();
        }
        ArrayList arrayList = new ArrayList();
        this.LLJ = arrayList;
        arrayList.addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR(java.lang.Boolean r16, java.lang.Integer r17) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment.PR(java.lang.Boolean, java.lang.Integer):void");
    }

    public final void hS(String str, Map<String, String> map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_privilege_intro_item_click");
        qS(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "privilege_page");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RR();
        ZR().EQ2(aS(), this.LLILLJJLI, new C508770JxL(this));
        DataChannelGlobal.LLILZ.BQ2(this, this, OpenPackagePageEvent.class, new C508700JxE(this));
    }
}
