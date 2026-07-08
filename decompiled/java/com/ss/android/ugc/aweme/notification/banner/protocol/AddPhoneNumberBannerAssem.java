package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0C64;
import X.C0XQ7;
import X.C1076010e6h;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1910890zpH;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C296520Bjm;
import X.C452501pT;
import X.C455710Htx;
import X.C624370OeJ;
import X.C637030Oyj;
import X.C637040Oyk;
import X.C637060Oym;
import X.EnumC637310OzB;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class AddPhoneNumberBannerAssem extends InboxBannerAssem {
    public static final List<Integer> LLILZIL = C1697810uHb.LJIIJJI(Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 21, "inbox_add_phone_banner_frequency_control", true)), Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 21, "inbox_add_phone_banner_frequency_control", true)));
    public static final Set<String> LLILZLL = new LinkedHashSet();
    public static final Set<String> LLIZ = new LinkedHashSet();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(267));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    public final void fo() {
        C455710Htx.LIZJ(C455710Htx.LIZIZ, C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, "add_phone_number_guide")));
    }

    public final C1910890zpH ho() {
        return (C1910890zpH) this.LLILZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String string;
        super.onCreate();
        C624370OeJ.LIZ("AddPhoneNumberBannerAssem", "onCreate()");
        boolean z = true;
        if (lo().length() == 0) {
            z = false;
        } else {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (curUser != null && curUser.isPhoneBinded()) {
                ho().LIZ("AddPhoneNumberBannerAssem", "phone already bound, skip");
            } else if (C296520Bjm.LIZ() && !C1076010e6h.LIZJ.LJIIJ().LIZJ()) {
                ho().LIZ("AddPhoneNumberBannerAssem", "V2: no contact permission, skip");
            } else if (LLILZLL.contains(lo())) {
                ho().LIZ("AddPhoneNumberBannerAssem", "already dismissed this session");
            } else if (ko().getBoolean("close_clicked", false)) {
                ho().LIZ("AddPhoneNumberBannerAssem", "permanently dismissed by close click");
            } else {
                int i = ko().getInt("exposure_count", 0);
                List<Integer> list = LLILZIL;
                if (i > list.size()) {
                    C1910890zpH c1910890zpHHo = ho();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("max exposures reached (");
                    sbLIZ.append(i);
                    sbLIZ.append(')');
                    c1910890zpHHo.LIZ("AddPhoneNumberBannerAssem", C2188811AlT.LIZIZ(sbLIZ));
                } else if (LLIZ.contains(lo())) {
                    ho().LIZ("AddPhoneNumberBannerAssem", "shouldShow = true, showing in this session");
                } else {
                    if (i > 0) {
                        int i2 = i - 1;
                        int size = list.size() - 1;
                        if (i2 > size) {
                            i2 = size;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - ko().getLong("last_exposure_time_ms", 0L);
                        if (jCurrentTimeMillis < ((Number) ListProtector.get(list, i2)).longValue() * 86400000) {
                            C1910890zpH c1910890zpHHo2 = ho();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("in cooldown (exposure=");
                            sbLIZ2.append(i);
                            sbLIZ2.append(", elapsed=");
                            sbLIZ2.append(jCurrentTimeMillis / 86400000);
                            sbLIZ2.append("d, need=");
                            sbLIZ2.append(((Number) ListProtector.get(list, i2)).intValue());
                            sbLIZ2.append("d)");
                            c1910890zpHHo2.LIZ("AddPhoneNumberBannerAssem", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    C1910890zpH c1910890zpHHo3 = ho();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("shouldShow = true, exposureCount=");
                    sbLIZ3.append(i);
                    c1910890zpHHo3.LIZ("AddPhoneNumberBannerAssem", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            z = false;
        }
        if (!z) {
            this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
            return;
        }
        C2252321DDq c2252321DDq = this.LL;
        EnumC637310OzB enumC637310OzB = EnumC637310OzB.TOP_SHOW;
        String str = "add_phone_number_banner";
        String str2 = "add_phone_number_banner";
        Context context = getContext();
        String string2 = context != null ? context.getString(2131826706) : null;
        String str3 = "";
        if (string2 == null) {
            string2 = "";
        }
        Context context2 = getContext();
        C637040Oyk c637040Oyk = new C637040Oyk(R.raw.icon_phone, context2 != null ? C1308910kAL.LIZJ(R.attr.a1r, context2) : null);
        UrlModel urlModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Context context3 = getContext();
        if (context3 != null && (string = context3.getString(2131826705)) != null) {
            str3 = string;
        }
        c2252321DDq.setValue(new Pair(enumC637310OzB, new C637060Oym(str, str2, string2, urlModel, c637040Oyk, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, new C637030Oyj(str3, null), true, new AwS607S0100000_28(this, 275), objArr == true ? 1 : 0, 8920)));
    }

    public final Keva ko() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add_phone_banner_");
        sbLIZ.append(lo());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String lo() {
        String uid;
        User curUser = C0XQ7.LJFF().getCurUser();
        return (curUser == null || (uid = curUser.getUid()) == null) ? "" : uid;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    /* JADX INFO: renamed from: do */
    public final void mo243do(C637060Oym c637060Oym) {
        Set<String> set = LLIZ;
        if (!set.contains(lo())) {
            set.add(lo());
            ko().storeInt("exposure_count", ko().getInt("exposure_count", 0) + 1);
            ko().storeLong("last_exposure_time_ms", System.currentTimeMillis());
        }
    }

    public final void mo(String str) {
        C455710Htx.LIZIZ(C455710Htx.LIZIZ, str, String.valueOf(ko().getInt("exposure_count", 0)), C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, "add_phone_number_guide")));
    }
}
