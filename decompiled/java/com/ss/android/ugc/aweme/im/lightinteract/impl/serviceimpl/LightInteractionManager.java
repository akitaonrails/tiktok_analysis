package com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl;

import X.AbstractC23140094w;
import X.C01GW;
import X.C054S;
import X.C0C97;
import X.C0C9O;
import X.C0I0B;
import X.C0IAX;
import X.C0ICM;
import X.C0YNP;
import X.C0YTK;
import X.C0Z5R;
import X.C0Z8Z;
import X.C0Z96;
import X.C0Z9J;
import X.C0Z9K;
import X.C0Z9X;
import X.C0Z9Y;
import X.C0ZEG;
import X.C0ZFS;
import X.C0ZM3;
import X.C0ZM4;
import X.C0ZM5;
import X.C0ZM9;
import X.C0ZMD;
import X.C0ZME;
import X.C0ZMG;
import X.C0ZMH;
import X.C0ZMJ;
import X.C0ZMM;
import X.C1231504rp;
import X.C1336205Ku;
import X.C13LP;
import X.C13LQ;
import X.C1400340mXo;
import X.C1419705h5;
import X.C1654506dr;
import X.C2137008Yu;
import X.C2188811AlT;
import X.C296660Bk0;
import X.C300780Bqe;
import X.C310620CFo;
import X.C452501pT;
import X.C603760NmA;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C879420Yei;
import X.C894970Z9b;
import X.C895160Z9u;
import X.C898150ZLh;
import X.C898170ZLj;
import X.C898190ZLl;
import X.C901060ZWm;
import X.EnumC1696906kh;
import X.EnumC2215611Bnb;
import X.EnumC462090IAd;
import X.EnumC895010Z9f;
import X.EnumC909380Zlw;
import X.InterfaceC1357410lQZ;
import X.InterfaceC1357440lQc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1411705fn;
import X.InterfaceC1513605wE;
import X.InterfaceC1513805wG;
import X.InterfaceC1707406mO;
import X.InterfaceC19330810jy;
import X.InterfaceC892560Yzu;
import X.InterfaceC893150Z2b;
import X.InterfaceC894800Z8k;
import X.InterfaceC894810Z8l;
import X.InterfaceC896150ZDp;
import X.InterfaceC896190ZDt;
import X.InterfaceC908170Zjz;
import X.InterfaceC912670ZrF;
import X.InterfaceC913290ZsF;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.strategybridge.LightInteractionMetaData;
import com.ss.android.ugc.aweme.im.lightinteract.impl.autofetch.LightInteractionAutoRetryConfig;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.birthday.LightInteractionBirthdayServiceImpl;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionManager implements ILightInteractionPlatformService, InterfaceC913290ZsF, C0Z9Y, C0Z9J, C0ZEG, InterfaceC912670ZrF, C0Z9X, InterfaceC1513805wG, InterfaceC894810Z8l, InterfaceC894800Z8k, InterfaceC908170Zjz, InterfaceC1513605wE, InterfaceC896150ZDp, InterfaceC1357440lQc {
    public static final LightInteractionManager LLJILLL = new LightInteractionManager();
    public static final C01GW LLJJ;
    public static final Map<String, C310620CFo> LLJJI;
    public static final Set<String> LLJJIII;
    public static final C01GW LLJJIJI;
    public final /* synthetic */ C0ZMD LL = C0ZMD.LL;
    public final /* synthetic */ C0ZFS LLILLJJLI = C0ZFS.LL;
    public final /* synthetic */ C894970Z9b LLILLL = C894970Z9b.LL;
    public final /* synthetic */ C898190ZLl LLILZ = C898190ZLl.LL;
    public final /* synthetic */ C0IAX LLILZIL = C0IAX.LL;
    public final /* synthetic */ C898170ZLj LLILZLL = C898170ZLj.LL;
    public final /* synthetic */ C0ZMM LLIZ = C0ZMM.LL;
    public final /* synthetic */ C0Z96 LLIZLLLIL = C0Z96.LL;
    public final /* synthetic */ C603760NmA LLJ = C603760NmA.LL;
    public final /* synthetic */ C2137008Yu LLJI = C2137008Yu.LL;
    public final /* synthetic */ LightInteractionBirthdayServiceImpl LLJIJIL = LightInteractionBirthdayServiceImpl.LL;
    public final /* synthetic */ C054S LLJILJIL = C054S.LL;
    public final /* synthetic */ C895160Z9u LLJILJILJ = C895160Z9u.LL;

    @Override // X.InterfaceC913290ZsF
    public final void LIZ() {
        this.LL.LIZ();
    }

    @Override // X.C0Z9X
    public final InterfaceC892560Yzu LIZJ() {
        this.LLILZLL.getClass();
        return C898150ZLh.LL;
    }

    @Override // X.InterfaceC912670ZrF
    public final BaseContent.ReferenceVideo LIZLLL(Aweme aweme) {
        return this.LLILZIL.LIZLLL(aweme);
    }

    @Override // X.InterfaceC894810Z8l
    public final C0Z8Z LJFF() {
        return this.LLIZLLLIL.LJFF();
    }

    @Override // X.C0Z9X
    public final String LJII(String str) {
        return this.LLILZLL.LJII(str);
    }

    @Override // X.InterfaceC912670ZrF
    public final AttachmentComponent LJIIIZ(Aweme aweme, User user, EnumC462090IAd enumC462090IAd) {
        return this.LLILZIL.LJIIIZ(aweme, user, enumC462090IAd);
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJIIJ() {
        return this.LLIZ.LJIIJ();
    }

    @Override // X.C0Z9X
    public final String LJIIL(C869590Y9l c869590Y9l) {
        return this.LLILZLL.LJIIL(c869590Y9l);
    }

    @Override // X.InterfaceC894800Z8k
    public final void LJIILIIL(String str, EnumC1696906kh enumC1696906kh) {
        this.LLJ.LJIILIIL(str, enumC1696906kh);
    }

    @Override // X.InterfaceC1513605wE
    public final boolean LJIILL(String str) {
        return this.LLJIJIL.LJIILL(str);
    }

    @Override // X.C0Z9X
    public final InterfaceC1357410lQZ LJIIZILJ(String str) {
        return this.LLILZLL.LJIIZILJ(str);
    }

    @Override // X.C0Z9J
    public final void LJIJI(String str, boolean z) {
        this.LLILLL.LJIJI(str, z);
    }

    @Override // X.InterfaceC894800Z8k
    public final void LJJII(String str, EnumC1696906kh enumC1696906kh, long j) {
        this.LLJ.LJJII(str, enumC1696906kh, j);
    }

    @Override // X.InterfaceC1513605wE
    public final void LJJIII(List<String> list) {
        this.LLJIJIL.LJJIII(list);
    }

    @Override // X.InterfaceC896150ZDp
    public final String LJJIIJZLJL(String str, String str2) {
        return this.LLJILJIL.LJJIIJZLJL(str, str2);
    }

    @Override // X.C0Z9X
    public final String LJJIIZ(C869590Y9l c869590Y9l) {
        return this.LLILZLL.LJJIIZ(c869590Y9l);
    }

    @Override // X.C0Z9X
    public final InterfaceC892560Yzu LJJIJIIJIL(LifecycleOwner lifecycleOwner) {
        return this.LLILZLL.LJJIJIIJIL(lifecycleOwner);
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJIJL() {
        return this.LLIZ.LJJIJL();
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJIL() {
        return this.LLIZ.LJJIL();
    }

    @Override // X.C0ZEG
    public final boolean LJJIZ(String str, RelationButton relationButton, String str2, Map map, String str3, User user, String str4, boolean z, AttachmentComponent attachmentComponent, Integer num, Serializable serializable, LifecycleOwner lifecycleOwner, Function0 function0) {
        return this.LLILZ.LJJIZ(str, relationButton, str2, map, str3, user, str4, z, attachmentComponent, num, serializable, lifecycleOwner, function0);
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJJ() {
        return this.LLIZ.LJJJ();
    }

    @Override // X.InterfaceC912670ZrF
    public final AttachmentComponent LJJJJ(Serializable serializable, EnumC462090IAd enumC462090IAd) {
        return this.LLILZIL.LJJJJ(serializable, enumC462090IAd);
    }

    @Override // X.InterfaceC1357440lQc
    public final boolean LJJJJI(User user) {
        return this.LLJILJILJ.LJJJJI(user);
    }

    @Override // X.InterfaceC896150ZDp
    public final InterfaceC1411705fn LJJJJJ() {
        return this.LLJILJIL.LJJJJJ();
    }

    @Override // X.InterfaceC913290ZsF
    public final void LJJJJL() {
        this.LL.LJJJJL();
    }

    @Override // X.C0ZEG
    public final boolean LJJJJLI(String str, String str2, String str3, String str4, String str5) {
        return this.LLILZ.LJJJJLI(str, str2, str3, str4, str5);
    }

    @Override // X.C0ZEG
    public final void LJJJJLL(String str, String str2, Context context, boolean z, String str3, Map<String, String> map, View view) {
        this.LLILZ.LJJJJLL(str, str2, context, false, str3, map, view);
    }

    @Override // X.InterfaceC1513605wE
    public final InterfaceC19330810jy LJJJJZ() {
        return this.LLJIJIL.LJJJJZ();
    }

    @Override // X.C0Z9X
    public final String LJJJJZI(String str) {
        return this.LLILZLL.LJJJJZI(str);
    }

    @Override // X.InterfaceC1513605wE
    public final Object LJJJLIIL(long j, String str, AbstractC23140094w abstractC23140094w) {
        return this.LLJIJIL.LJJJLIIL(j, str, abstractC23140094w);
    }

    @Override // X.InterfaceC1513805wG
    public final boolean LJJJLL() {
        return this.LLIZ.LJJJLL();
    }

    @Override // X.InterfaceC894800Z8k
    public final void LJJJZ(String str, EnumC1696906kh enumC1696906kh, C0C97 c0c97, String str2, long j) {
        this.LLJ.LJJJZ(str, enumC1696906kh, c0c97, str2, j);
    }

    @Override // X.InterfaceC1513605wE
    public final void LJJL(long j, String str, String str2) {
        this.LLJIJIL.LJJL(j, str, str2);
    }

    @Override // X.C0ZEG
    public final boolean LJJLIIIIJ() {
        return this.LLILZ.LJJLIIIIJ();
    }

    @Override // X.C0ZEG
    public final String LJJLIIIJJI(String str) {
        return this.LLILZ.LJJLIIIJJI(str);
    }

    @Override // X.C0ZEG
    public final boolean LJJLIIIJJIZ() {
        return this.LLILZ.LJJLIIIJJIZ();
    }

    @Override // X.InterfaceC1513805wG
    public final int LJJLIIIJLJLI() {
        return this.LLIZ.LJJLIIIJLJLI();
    }

    @Override // X.C0Z9X
    public final String LJJLIIIJLLLLLLLZ(Boolean bool) {
        return this.LLILZLL.LJJLIIIJLLLLLLLZ(bool);
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        this.LLJI.onAccountResult(i, z, 0, user);
    }

    static {
        ((IStrategyPlatformService) ServiceManager.get().getService(IStrategyPlatformService.class)).LJII(EnumC2215611Bnb.TYPE_LIGHT_INTERACTION_FREQUENCY_CONTROL);
        LLJJ = C452501pT.LIZIZ(new C0ZMG());
        LLJJI = new LinkedHashMap();
        LLJJIII = C13LQ.LJLIIL(new String[]{"action_bar:nudge", "action_bar:nudge_back", "action_bar:spark", "action_bar:spark_back"});
        LLJJIJI = C452501pT.LIZIZ(new C0ZMJ());
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final InterfaceC1707406mO LJ() {
        return (InterfaceC1707406mO) LLJJIJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final boolean LJIJJLI() {
        return ((Number) C1654506dr.LIZ.getValue()).intValue() != 0;
    }

    @Override // X.C0Z9Y
    public final C0Z9K LJJI() {
        this.LLILLJJLI.getClass();
        return C0ZM3.LLILLJJLI;
    }

    @Override // X.C0Z9Y
    public final C0ICM LJJJIL() {
        this.LLILLJJLI.getClass();
        return C0ZM5.LLILLL;
    }

    @Override // X.C0Z9Y
    public final InterfaceC893150Z2b LJJJJIZL() {
        this.LLILLJJLI.getClass();
        return C0ZM4.LLILLJJLI;
    }

    public final User LJJZZIII() {
        return C0I0B.LJFF.LIZ().getCurrentUser();
    }

    public final IStrategyPlatformService LJLI() {
        return (IStrategyPlatformService) ServiceManager.get().getService(IStrategyPlatformService.class);
    }

    public static final class LightInteractionPlatformServiceImpl implements ILightInteractionPlatformService {
        public final /* synthetic */ LightInteractionManager LL = LightInteractionManager.LLJILLL;

        @Override // X.InterfaceC913290ZsF
        public final void LIZ() {
            this.LL.LIZ();
        }

        @Override // X.C0Z9X
        public final InterfaceC892560Yzu LIZJ() {
            this.LL.LIZJ();
            return C898150ZLh.LL;
        }

        @Override // X.InterfaceC912670ZrF
        public final BaseContent.ReferenceVideo LIZLLL(Aweme aweme) {
            return this.LL.LIZLLL(aweme);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final InterfaceC1707406mO LJ() {
            return this.LL.LJ();
        }

        @Override // X.InterfaceC894810Z8l
        public final C0Z8Z LJFF() {
            return this.LL.LJFF();
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final String LJI(C869590Y9l c869590Y9l) {
            return this.LL.LJI(c869590Y9l);
        }

        @Override // X.C0Z9X
        public final String LJII(String str) {
            return this.LL.LJII(str);
        }

        @Override // X.InterfaceC912670ZrF
        public final AttachmentComponent LJIIIZ(Aweme aweme, User user, EnumC462090IAd enumC462090IAd) {
            return this.LL.LJIIIZ(aweme, user, enumC462090IAd);
        }

        @Override // X.InterfaceC1513805wG
        public final boolean LJIIJ() {
            return this.LL.LJIIJ();
        }

        @Override // X.InterfaceC894800Z8k
        public final void LJIILIIL(String str, EnumC1696906kh enumC1696906kh) {
            this.LL.LJIILIIL(str, enumC1696906kh);
        }

        @Override // X.InterfaceC1513605wE
        public final boolean LJIILL(String str) {
            return this.LL.LJIILL(str);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final void LJIILLIIL(Context context) {
            this.LL.LJIILLIIL(context);
        }

        @Override // X.C0Z9X
        public final InterfaceC1357410lQZ LJIIZILJ(String str) {
            return this.LL.LJIIZILJ(str);
        }

        @Override // X.C0Z9J
        public final void LJIJI(String str, boolean z) {
            this.LL.LJIJI(str, z);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final boolean LJIJJLI() {
            return this.LL.LJIJJLI();
        }

        @Override // X.C0Z9Y
        public final C0Z9K LJJI() {
            return this.LL.LJJI();
        }

        @Override // X.InterfaceC894800Z8k
        public final void LJJII(String str, EnumC1696906kh enumC1696906kh, long j) {
            this.LL.LJJII(str, enumC1696906kh, j);
        }

        @Override // X.InterfaceC1513605wE
        public final void LJJIII(List<String> list) {
            this.LL.LJJIII(list);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final long LJJIIJ(User user) {
            return this.LL.LJJIIJ(user);
        }

        @Override // X.InterfaceC896150ZDp
        public final String LJJIIJZLJL(String str, String str2) {
            return this.LL.LJJIIJZLJL(str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final LightInteractionCommonResource LJJIIZI(String str) {
            return this.LL.LJJIIZI(str);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final Pair<LightInteractionEntryConf, Integer> LJJIJIIJI(LightInteractionMetaData lightInteractionMetaData, InterfaceC1707406mO interfaceC1707406mO) {
            return this.LL.LJJIJIIJI(lightInteractionMetaData, interfaceC1707406mO);
        }

        @Override // X.C0Z9X
        public final InterfaceC892560Yzu LJJIJIIJIL(LifecycleOwner lifecycleOwner) {
            return this.LL.LJJIJIIJIL(lifecycleOwner);
        }

        @Override // X.InterfaceC1513805wG
        public final boolean LJJIJL() {
            return this.LL.LJJIJL();
        }

        @Override // X.InterfaceC1513805wG
        public final boolean LJJIL() {
            return this.LL.LJJIL();
        }

        @Override // X.C0ZEG
        public final boolean LJJIZ(String str, RelationButton relationButton, String str2, Map map, String str3, User user, String str4, boolean z, AttachmentComponent attachmentComponent, Integer num, Serializable serializable, LifecycleOwner lifecycleOwner, Function0 function0) {
            return this.LL.LJJIZ(str, relationButton, str2, map, str3, user, str4, z, attachmentComponent, num, serializable, lifecycleOwner, function0);
        }

        @Override // X.InterfaceC1513805wG
        public final boolean LJJJ() {
            return this.LL.LJJJ();
        }

        @Override // X.C0Z9Y
        public final C0ICM LJJJIL() {
            return this.LL.LJJJIL();
        }

        @Override // X.InterfaceC912670ZrF
        public final AttachmentComponent LJJJJ(Serializable serializable, EnumC462090IAd enumC462090IAd) {
            return this.LL.LJJJJ(serializable, enumC462090IAd);
        }

        @Override // X.InterfaceC1357440lQc
        public final boolean LJJJJI(User user) {
            return this.LL.LJJJJI(user);
        }

        @Override // X.C0Z9Y
        public final InterfaceC893150Z2b LJJJJIZL() {
            return this.LL.LJJJJIZL();
        }

        @Override // X.InterfaceC896150ZDp
        public final InterfaceC1411705fn LJJJJJ() {
            return this.LL.LJJJJJ();
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final boolean LJJJJJL(C869590Y9l c869590Y9l) {
            return this.LL.LJJJJJL(c869590Y9l);
        }

        @Override // X.InterfaceC913290ZsF
        public final void LJJJJL() {
            this.LL.LJJJJL();
        }

        @Override // X.C0ZEG
        public final boolean LJJJJLI(String str, String str2, String str3, String str4, String str5) {
            return this.LL.LJJJJLI(str, str2, str3, str4, str5);
        }

        @Override // X.C0ZEG
        public final void LJJJJLL(String str, String str2, Context context, boolean z, String str3, Map<String, String> map, View view) {
            this.LL.LJJJJLL(str, str2, context, false, str3, map, view);
        }

        @Override // X.InterfaceC1513605wE
        public final InterfaceC19330810jy LJJJJZ() {
            return this.LL.LJJJJZ();
        }

        @Override // X.InterfaceC1513605wE
        public final Object LJJJLIIL(long j, String str, AbstractC23140094w abstractC23140094w) {
            return this.LL.LJJJLIIL(j, str, abstractC23140094w);
        }

        @Override // X.InterfaceC1513805wG
        public final boolean LJJJLL() {
            return this.LL.LJJJLL();
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final LightInteractionCommonResource LJJJLZIJ(C869590Y9l c869590Y9l) {
            return this.LL.LJJJLZIJ(c869590Y9l);
        }

        @Override // X.InterfaceC894800Z8k
        public final void LJJJZ(String str, EnumC1696906kh enumC1696906kh, C0C97 c0c97, String str2, long j) {
            this.LL.LJJJZ(str, enumC1696906kh, c0c97, str2, j);
        }

        @Override // X.InterfaceC1513605wE
        public final void LJJL(long j, String str, String str2) {
            this.LL.LJJL(j, str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final Object LJJLI(String str, String str2, String str3, Map<String, String> map, ReferenceInfo referenceInfo, AttachmentComponent attachmentComponent, Serializable serializable, Integer num, C0YTK c0ytk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return this.LL.LJJLI(str, str2, str3, map, referenceInfo, attachmentComponent, serializable, num, c0ytk, interfaceC1364105Vn);
        }

        @Override // X.C0ZEG
        public final boolean LJJLIIIIJ() {
            return this.LL.LJJLIIIIJ();
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final void LJJLIIIJILLIZJL(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, ReferenceInfo referenceInfo, AttachmentComponent attachmentComponent, Serializable serializable, Integer num, C0YTK c0ytk, BaseHeaderComponent baseHeaderComponent) {
            this.LL.LJJLIIIJILLIZJL(str, str2, str3, map, map2, referenceInfo, attachmentComponent, serializable, num, c0ytk, baseHeaderComponent);
        }

        @Override // X.C0ZEG
        public final String LJJLIIIJJI(String str) {
            return this.LL.LJJLIIIJJI(str);
        }

        @Override // X.C0ZEG
        public final boolean LJJLIIIJJIZ() {
            return this.LL.LJJLIIIJJIZ();
        }

        @Override // X.InterfaceC1513805wG
        public final int LJJLIIIJLJLI() {
            return this.LL.LJJLIIIJLJLI();
        }

        @Override // X.C0Z9X
        public final String LJJLIIIJLLLLLLLZ(Boolean bool) {
            return this.LL.LJJLIIIJLLLLLLLZ(bool);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final void LJJLIIJ(long j, String str) {
            this.LL.LJJLIIJ(j, str);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final long LJJLIL(String str) {
            return this.LL.LJJLIL(str);
        }

        @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
        public final String LJJLJLI(Long l, Long l2) {
            return this.LL.LJJLJLI(l, l2);
        }

        @Override // X.C0Z9X
        public final String LJIIL(C869590Y9l c869590Y9l) {
            return this.LL.LLILZLL.LJIIL(c869590Y9l);
        }

        @Override // X.C0Z9X
        public final String LJJIIZ(C869590Y9l c869590Y9l) {
            return this.LL.LLILZLL.LJJIIZ(c869590Y9l);
        }
    }

    public static String LJL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("say_hi");
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static LightInteractionCommonResource LJLIIIL(LightInteractionCommonResource lightInteractionCommonResource) {
        String str;
        if (C300780Bqe.LIZ() > 0) {
            Iterable iterable = (Iterable) C1231504rp.LIZIZ.getValue();
            LightInteractionStickerSetMessage stickerSetMsg = lightInteractionCommonResource.getStickerSetMsg();
            if (stickerSetMsg != null) {
                str = stickerSetMsg.stickerSetId;
            } else {
                str = null;
            }
            if (C13LP.LJJJJ(str, iterable)) {
                return lightInteractionCommonResource.copy(lightInteractionCommonResource.interactionName, lightInteractionCommonResource.senderPreviewHintText, lightInteractionCommonResource.receiverPreviewHintText, lightInteractionCommonResource.quoteTopSender, lightInteractionCommonResource.quoteTopReceiver, lightInteractionCommonResource.quoteText, lightInteractionCommonResource.toastString, lightInteractionCommonResource.pushSentString, lightInteractionCommonResource.messageType, lightInteractionCommonResource.referenceScene, lightInteractionCommonResource.textMsg, lightInteractionCommonResource.giphyMessage, lightInteractionCommonResource.stickerSetMsg, lightInteractionCommonResource.needVibrate, lightInteractionCommonResource.needImageFlip, Integer.valueOf(C300780Bqe.LIZ()), lightInteractionCommonResource.fullscreenAnimateId, lightInteractionCommonResource.eventName, lightInteractionCommonResource.geckoAnimationChannel);
            }
        }
        return lightInteractionCommonResource;
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final String LJI(C869590Y9l c869590Y9l) {
        User userLJJZZIII = LJJZZIII();
        if (userLJJZZIII != null) {
            userLJJZZIII.getUid();
        }
        if (c869590Y9l == null) {
            return null;
        }
        String extValue = c869590Y9l.getExtValue("a:light_interaction_name");
        if (extValue != null) {
            return extValue;
        }
        return c869590Y9l.getLocalExtValue("a:light_interaction_name");
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final void LJIILLIIL(Context context) {
        Vibrator vibrator = (Vibrator) C786410Ut5.H2(context, "vibrator");
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(25L, 100));
        } else {
            vibrator.vibrate(25L);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final long LJJIIJ(User user) {
        C0ZMH c0zmh = (C0ZMH) LLJJ.getValue();
        String strLJL = LJL(C0YNP.LJ(user.getUid()));
        Keva keva = (Keva) c0zmh.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("first_show_");
        sbLIZ.append(strLJL);
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d9, code lost:
    
        if (r38 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01dc, code lost:
    
        r0 = LJJZZIII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e0, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e3, code lost:
    
        r8 = r0.getUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e7, code lost:
    
        if (r8 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ea, code lost:
    
        r3 = java.lang.System.currentTimeMillis();
        r7 = X.EnumC909380Zlw.COMMON_LIGHT_INTERACTION;
        r0 = LJJZZI(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f4, code lost:
    
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f6, code lost:
    
        r6 = r0.LIZ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01fa, code lost:
    
        r5 = LJLI().LJIIJ(r7, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0204, code lost:
    
        if ((r5 instanceof java.util.Map) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0206, code lost:
    
        if (r5 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0208, code lost:
    
        r5 = X.C2097608Jq.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020c, code lost:
    
        if (r6 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020e, code lost:
    
        r0 = LJJZZI(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0212, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0214, code lost:
    
        r0.LIZIZ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0217, code lost:
    
        r0 = (com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource) r5.get(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x021d, code lost:
    
        if (r0 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x021f, code lost:
    
        r0 = (com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource) ((java.util.Map) X.C0ZMP.LIZ.getValue()).get(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022d, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0233, code lost:
    
        return LJLIIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0234, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011d A[RETURN] */
    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource LJJIIZI(java.lang.String r38) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager.LJJIIZI(java.lang.String):com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource");
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final boolean LJJJJJL(C869590Y9l c869590Y9l) {
        User userLJJZZIII = LJJZZIII();
        if (userLJJZZIII != null) {
            userLJJZZIII.getUid();
        }
        if (LJI(c869590Y9l) != null) {
            return true;
        }
        if (C13LP.LJJJJ(c869590Y9l.getExt().get("a:src"), LLJJIII)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final LightInteractionCommonResource LJJJLZIJ(C869590Y9l c869590Y9l) {
        String strLJI;
        if (c869590Y9l == null || (strLJI = LJI(c869590Y9l)) == null) {
            return null;
        }
        return LJJIIZI(strLJI);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final long LJJLIL(String str) {
        C0ZMH c0zmh = (C0ZMH) LLJJ.getValue();
        String strLJL = LJL(str);
        Keva keva = (Keva) c0zmh.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("first_show_");
        sbLIZ.append(strLJL);
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLL(X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C0ZMB
            if (r0 == 0) goto L28
            r8 = r10
            X.0ZMB r8 = (X.C0ZMB) r8
            int r2 = r8.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r8.LLILZLL = r2
        L12:
            java.lang.Object r3 = r8.LLILZ
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZLL
            r6 = 1
            if (r0 == 0) goto L36
            if (r0 != r6) goto L2e
            int r4 = r8.LLILLL
            long r1 = r8.LLILLJJLI
            java.lang.Object r5 = r8.LL
            java.lang.String r5 = (java.lang.String) r5
            goto L75
        L28:
            X.0ZMB r8 = new X.0ZMB
            r8.<init>(r9, r10)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.LJJZZIII()     // Catch: java.lang.Exception -> L94
            if (r0 != 0) goto L44
            java.util.Map r0 = X.C2097608Jq.LJ()     // Catch: java.lang.Exception -> L94
            return r0
        L44:
            java.lang.String r5 = r0.getUid()     // Catch: java.lang.Exception -> L94
            if (r5 != 0) goto L4f
            java.util.Map r0 = X.C2097608Jq.LJ()     // Catch: java.lang.Exception -> L94
            return r0
        L4f:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L94
            X.0Zlw r3 = X.EnumC909380Zlw.COMMON_LIGHT_INTERACTION     // Catch: java.lang.Exception -> L94
            X.0CFo r0 = LJJZZI(r5, r3)     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L72
            boolean r4 = r0.LIZ(r1)     // Catch: java.lang.Exception -> L94
        L5f:
            com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService r0 = r9.LJLI()     // Catch: java.lang.Exception -> L94
            r8.LL = r5     // Catch: java.lang.Exception -> L94
            r8.LLILLJJLI = r1     // Catch: java.lang.Exception -> L94
            r8.LLILLL = r4     // Catch: java.lang.Exception -> L94
            r8.LLILZLL = r6     // Catch: java.lang.Exception -> L94
            java.lang.Object r3 = r0.LIZJ(r3, r5, r4, r8)     // Catch: java.lang.Exception -> L94
            if (r3 != r7) goto L78
            goto L74
        L72:
            r4 = 0
            goto L5f
        L74:
            return r7
        L75:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L94
        L78:
            boolean r0 = r3 instanceof java.util.Map     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L7f
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> L94
            goto L80
        L7f:
            r3 = 0
        L80:
            if (r3 != 0) goto L86
            java.util.Map r3 = X.C2097608Jq.LJ()     // Catch: java.lang.Exception -> L94
        L86:
            if (r4 == 0) goto L9c
            X.0Zlw r0 = X.EnumC909380Zlw.COMMON_LIGHT_INTERACTION     // Catch: java.lang.Exception -> L94
            X.0CFo r0 = LJJZZI(r5, r0)     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L9c
            r0.LIZIZ(r1)     // Catch: java.lang.Exception -> L94
            return r3
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.Map r3 = X.C2097608Jq.LJ()
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager.LJJLL(X.05Vn):java.lang.Object");
    }

    public static C310620CFo LJJZZI(String str, EnumC909380Zlw enumC909380Zlw) {
        if (C0ZME.LIZ[enumC909380Zlw.ordinal()] == 1) {
            Map<String, C310620CFo> map = LLJJI;
            C310620CFo c310620CFo = (C310620CFo) ((LinkedHashMap) map).get(str);
            if (c310620CFo == null) {
                C310620CFo c310620CFo2 = new C310620CFo((LightInteractionAutoRetryConfig) C0C9O.LIZIZ.getValue());
                map.put(str, c310620CFo2);
                return c310620CFo2;
            }
            return c310620CFo;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final Pair<LightInteractionEntryConf, Integer> LJJIJIIJI(LightInteractionMetaData lightInteractionMetaData, InterfaceC1707406mO interfaceC1707406mO) {
        String uid;
        InterfaceC896190ZDt lightInteractService = C1336205Ku.LIZ(false).getLightInteractService();
        User userLJJZZIII = LJJZZIII();
        if (userLJJZZIII == null || (uid = userLJJZZIII.getUid()) == null) {
            uid = "";
        }
        if (!lightInteractService.LIZ(uid)) {
            return new Pair<>(null, 1);
        }
        IStrategyPlatformService iStrategyPlatformServiceLJLI = LJLI();
        EnumC909380Zlw enumC909380Zlw = EnumC909380Zlw.LIGHT_INTERACTION_ENTRY;
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        IBusinessConfig iBusinessConfigLJ = iStrategyPlatformServiceLJLI.LJ(enumC909380Zlw, lightInteractionMetaData, interfaceC1707406mO, curUserId, false);
        if (iBusinessConfigLJ instanceof LightInteractionEntryConf) {
            if (iBusinessConfigLJ != null && (!C1336205Ku.LIZ(false).getLightInteractService().LIZ(lightInteractionMetaData.uid))) {
                return new Pair<>(null, 2);
            }
        } else {
            iBusinessConfigLJ = null;
        }
        return new Pair<>(iBusinessConfigLJ, 0);
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final void LJJLIIJ(long j, String str) {
        C0ZMH c0zmh = (C0ZMH) LLJJ.getValue();
        String strLJL = LJL(str);
        c0zmh.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("first_show_");
        sbLIZ.append(strLJL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!((Keva) c0zmh.LIZ.getValue()).contains(strLIZIZ)) {
            ((Keva) c0zmh.LIZ.getValue()).storeLong(strLIZIZ, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final String LJJLJLI(Long l, Long l2) {
        if (l != null && l2 != null) {
            LightInteractionStickerSetMessage lightInteractionStickerSetMessage = C0ZM9.LIZ;
            return (String) ((LinkedHashMap) C0ZM9.LIZIZ).get(new Pair(l.toString(), l2.toString()));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJZ(java.lang.String r11, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C0ZMA
            if (r0 == 0) goto L9e
            r9 = r12
            X.0ZMA r9 = (X.C0ZMA) r9
            int r2 = r9.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r9.LLIZ = r2
        L12:
            java.lang.Object r4 = r9.LLILZIL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLIZ
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L63
            if (r0 != r7) goto La5
            int r1 = r9.LLILZ
            long r2 = r9.LLILLL
            java.lang.Object r5 = r9.LLILLJJLI
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r11 = r9.LL
            X.C155000ia.LIZIZ(r4)
        L2d:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L35
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto L39
        L35:
            java.util.Map r4 = X.C2097608Jq.LJ()
        L39:
            if (r1 == 0) goto L46
            X.0Zlw r0 = X.EnumC909380Zlw.COMMON_LIGHT_INTERACTION
            X.0CFo r0 = LJJZZI(r5, r0)
            if (r0 == 0) goto L46
            r0.LIZIZ(r2)
        L46:
            java.lang.Object r0 = r4.get(r11)
            com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource r0 = (com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource) r0
            if (r0 != 0) goto L5e
            X.01GW r0 = X.C0ZMP.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r11)
            com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource r0 = (com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource) r0
            if (r0 == 0) goto L62
        L5e:
            com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource r6 = LJLIIIL(r0)
        L62:
            return r6
        L63:
            X.C155000ia.LIZIZ(r4)
            if (r11 != 0) goto L69
            return r6
        L69:
            com.ss.android.ugc.aweme.profile.model.User r0 = r10.LJJZZIII()
            if (r0 != 0) goto L70
            return r6
        L70:
            java.lang.String r5 = r0.getUid()
            if (r5 != 0) goto L77
            return r6
        L77:
            long r2 = java.lang.System.currentTimeMillis()
            X.0Zlw r4 = X.EnumC909380Zlw.COMMON_LIGHT_INTERACTION
            X.0CFo r0 = LJJZZI(r5, r4)
            if (r0 == 0) goto L9c
            boolean r1 = r0.LIZ(r2)
        L87:
            com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService r0 = r10.LJLI()
            r9.LL = r11
            r9.LLILLJJLI = r5
            r9.LLILLL = r2
            r9.LLILZ = r1
            r9.LLIZ = r7
            java.lang.Object r4 = r0.LIZJ(r4, r5, r1, r9)
            if (r4 != r8) goto L2d
            return r8
        L9c:
            r1 = 0
            goto L87
        L9e:
            X.0ZMA r9 = new X.0ZMA
            r9.<init>(r10, r12)
            goto L12
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager.LJJZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLI(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21, com.bytedance.im.core.proto.ReferenceInfo r22, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent r23, java.io.Serializable r24, java.lang.Integer r25, X.C0YTK r26, X.InterfaceC1364105Vn<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager.LJJLI(java.lang.String, java.lang.String, java.lang.String, java.util.Map, com.bytedance.im.core.proto.ReferenceInfo, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent, java.io.Serializable, java.lang.Integer, X.0YTK, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService
    public final void LJJLIIIJILLIZJL(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, ReferenceInfo referenceInfo, AttachmentComponent attachmentComponent, Serializable serializable, Integer num, C0YTK c0ytk, BaseHeaderComponent baseHeaderComponent) {
        long jLIZIZ;
        if (C296660Bk0.LIZ()) {
            IIMUserPortraitManager.LIZ.getClass();
            IIMUserPortraitManager iIMUserPortraitManagerLIZ = C0Z5R.LIZ();
            if (iIMUserPortraitManagerLIZ != null) {
                IMHostApi.LIZ.getClass();
                IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
                if (iMHostApiLIZ != null) {
                    jLIZIZ = iMHostApiLIZ.LIZIZ();
                } else {
                    jLIZIZ = 0;
                }
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                iIMUserPortraitManagerLIZ.LIZJ(jLIZIZ, curUserId);
            }
        }
        C879420Yei c879420Yei = new C879420Yei();
        LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI = LJJIIZI(str);
        if (lightInteractionCommonResourceLJJIIZI == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("common resource is null: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            if (c0ytk != null) {
                c879420Yei.LJFF(c0ytk);
                return;
            } else {
                c879420Yei.LJ();
                return;
            }
        }
        c879420Yei.LIZJ = lightInteractionCommonResourceLJJIIZI;
        if (str3 != null) {
            c879420Yei.LJIIIIZZ = str3;
        }
        if (str2 != null) {
            c879420Yei.LJII = str2;
        }
        if (map != null) {
            c879420Yei.LIZLLL(new LinkedHashMap(map));
        }
        if (map2 != null) {
            c879420Yei.LJIIJ = C901060ZWm.LJ(map2);
        }
        if (referenceInfo != null) {
            c879420Yei.LJIIIZ = referenceInfo;
        }
        if ((serializable instanceof BaseContent.ReferenceVideo) && serializable != null) {
            c879420Yei.LIZLLL = (BaseContent.ReferenceVideo) serializable;
        }
        if (num != null) {
            c879420Yei.LJ = Integer.valueOf(num.intValue());
        }
        if (attachmentComponent != null) {
            c879420Yei.LJFF = attachmentComponent;
        }
        if (baseHeaderComponent != null) {
            c879420Yei.LJI = baseHeaderComponent;
        }
        if (c0ytk != null) {
            c879420Yei.LJFF(c0ytk);
        } else {
            c879420Yei.LJ();
        }
        if (str2 != null && Intrinsics.LJFF(str, EnumC895010Z9f.SPARK_BACK_V1.getLightInteractionName())) {
            C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJII(str2);
        }
    }
}
