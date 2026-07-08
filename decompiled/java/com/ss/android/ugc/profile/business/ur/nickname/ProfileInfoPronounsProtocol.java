package com.ss.android.ugc.profile.business.ur.nickname;

import X.C1899620zX6;
import X.C2188811AlT;
import X.C268330AfP;
import X.EnumC1248260iaW;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileInfoPronounsProtocol extends ProfilePlatformProtocol<BizBaseData> {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String LJJJJJL() {
        return " · ";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_account_pronouns";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.FQ2(new AwS598S0100000_19(this, 385));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        Describe describe;
        String text;
        TextView textView;
        StringBuilder sbLIZ;
        UserRelationInfo userRelationInfo;
        T t = this.LLJILJIL;
        if (t != 0 && (describe = t.getDescribe()) != null && (text = describe.getText()) != null) {
            View view = this.LLILZLL;
            if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
                ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
                if (profileCommonInfoLJIILIIL != null && (userRelationInfo = profileCommonInfoLJIILIIL.getUserRelationInfo()) != null && Intrinsics.LJFF(userRelationInfo.isBlocking(), Boolean.TRUE)) {
                    text = "";
                } else if (text.length() > 0 && !C268330AfP.LJIIJJI()) {
                    if (C1899620zX6.LIZ()) {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(text);
                        sbLIZ.append(" · ");
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(" · ");
                        sbLIZ.append(text);
                    }
                    text = C2188811AlT.LIZIZ(sbLIZ);
                }
                textView.setText(text);
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final TextUtils.TruncateAt LJJJJ() {
        if (C268330AfP.LJIIJJI()) {
            return TextUtils.TruncateAt.END;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248260iaW LJJIIZI() {
        return EnumC1248260iaW.TEXT;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            LJJJLZIJ(nVar);
            LJJLIIIJILLIZJL();
            return true;
        }
        return true;
    }
}
