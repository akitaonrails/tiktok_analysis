package kotlin.jvm.internal;

import X.C09AY;
import X.C1232140iAW;
import X.C1242880iRq;
import X.C1252550ihR;
import X.C1255030ilR;
import X.C1255650imR;
import X.C1260090itb;
import X.C1389890mGx;
import X.C19EG;
import X.C2344809Gs;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS24S1400000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS24S1400000_19 awS24S1400000_19, Object obj) {
        if (!((C1255650imR) awS24S1400000_19.l1).LJIIIIZZ()) {
            C1260090itb.LIZIZ.startHeaderDetailActivity((Activity) awS24S1400000_19.l2, (View) awS24S1400000_19.l3, awS24S1400000_19.s0, (User) awS24S1400000_19.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S1400000_19 awS24S1400000_19, Object obj) {
        if (!((C1255650imR) awS24S1400000_19.l1).LJIIIIZZ()) {
            C1260090itb.LIZIZ.startHeaderDetailActivity((Activity) awS24S1400000_19.l2, (View) awS24S1400000_19.l3, awS24S1400000_19.s0, (User) awS24S1400000_19.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS24S1400000_19 awS24S1400000_19, Object obj) {
        if (TextUtils.isEmpty(awS24S1400000_19.s0)) {
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) awS24S1400000_19.l1);
            c1389890mGx.LJIIIZ(2131847054);
            c1389890mGx.LJIIJJI();
            C2344809Gs.LJI(new Exception("SD card is not available"));
        } else {
            HashMap map = new HashMap();
            C1252550ihR.LIZ.getClass();
            String strLIZIZ = C1252550ihR.LIZIZ((User) awS24S1400000_19.l2, "photo", "video");
            if (!TextUtils.isEmpty(strLIZIZ)) {
                map.put("btn_name", strLIZIZ);
            }
            C1232140iAW.LIZ.getClass();
            C1232140iAW.LJIIJ("click_upload_entrance", "click_card", map);
            C1242880iRq.LIZ((View) awS24S1400000_19.l3, (C19EG) awS24S1400000_19.l1, (User) awS24S1400000_19.l2, (C1255030ilR) awS24S1400000_19.l4);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S1400000_19(C1255650imR c1255650imR, C19EG c19eg, AvatarComponentView avatarComponentView, String str, User user, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1255650imR;
        this.l2 = c19eg;
        this.l3 = avatarComponentView;
        this.s0 = str;
        this.l4 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S1400000_19(String str, C19EG c19eg, User user, AvatarComponentView avatarComponentView, Fragment fragment, C1255030ilR c1255030ilR, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19eg;
        this.l2 = user;
        this.l3 = avatarComponentView;
        this.l4 = c1255030ilR;
    }
}
