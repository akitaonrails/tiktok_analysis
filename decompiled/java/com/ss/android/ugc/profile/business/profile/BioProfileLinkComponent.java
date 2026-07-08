package com.ss.android.ugc.profile.business.profile;

import X.C01GW;
import X.C08JS;
import X.C0BXO;
import X.C0OBG;
import X.C0WZX;
import X.C1047050dLz;
import X.C1066700drg;
import X.C1066710drh;
import X.C123100dR;
import X.C1247530iZL;
import X.C1248230iaT;
import X.C1248460iaq;
import X.C1248720ibG;
import X.C1248870ibV;
import X.C1251350ifV;
import X.C1253220iiW;
import X.C1253930ijf;
import X.C1254160ik2;
import X.C1254290ikF;
import X.C1254430ikT;
import X.C1254440ikU;
import X.C1254510ikb;
import X.C1266310j3d;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1554300qY8;
import X.C1558520qew;
import X.C1701330uNH;
import X.C1721460utk;
import X.C178200mK;
import X.C19252910Tv;
import X.C1954807lC;
import X.C19EG;
import X.C1BHW;
import X.C1ECD;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2273111Dy9;
import X.C2277041EAs;
import X.C2344009Gk;
import X.C2429209fW;
import X.C2532609wC;
import X.C2537109wv;
import X.C259800zU;
import X.C268330AfP;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C487280J9a;
import X.C698190Ra5;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC1216830hlp;
import X.EnumC1216860hls;
import X.EnumC1248370iah;
import X.EnumC1248450iap;
import X.EnumC1249830id3;
import X.InterfaceC1248320iac;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SeclinkConfig;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.profile.business.ur.experiment.BioLinkReportConfig;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public final class BioProfileLinkComponent extends BioUserWebUIComponent<ProfileBioLinkData> implements InterfaceC487330J9f, InterfaceC1248320iac {
    public static final Set<Integer> LLLI = Collections.singleton(Integer.valueOf(EnumC1216830hlp.LEMON8.getType()));
    public long LLJLLIL;
    public boolean LLJLLL;
    public TuxIconView LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public LinearLayout LLLF;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2087));
    public final boolean LLLFF = ((Boolean) C2537109wv.LJIIL.getValue()).booleanValue();
    public final boolean LLLFFI = C2537109wv.LIZLLL();
    public EnumC1248450iap LLLFZ = EnumC1248450iap.NORMAL;

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent
    public final int Ap() {
        return R.raw.icon_link_fill;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ee  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go() {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.BioProfileLinkComponent.Go():void");
    }

    public final String Gp() {
        String aid;
        C1253220iiW c1253220iiWRP2;
        String str;
        C1253220iiW c1253220iiWRP22;
        Aweme aweme;
        C1254160ik2 c1254160ik2 = C1254160ik2.LIZIZ;
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        String str2 = "";
        if (profileBaseAbility == null || (c1253220iiWRP22 = profileBaseAbility.rP2()) == null || (aweme = c1253220iiWRP22.LIZJ) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        ProfileBaseAbility profileBaseAbility2 = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility2 != null && (c1253220iiWRP2 = profileBaseAbility2.rP2()) != null && (str = c1253220iiWRP2.LIZ) != null) {
            str2 = str;
        }
        return c1254160ik2.LJIIZILJ(aid, str2);
    }

    public final Integer Ip() {
        TuxTextView tuxTextView = this.LLL;
        if (tuxTextView == null) {
            return null;
        }
        Paint paint = new Paint();
        paint.setTextSize(tuxTextView.getTextSize());
        paint.setTypeface(tuxTextView.getTypeface());
        return Integer.valueOf((ScreenUtils.getScreenWidth(getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110))) - ((int) paint.measureText(tuxTextView.getText().toString())));
    }

    public final Integer Jp() {
        TuxTextView tuxTextView = this.LLL;
        if (tuxTextView == null) {
            return null;
        }
        Paint paint = new Paint();
        paint.setTextSize(tuxTextView.getTextSize());
        paint.setTypeface(tuxTextView.getTypeface());
        int screenWidth = (ScreenUtils.getScreenWidth(getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C268330AfP.LJIIIZ() ? 62 : 110)))) - ((int) paint.measureText(tuxTextView.getText().toString()));
        return screenWidth > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(192)) ? Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(192))) : Integer.valueOf(screenWidth);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        FragmentManager supportFragmentManager;
        UserProfileInfo userProfileInfo;
        C1253220iiW c1253220iiWRP2;
        Aweme aweme;
        C1253220iiW c1253220iiWRP22;
        Aweme aweme2;
        C1253220iiW c1253220iiWRP23;
        List<ProfileLinkData> profileLinks;
        ProfileBioLinkData profileBioLinkData;
        List<ProfileLinkData> profileLinks2;
        String remoteText;
        String backupUrl;
        List<ProfileLinkData> profileLinks3;
        ProfileLinkData profileLinkData;
        List<ProfileLinkData> profileLinks4;
        if (C0OBG.LIZIZ(this.LLJJ)) {
            return;
        }
        ProfileBioLinkData profileBioLinkData2 = (ProfileBioLinkData) this.LLJJLIIIJLLLLLLLZ;
        if (((profileBioLinkData2 == null || (profileLinks4 = profileBioLinkData2.getProfileLinks()) == null) ? 0 : profileLinks4.size()) == 1) {
            ProfileBioLinkData profileBioLinkData3 = (ProfileBioLinkData) this.LLJJLIIIJLLLLLLLZ;
            if (profileBioLinkData3 == null || (profileLinks3 = profileBioLinkData3.getProfileLinks()) == null || (profileLinkData = (ProfileLinkData) ListProtector.get(profileLinks3, 0)) == null) {
                return;
            } else {
                kq(profileLinkData);
            }
        } else {
            kp(C1248720ibG.LIZ(EnumC1249830id3.HAS_BIOLINK_LIST), EnumC1248370iah.BIO);
            ArrayList arrayList = new ArrayList();
            if (this.LLJJLIIIJLLLLLLLZ != 0 && getContext() != null && (profileBioLinkData = (ProfileBioLinkData) this.LLJJLIIIJLLLLLLLZ) != null && (profileLinks2 = profileBioLinkData.getProfileLinks()) != null) {
                for (ProfileLinkData profileLinkData2 : profileLinks2) {
                    Integer profileLinkId = profileLinkData2.getProfileLinkId();
                    EnumC1216830hlp enumC1216830hlp = EnumC1216830hlp.TWITTER;
                    enumC1216830hlp.getType();
                    if (profileLinkId != null) {
                        profileLinkId.intValue();
                    }
                    Integer profileLinkId2 = profileLinkData2.getProfileLinkId();
                    int type = enumC1216830hlp.getType();
                    if (profileLinkId2 == null || profileLinkId2.intValue() != type) {
                        C1247530iZL c1247530iZL = new C1247530iZL();
                        Icon icon = profileLinkData2.getIcon();
                        Integer numXp = Xp(icon != null ? icon.getLocalIcon() : null);
                        c1247530iZL.LIZJ(numXp != null ? numXp.intValue() : 0);
                        Describe text = profileLinkData2.getText();
                        if (text == null || (remoteText = text.getRemoteText()) == null) {
                            remoteText = "";
                        }
                        c1247530iZL.LIZ = remoteText;
                        c1247530iZL.LIZ(new AwS385S0200000_19(this, profileLinkData2, 86));
                        Integer profileLinkId3 = profileLinkData2.getProfileLinkId();
                        int type2 = EnumC1216830hlp.WEBSITE.getType();
                        if (profileLinkId3 != null && profileLinkId3.intValue() == type2 && ((backupUrl = profileLinkData2.getBackupUrl()) == null || backupUrl.length() == 0)) {
                            c1247530iZL.LIZLLL = false;
                        } else {
                            c1247530iZL.LIZLLL = true;
                        }
                        arrayList.add(c1247530iZL);
                    }
                }
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null || (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) == null) {
                return;
            }
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJFF(arrayList);
            c1390850mIV.LIZ.LLJJJ = 1;
            c1390850mIV.LIZJ().show(supportFragmentManager, "third social");
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
            ProfileBioLinkData profileBioLinkData4 = (ProfileBioLinkData) this.LLJJLIIIJLLLLLLLZ;
            c2344009Gk.LJ((profileBioLinkData4 == null || (profileLinks = profileBioLinkData4.getProfileLinks()) == null) ? null : Integer.valueOf(profileLinks.size()), "link_num");
            c2344009Gk.LJIIIIZZ("website_order", Vp(EnumC1216830hlp.WEBSITE.getType()));
            c2344009Gk.LJIIIIZZ("youtube_order", Vp(EnumC1216830hlp.YOUTUBE.getType()));
            c2344009Gk.LJIIIIZZ("instagram_order", Vp(EnumC1216830hlp.INSTAGRAM.getType()));
            c2344009Gk.LJIIIIZZ("twitter_order", Vp(EnumC1216830hlp.TWITTER.getType()));
            c2344009Gk.LJIIIIZZ("lemon8_order", Vp(EnumC1216830hlp.LEMON8.getType()));
            ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
            c2344009Gk.LJIIIIZZ("previous_page", (profileBaseAbility == null || (c1253220iiWRP23 = profileBaseAbility.rP2()) == null) ? null : c1253220iiWRP23.LIZ);
            ProfileBaseAbility profileBaseAbility2 = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
            c2344009Gk.LJIIIIZZ("group_id", (profileBaseAbility2 == null || (c1253220iiWRP22 = profileBaseAbility2.rP2()) == null || (aweme2 = c1253220iiWRP22.LIZJ) == null) ? null : aweme2.getAid());
            ProfileBaseAbility profileBaseAbility3 = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
            c2344009Gk.LJIIIIZZ("aweme_request_id", (profileBaseAbility3 == null || (c1253220iiWRP2 = profileBaseAbility3.rP2()) == null || (aweme = c1253220iiWRP2.LIZJ) == null) ? null : aweme.getRequestId());
            ProfileCommonInfo profileCommonInfoVo = Vo();
            c2344009Gk.LJIIIIZZ("to_user_id", (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null) ? null : userProfileInfo.getUid());
            C20684815ws.LJIILLIIL("profile_biolink_list_unfold", c2344009Gk.LIZ);
        }
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        User userVQ2 = profilePlatformViewModelYp != null ? profilePlatformViewModelYp.vQ2() : null;
        c1253930ijf.getClass();
        C1253930ijf.LIZ(userVQ2, "weblink");
    }

    public final String Tp() {
        String uid;
        UserProfileInfo userProfileInfo;
        Uri uri = UriProtector.parse((String) C2277041EAs.LJ.getValue());
        ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "landing_config"));
        if (concurrentHashMapLIZ != null) {
            ProfileCommonInfo profileCommonInfoVo = Vo();
            if (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                uid = "";
            }
            concurrentHashMapLIZ.putIfAbsent("recommend_user_id", uid);
        }
        String strLIZIZ = C178200mK.LIZIZ(concurrentHashMapLIZ);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str, "landing_config")) {
                builderBuildUpon.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            }
        }
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            builderBuildUpon.appendQueryParameter("landing_config", strLIZIZ);
        }
        return Uri.encode(builderBuildUpon.build().toString());
    }

    public final Map<String, String> aq() {
        String uid;
        UserProfileInfo userProfileInfo;
        C1251350ifV state;
        Aweme aweme;
        String aid;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp != null && (state = profilePlatformViewModelYp.getState()) != null && (aweme = state.LLJILJILJ) != null && (aid = aweme.getAid()) != null) {
            linkedHashMap.put("aweme_id", aid);
        }
        ProfileCommonInfo profileCommonInfoVo = Vo();
        if (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
            uid = "";
        }
        linkedHashMap.put("owner_id", uid);
        linkedHashMap.put("enter_from", "biolink_profile_page");
        linkedHashMap.put("report_type", "bio_link");
        linkedHashMap.put("page_depth_of_report_show", String.valueOf(C1254290ikF.LIZ()));
        linkedHashMap.put("previous_page", q1() ? "personal_homepage" : "others_homepage");
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dq() {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.BioProfileLinkComponent.dq():void");
    }

    @Override // X.InterfaceC1248320iac
    public final void fm() {
        TuxTextView tuxTextView = this.LLJZIJLIL;
        if (tuxTextView != null) {
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        int i = C1248460iaq.LIZ[this.LLLFZ.ordinal()];
        if (i == 3) {
            LinearLayout linearLayout = this.LLLF;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
        } else if (i == 4) {
            dq();
        }
        this.LLLFZ = EnumC1248450iap.NORMAL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        EnumC1248450iap enumC1248450iap = this.LLLFZ;
        if (enumC1248450iap == EnumC1248450iap.FOLD || enumC1248450iap == EnumC1248450iap.SHOW_MORE) {
            return;
        }
        dq();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // X.InterfaceC1248320iac
    public final int a() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1248320iac
    public final EnumC1248450iap h() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1248320iac
    public final void Bk(EnumC1248450iap enumC1248450iap) {
        LinearLayout linearLayout;
        List<ProfileLinkData> profileLinks;
        ProfileLinkData profileLinkData;
        String localIcon;
        int i;
        float textSize;
        Typeface typeface;
        CharSequence text;
        String string;
        String string2;
        String remoteText;
        Describe text2;
        Icon icon;
        List<ProfileLinkData> profileLinks2;
        LinearLayout linearLayout2;
        this.LLLFZ = enumC1248450iap;
        int i2 = C1248460iaq.LIZ[enumC1248450iap.ordinal()];
        int iIntValue = 0;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    if (C0BXO.LIZ() && (linearLayout2 = this.LLLF) != null) {
                        C786410Ut5.LJZL(0, linearLayout2);
                    }
                    ProfileBioLinkData profileBioLinkData = (ProfileBioLinkData) this.LLJJLIIIJLLLLLLLZ;
                    String string3 = null;
                    if (profileBioLinkData != null && (profileLinks = profileBioLinkData.getProfileLinks()) != null && !profileLinks.isEmpty()) {
                        ProfileBioLinkData profileBioLinkData2 = (ProfileBioLinkData) this.LLJJLIIIJLLLLLLLZ;
                        if (profileBioLinkData2 != null && (profileLinks2 = profileBioLinkData2.getProfileLinks()) != null) {
                            profileLinkData = (ProfileLinkData) ListProtector.get(profileLinks2, 0);
                        } else {
                            profileLinkData = null;
                        }
                        T t = this.LLJJLIIIJLLLLLLLZ;
                        if (t != 0 && (icon = t.getIcon()) != null) {
                            localIcon = icon.getLocalIcon();
                        } else {
                            localIcon = null;
                        }
                        C419910GdJ c419910GdJWp = Wp(localIcon);
                        if (this.LLLFF) {
                            i = R.attr.a1o;
                        } else {
                            i = R.attr.a1h;
                        }
                        if (c419910GdJWp != null) {
                            c419910GdJWp.LJ = Integer.valueOf(i);
                        }
                        TuxTextView tuxTextView = this.LLJZIJLIL;
                        if (tuxTextView != null) {
                            tuxTextView.setTextColorRes(i);
                        }
                        TuxTextView tuxTextView2 = this.LLJZIJLIL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        }
                        TuxIconView tuxIconView = this.LLJZ;
                        if (tuxIconView != null) {
                            tuxIconView.setTuxIcon(c419910GdJWp);
                        }
                        TuxTextView tuxTextView3 = this.LLJZIJLIL;
                        if (tuxTextView3 != null) {
                            if (profileLinkData != null && (text2 = profileLinkData.getText()) != null) {
                                remoteText = text2.getRemoteText();
                            } else {
                                remoteText = null;
                            }
                            tuxTextView3.setText(remoteText);
                        }
                        TuxTextView tuxTextView4 = this.LLL;
                        if (tuxTextView4 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView4, 0);
                        }
                        TuxTextView tuxTextView5 = this.LLL;
                        if (tuxTextView5 != null) {
                            Context context = getContext();
                            if (context != null) {
                                string2 = context.getString(2131835493);
                            } else {
                                string2 = null;
                            }
                            tuxTextView5.setText(string2);
                        }
                        TuxTextView tuxTextView6 = this.LLL;
                        if (tuxTextView6 != null) {
                            C426750GoL.LJIIIZ(tuxTextView6, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, 0, false, 16);
                        }
                        Paint paint = new Paint();
                        TuxTextView tuxTextView7 = this.LLJZIJLIL;
                        if (tuxTextView7 != null) {
                            textSize = tuxTextView7.getTextSize();
                        } else {
                            textSize = 0.0f;
                        }
                        paint.setTextSize(textSize);
                        TuxTextView tuxTextView8 = this.LLJZIJLIL;
                        if (tuxTextView8 != null) {
                            typeface = tuxTextView8.getTypeface();
                        } else {
                            typeface = null;
                        }
                        paint.setTypeface(typeface);
                        TuxTextView tuxTextView9 = this.LLJZIJLIL;
                        if (tuxTextView9 != null) {
                            text = tuxTextView9.getText();
                        } else {
                            text = null;
                        }
                        int iMeasureText = (int) paint.measureText(String.valueOf(text));
                        Integer numJp = Jp();
                        if (numJp != null) {
                            numJp.intValue();
                        }
                        Integer numIp = Ip();
                        if (numIp != null) {
                            iIntValue = numIp.intValue();
                        }
                        if (iMeasureText > iIntValue) {
                            TuxTextView tuxTextView10 = this.LLJZIJLIL;
                            if (tuxTextView10 != null) {
                                tuxTextView10.setEllipsize(TextUtils.TruncateAt.END);
                            }
                            TuxTextView tuxTextView11 = this.LLL;
                            if (tuxTextView11 != null) {
                                Context context2 = getContext();
                                if (context2 != null) {
                                    string3 = context2.getString(2131835493);
                                }
                                tuxTextView11.setText(string3);
                            }
                        } else {
                            TuxTextView tuxTextView12 = this.LLL;
                            if (tuxTextView12 != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("... ");
                                Context context3 = getContext();
                                if (context3 != null) {
                                    string = context3.getString(2131835493);
                                } else {
                                    string = null;
                                }
                                sbLIZ.append(string);
                                tuxTextView12.setText(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            TuxTextView tuxTextView13 = this.LLJZIJLIL;
                            if (tuxTextView13 != null) {
                                tuxTextView13.setEllipsize(null);
                            }
                        }
                        Integer numIp2 = Ip();
                        if (numIp2 != null) {
                            int iIntValue2 = numIp2.intValue();
                            TuxTextView tuxTextView14 = this.LLJZIJLIL;
                            if (tuxTextView14 != null) {
                                tuxTextView14.setMaxWidth(iIntValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            LinearLayout linearLayout3 = this.LLLF;
            if (linearLayout3 == null) {
                return;
            }
            C786410Ut5.LJZL(8, linearLayout3);
            return;
        }
        if (C0BXO.LIZ() && (linearLayout = this.LLLF) != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        dq();
    }

    public final boolean Fp(ProfileLinkData profileLinkData) {
        ProfileCommonInfo profileCommonInfoVo;
        UserProfileInfo userProfileInfo;
        boolean z;
        String url = profileLinkData.getUrl();
        if (url != null) {
            C1254510ikb.LIZ.getClass();
            if (C1254510ikb.LIZ(url) && (profileCommonInfoVo = Vo()) != null && (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) != null && userProfileInfo.getUid() != null) {
                C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                String enterFrom = getEnterFrom();
                Integer bioLinkClickAction = profileLinkData.getBioLinkClickAction();
                EnumC1216860hls enumC1216860hls = EnumC1216860hls.ALLOW;
                int value = enumC1216860hls.getValue();
                if (bioLinkClickAction != null && bioLinkClickAction.intValue() == value) {
                    z = true;
                } else {
                    z = false;
                }
                c1254430ikT.getClass();
                C1254430ikT.LIZ(enterFrom, z);
                Integer bioLinkClickAction2 = profileLinkData.getBioLinkClickAction();
                int value2 = enumC1216860hls.getValue();
                if (bioLinkClickAction2 != null && bioLinkClickAction2.intValue() == value2) {
                    C1254510ikb.LIZIZ(url, new C1254440ikU(true, getEnterFrom()));
                    return true;
                }
                C1254430ikT.LIZIZ(0, getEnterFrom(), false);
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        UserRelationInfo userRelationInfo;
        ProfileCommonInfo profileCommonInfoVo = Vo();
        if ((profileCommonInfoVo == null || (userRelationInfo = profileCommonInfoVo.getUserRelationInfo()) == null || !Intrinsics.LJFF(userRelationInfo.isBlocking(), Boolean.TRUE)) && this.LLJLIL) {
            Bk(this.LLLFZ);
            this.LLJLIL = false;
        }
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ep(nVar);
        }
        tp();
    }

    public final void Qp(Context context) {
        if (context == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJLLIL < 3000) {
            return;
        }
        this.LLJLLIL = jCurrentTimeMillis;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LIZLLL(2000L);
            c1389890mGx.LJIIIZ(2131830512);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        LinearLayout linearLayout;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        LinearLayout linearLayout2;
        Context context = getContext();
        if (context != null) {
            linearLayout = new LinearLayout(context);
        } else {
            linearLayout = null;
        }
        this.LLLF = linearLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        LinearLayout linearLayout3 = this.LLLF;
        if (linearLayout3 != null) {
            C786410Ut5.d6(linearLayout3, layoutParams);
        }
        if (!C268330AfP.LJIIIZ() && (linearLayout2 = this.LLLF) != null) {
            linearLayout2.setGravity(17);
        }
        LinearLayout linearLayout4 = this.LLLF;
        if (linearLayout4 != null) {
            linearLayout4.setOrientation(0);
        }
        if (C268330AfP.LIZLLL()) {
            LinearLayout linearLayout5 = this.LLLF;
            if (linearLayout5 != null) {
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                this.LLJLL.getValue().getClass();
                C426750GoL.LJIIIZ(linearLayout5, numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 0, false, 16);
            }
        } else if (C268330AfP.LJIIIZ()) {
            LinearLayout linearLayout6 = this.LLLF;
            if (linearLayout6 != null) {
                C426750GoL.LJIIIZ(linearLayout6, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 0, false, 16);
            }
        } else if (C2537109wv.LJFF()) {
            LinearLayout linearLayout7 = this.LLLF;
            if (linearLayout7 != null) {
                C426750GoL.LJIIIZ(linearLayout7, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), 0, false, 16);
            }
        } else {
            LinearLayout linearLayout8 = this.LLLF;
            if (linearLayout8 != null) {
                C426750GoL.LJIIIZ(linearLayout8, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), 0, false, 16);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            tuxIconView = new TuxIconView(context2, null, 0, 6, null);
        } else {
            tuxIconView = null;
        }
        this.LLJZ = tuxIconView;
        TuxIconView tuxIconView2 = this.LLJZ;
        if (tuxIconView2 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            layoutParams2.gravity = 16;
            C786410Ut5.M6(tuxIconView2, layoutParams2);
        }
        LinearLayout linearLayout9 = this.LLLF;
        if (linearLayout9 != null) {
            linearLayout9.addView(this.LLJZ);
        }
        Context context3 = getContext();
        if (context3 != null) {
            tuxTextView = new TuxTextView(context3, null, 6, 0);
        } else {
            tuxTextView = null;
        }
        this.LLJZIJLIL = tuxTextView;
        TuxTextView tuxTextView3 = this.LLJZIJLIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setMaxLines(1);
            tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
            this.LLJLL.getValue().getClass();
            tuxTextView3.setTuxFont(C1248230iaT.LJIIJJI());
            C786410Ut5.R6(tuxTextView3, new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
            tuxTextView3.setTextColorRes(R.attr.a1h);
            tuxTextView3.setGravity(16);
        }
        LinearLayout linearLayout10 = this.LLLF;
        if (linearLayout10 != null) {
            linearLayout10.addView(this.LLJZIJLIL);
        }
        Context context4 = getContext();
        if (context4 != null) {
            tuxTextView2 = new TuxTextView(context4, null, 6, 0);
        } else {
            tuxTextView2 = null;
        }
        this.LLL = tuxTextView2;
        TuxTextView tuxTextView4 = this.LLL;
        if (tuxTextView4 != null) {
            C786410Ut5.R6(tuxTextView4, new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
            this.LLJLL.getValue().getClass();
            tuxTextView4.setTuxFont(C1248230iaT.LJIIJJI());
            tuxTextView4.setTextColorRes(R.attr.a1h);
            C426750GoL.LJIIIZ(tuxTextView4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 0, 0, false, 16);
            tuxTextView4.setGravity(16);
        }
        LinearLayout linearLayout11 = this.LLLF;
        if (linearLayout11 != null) {
            linearLayout11.addView(this.LLL);
        }
        C1248870ibV.LIZJ(this.LLLF, profileComponentUIConfig, true, false);
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJJJJJL(this.LLLF, null, null);
        return this.LLLF;
    }

    public final EnumC1249830id3 Up(Integer num) {
        int type = EnumC1216830hlp.YOUTUBE.getType();
        if (num != null && num.intValue() == type) {
            return EnumC1249830id3.HAS_YOUTUBE_FUNCTION;
        }
        int type2 = EnumC1216830hlp.TWITTER.getType();
        if (num != null && num.intValue() == type2) {
            return EnumC1249830id3.HAS_TWITTER_FUNCTION;
        }
        int type3 = EnumC1216830hlp.INSTAGRAM.getType();
        if (num != null && num.intValue() == type3) {
            return EnumC1249830id3.HAS_INSTAGRAM_FUNCTION;
        }
        int type4 = EnumC1216830hlp.LEMON8.getType();
        if (num != null && num.intValue() == type4) {
            return EnumC1249830id3.HAS_LEMON8_FUNCTION;
        }
        int type5 = EnumC1216830hlp.WEBSITE.getType();
        if (num != null && num.intValue() == type5) {
            return EnumC1249830id3.HAS_WEBSITE_FUNCTION;
        }
        return null;
    }

    public final String Vp(int i) {
        List<ProfileLinkData> profileLinks;
        List<ProfileLinkData> profileLinks2;
        ProfileBioLinkData profileBioLinkData = (ProfileBioLinkData) this.LLJJLIIIJLLLLLLLZ;
        Integer numValueOf = null;
        if (profileBioLinkData != null && (profileLinks = profileBioLinkData.getProfileLinks()) != null) {
            Iterator<ProfileLinkData> it2 = profileLinks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ProfileLinkData next = it2.next();
                Integer profileLinkId = next.getProfileLinkId();
                if (profileLinkId != null && profileLinkId.intValue() == i) {
                    if (next != null) {
                        ProfileBioLinkData profileBioLinkData2 = (ProfileBioLinkData) this.LLJJLIIIJLLLLLLLZ;
                        if (profileBioLinkData2 != null && (profileLinks2 = profileBioLinkData2.getProfileLinks()) != null) {
                            Iterator<ProfileLinkData> it3 = profileLinks2.iterator();
                            int i2 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    Integer profileLinkId2 = it3.next().getProfileLinkId();
                                    if (profileLinkId2 != null && profileLinkId2.intValue() == i) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    i2 = -1;
                                    break;
                                }
                            }
                            numValueOf = Integer.valueOf(i2 + 1);
                        }
                        return String.valueOf(numValueOf);
                    }
                }
            }
        }
        return null;
    }

    public final C419910GdJ Wp(String str) {
        int iIntValue;
        if (getContext() != null) {
            Integer numXp = Xp(str);
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (numXp != null) {
                iIntValue = numXp.intValue();
            } else {
                iIntValue = R.raw.icon_link_fill;
            }
            c419910GdJ.LIZ = iIntValue;
            if (this.LLLFFI) {
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                return c419910GdJ;
            }
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            return c419910GdJ;
        }
        return null;
    }

    public final Integer Xp(String str) {
        C698190Ra5 c698190Ra5LIZJ;
        Context context = getContext();
        if (context != null && (c698190Ra5LIZJ = C1721460utk.LIZJ(context, str, null, "bio_profile_link", "")) != null) {
            return Integer.valueOf(c698190Ra5LIZJ.LIZ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C08JS.LIZ(nVar.toString(), ProfileBioLinkData.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x0627  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kq(final com.ss.android.ugc.profile.business.profile.ProfileLinkData r29) {
        /*
            Method dump skipped, instruction units count: 1683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.BioProfileLinkComponent.kq(com.ss.android.ugc.profile.business.profile.ProfileLinkData):void");
    }

    public final void pq(ProfileLinkData profileLinkData) {
        Context context;
        BioLinkReportConfig bioLinkReportConfig;
        String uid;
        String str;
        String str2;
        UserProfileInfo userProfileInfo;
        C1251350ifV state;
        Aweme aweme;
        String aid;
        UserAccountInfo userAccountInfo;
        Integer accountType;
        UserProfileInfo userProfileInfo2;
        if (!Fp(profileLinkData) && (context = getContext()) != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJJJL(C2429209fW.LIZ().appendDataFlowId(sparkContext.bundle, "402665472"));
            sparkContext.bizCert = new ThirdPartyBizCert(402665472);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview/?url=");
            String backupUrl = profileLinkData.getBackupUrl();
            String str3 = "";
            if (backupUrl == null) {
                backupUrl = "";
            }
            sbLIZ.append(Uri.encode(backupUrl));
            sbLIZ.append("&use_spark=1&bid=bio_link_scene&enable_runtime_switch=0&target_handler=crossPlatform");
            sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ));
            try {
                SettingsManager.LIZLLL().getClass();
                bioLinkReportConfig = (BioLinkReportConfig) SettingsManager.LJII("bio_link_report_config", BioLinkReportConfig.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                bioLinkReportConfig = null;
            }
            if (bioLinkReportConfig == null || bioLinkReportConfig.isBioLinkReportShow()) {
                ProfilePlatformViewModel profilePlatformViewModelYp = yp();
                if (profilePlatformViewModelYp != null && (state = profilePlatformViewModelYp.getState()) != null && (aweme = state.LLJILJILJ) != null && (aid = aweme.getAid()) != null) {
                    sparkContext.LJJJZ("aweme_id", aid);
                }
                ProfileCommonInfo profileCommonInfoVo = Vo();
                if (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
                    uid = "";
                }
                sparkContext.LJJJZ("owner_id", uid);
                sparkContext.LJJJZ("enter_from", "biolink_profile_page");
                sparkContext.LJJJZ("report_type", "bio_link");
                sparkContext.LJJJLZIJ(C1254290ikF.LIZ(), "page_depth_of_report_show");
                sparkContext.LJJJZ("sec_link_scene", "bio_url");
                sparkContext.LJJL("need_sec_link", true);
                if (C2273111Dy9.LIZ()) {
                    str = "more";
                } else {
                    str = "report";
                }
                sparkContext.LJJJZ("nav_btn_type", str);
                sparkContext.LJJL("need_report", true);
                sparkContext.LJJJZ("title", context.getString(2131848751));
                if (C2273111Dy9.LIZ()) {
                    sparkContext.LJJLIIIJLLLLLLLZ(new C1047050dLz());
                    if (q1()) {
                        str2 = "personal_homepage";
                    } else {
                        str2 = "others_homepage";
                    }
                    sparkContext.LJJJZ("previous_page", str2);
                    String url = profileLinkData.getUrl();
                    if (url == null) {
                        url = "";
                    }
                    sparkContext.LJJJZ("bio_url", url);
                }
            }
            Integer bioLinkClickAction = profileLinkData.getBioLinkClickAction();
            int value = EnumC1216860hls.ALLOW.getValue();
            if (bioLinkClickAction != null && bioLinkClickAction.intValue() == value) {
                int i = C2187451AjH.LIZ;
                ProfileCommonInfo profileCommonInfoVo2 = Vo();
                if (profileCommonInfoVo2 != null && (userProfileInfo2 = profileCommonInfoVo2.getUserProfileInfo()) != null && userProfileInfo2.getUid() != null) {
                    C1254510ikb c1254510ikb = C1254510ikb.LIZ;
                    C1254440ikU c1254440ikU = new C1254440ikU(false, getEnterFrom());
                    c1254510ikb.getClass();
                    sparkContext.LJJJJZ(new C1266310j3d(c1254440ikU, 1));
                }
            } else {
                ProfileCommonInfo profileCommonInfoVo3 = Vo();
                if ((profileCommonInfoVo3 == null || (userAccountInfo = profileCommonInfoVo3.getUserAccountInfo()) == null || (accountType = userAccountInfo.getAccountType()) == null || accountType.intValue() != 3) && profileLinkData.getUrl() != null) {
                    IComplianceBusinessService iComplianceBusinessServiceLJI = ComplianceServiceProvider.LJI();
                    String url2 = profileLinkData.getUrl();
                    if (url2 != null) {
                        str3 = url2;
                    }
                    if (iComplianceBusinessServiceLJI.LJ(str3)) {
                        sparkContext.LJJJJZ(new C1266310j3d(this, 0));
                    }
                }
            }
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    public final int qq(String str) {
        try {
            String strLJJIFFI = u.LJJIFFI(str, "0x", "", false);
            if (strLJJIFFI != null) {
                CharsKt__CharJVMKt.checkRadix(16);
                return CastIntegerProtector.parseInt(strLJJIFFI, 16);
            }
            return 402665472;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 402665472;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void up(View view) {
        if (view != null) {
            String str = "";
            if (C2532609wC.LIZIZ()) {
                IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
                if (iHeaderBioAbility != null) {
                    String str2 = this.assemTagInternal;
                    if (str2 != null) {
                        str = str2;
                    }
                    iHeaderBioAbility.rQ2(this.LLJILLL, view, str);
                    return;
                }
                return;
            }
            IHeaderBioAbility iHeaderBioAbility2 = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
            if (iHeaderBioAbility2 == null) {
                return;
            }
            String str3 = this.assemTagInternal;
            if (str3 != null) {
                str = str3;
            }
            iHeaderBioAbility2.LJIIIZ(this.LLJILLL, view, str);
        }
    }

    public static void Ep(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkhTrawsCIGJE0yMCeJwig2CgHwvwysoA==", null));
    }

    public final void fq(Context context, String str) {
        String strLIZIZ;
        String strLIZ = C1ECD.LIZ();
        if (C123100dR.LIZ(strLIZ) && strLIZ != null) {
            if (a0.LJJIIZI(str, "?", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("&tt_ab_version_id=");
                sbLIZ.append(strLIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("?tt_ab_version_id=");
                sbLIZ2.append(strLIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            iq(context, strLIZIZ);
            return;
        }
        iq(context, str);
    }

    public final void iq(Context context, String str) {
        lq("in_app_viewer", null);
        C1066710drh c1066710drh = new C1066710drh(str);
        Map<String, String> mapAq = aq();
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = str;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(402665476);
        sparkThirdContext.seclinkConfig = new SeclinkConfig(true, "bio_url");
        sparkThirdContext.callback = c1066710drh;
        sparkThirdContext.titleBar = new C1BHW(mapAq);
        C1066700drg.LIZ.getClass();
        sparkThirdContext.actions = C1066700drg.LIZJ(context, c1066710drh, mapAq);
        sparkThirdContext.disableOpenInSystem = true;
        C1554300qY8.LIZIZ(context, sparkThirdContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.lang.String] */
    public final void jq(Context context, ProfileLinkData profileLinkData) {
        UserProfileInfo userProfileInfo;
        String uid;
        Object obj;
        String uid2;
        UserProfileInfo userProfileInfo2;
        C259800zU c259800zU = new C259800zU();
        ?? backupUrl = profileLinkData.getBackupUrl();
        if (backupUrl == 0) {
            return;
        }
        c259800zU.element = backupUrl;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        String str = "";
        String str2 = "tiktok_selfhomepage_icon";
        if (C2277041EAs.LIZIZ()) {
            Pair[] pairArr = new Pair[5];
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(C2277041EAs.LIZ()));
            pairArr[0] = new Pair("tt_ab_vids", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            pairArr[1] = new Pair("redirect_url", Tp());
            Integer lemon8LinkType = profileLinkData.getLemon8LinkType();
            if (lemon8LinkType != null && lemon8LinkType.intValue() == 1) {
                obj = "homepage_badge";
            } else if (q1()) {
                obj = "tiktok_selfhomepage_icon";
            } else {
                obj = "tiktok_otherhomepage_icon";
            }
            pairArr[2] = new Pair("from_scene", obj);
            C844470XAv.LIZ.getClass();
            pairArr[3] = new Pair("app_id", String.valueOf(C844470XAv.LJIIJ));
            ProfileCommonInfo profileCommonInfoVo = Vo();
            if (profileCommonInfoVo == null || (userProfileInfo2 = profileCommonInfoVo.getUserProfileInfo()) == null || (uid2 = userProfileInfo2.getUid()) == null) {
                uid2 = "";
            }
            pairArr[4] = new Pair("from_user_id", uid2);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Uri.Builder builderBuildUpon = UriProtector.parse((String) c259800zU.element).buildUpon();
            builderBuildUpon.appendQueryParameter("amp_extra", C08JS.LIZLLL(mapLJIIJ));
            builderBuildUpon.appendQueryParameter("pid", "tiktok_connect");
            c259800zU.element = builderBuildUpon.toString();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("urlWithParams after appended = ");
            sbLIZ.append((String) c259800zU.element);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (((Boolean) C1ECD.LIZJ.getValue()).booleanValue()) {
            Pair[] pairArr2 = new Pair[4];
            Integer lemon8LinkType2 = profileLinkData.getLemon8LinkType();
            if (lemon8LinkType2 != null && lemon8LinkType2.intValue() == 1) {
                str2 = "homepage_badge";
            } else if (!q1()) {
                str2 = "tiktok_otherhomepage_icon";
            }
            pairArr2[0] = new Pair("from_scene", str2);
            pairArr2[1] = new Pair("redirect_url", Tp());
            pairArr2[2] = new Pair("pid", "tiktok_connect");
            ProfileCommonInfo profileCommonInfoVo2 = Vo();
            if (profileCommonInfoVo2 != null && (userProfileInfo = profileCommonInfoVo2.getUserProfileInfo()) != null && (uid = userProfileInfo.getUid()) != null) {
                str = uid;
            }
            pairArr2[3] = new Pair("from_user_id", str);
            Map<String, String> mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
            String lemon8DeepLinkValue = profileLinkData.getLemon8DeepLinkValue();
            if (lemon8DeepLinkValue != null) {
                mapLJIIJ2.put("lemon8_deep_link_value", lemon8DeepLinkValue);
            }
            String lemon8CppAndroidPageId = profileLinkData.getLemon8CppAndroidPageId();
            if (lemon8CppAndroidPageId != null) {
                mapLJIIJ2.put("cpp_link", lemon8CppAndroidPageId);
            }
            Integer lemon8LinkType3 = profileLinkData.getLemon8LinkType();
            if (lemon8LinkType3 != null && lemon8LinkType3.intValue() == 1) {
                mapLJIIJ2.put("entry", "top_creator_badge");
            }
            C1254160ik2.LIZIZ.LJIIJJI(c19egLIZ, mapLJIIJ2, new AwS420S0200000_19(this, profileLinkData, 143), new AwS263S0300000_19(this, (BioProfileLinkComponent) context, (Context) c259800zU, (C259800zU<String>) 17));
            return;
        }
        fq(context, (String) c259800zU.element);
    }

    public final void lq(String str, ProfileLinkData profileLinkData) {
        String str2;
        String str3;
        String aid;
        String requestId;
        UserProfileInfo userProfileInfo;
        String uid;
        C1253220iiW c1253220iiWRP2;
        Aweme aweme;
        C1253220iiW c1253220iiWRP22;
        Aweme aweme2;
        C1253220iiW c1253220iiWRP23;
        Integer lemon8LinkType;
        if (profileLinkData != null && (lemon8LinkType = profileLinkData.getLemon8LinkType()) != null && lemon8LinkType.intValue() == 1) {
            str2 = "homepage_badge";
        } else if (q1()) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        C1254160ik2 c1254160ik2 = C1254160ik2.LIZIZ;
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        String str4 = "";
        if (profileBaseAbility == null || (c1253220iiWRP23 = profileBaseAbility.rP2()) == null || (str3 = c1253220iiWRP23.LIZ) == null) {
            str3 = "";
        }
        ProfileBaseAbility profileBaseAbility2 = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility2 == null || (c1253220iiWRP22 = profileBaseAbility2.rP2()) == null || (aweme2 = c1253220iiWRP22.LIZJ) == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        ProfileBaseAbility profileBaseAbility3 = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility3 == null || (c1253220iiWRP2 = profileBaseAbility3.rP2()) == null || (aweme = c1253220iiWRP2.LIZJ) == null || (requestId = aweme.getRequestId()) == null) {
            requestId = "";
        }
        ProfileCommonInfo profileCommonInfoVo = Vo();
        if (profileCommonInfoVo != null && (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) != null && (uid = userProfileInfo.getUid()) != null) {
            str4 = uid;
        }
        c1254160ik2.LJIILLIIL(str2, str, str3, aid, requestId, str4);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJJJJJL(this.LLLF, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }
}
