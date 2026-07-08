package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.activity.cell;

import X.C0K7S;
import X.C2188811AlT;
import X.C2215121Bmo;
import X.C417410GYh;
import X.C426930God;
import X.C510720K1e;
import X.C511270K3h;
import X.C511420K3w;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS111S0200000_7;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceActivityItemCell extends PowerCell<C510720K1e> {
    public C417410GYh LL;
    public TextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C417410GYh) this.itemView.findViewById(R.id.lms);
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.pfs);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ImageModel avatarMedium;
        User user;
        C510720K1e c510720K1e = (C510720K1e) interfaceC1891350zJl;
        super.onBindItemView(c510720K1e);
        if (c510720K1e.LL != null) {
            C786410Ut5.I7(new ACListenerS111S0200000_7(c510720K1e, this, 71), this.itemView);
            C511420K3w.LJIIJ.getClass();
            C511420K3w c511420K3w = new C511420K3w();
            SpaceActivityInfo spaceActivityInfo = c510720K1e.LL;
            if (spaceActivityInfo != null && (user = spaceActivityInfo.activityFromUserInfo) != null) {
                avatarMedium = user.getAvatarMedium();
            } else {
                avatarMedium = null;
            }
            c511420K3w.LIZ = avatarMedium;
            c511420K3w.LJ = Boolean.TRUE;
            c511420K3w.LJI = ImageView.ScaleType.CENTER_CROP;
            c511420K3w.LIZ(this.LL);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String strLIZ = C0K7S.LIZ(c510720K1e.LL.activityFromUserInfo);
            SpaceActivityInfo spaceActivityInfo2 = c510720K1e.LL;
            String str = spaceActivityInfo2.activityText;
            if (str == null) {
                str = "";
            }
            String strLIZ2 = C2215121Bmo.LIZ(spaceActivityInfo2.activityTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(' ');
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(strLIZ2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            spannableStringBuilder.append((CharSequence) strLIZIZ);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C426930God.LIZ(R.attr.fa8, this.itemView.getContext())), 0, strLIZ.length(), 34);
            C511270K3h.LIZ(spannableStringBuilder, 0, strLIZ.length(), 17, 500);
            int iLJJJ = a0.LJJJ(strLIZIZ, str, 0, false, 6);
            int iLJJJ2 = a0.LJJJ(strLIZIZ, strLIZ2, 0, false, 6);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C426930God.LIZ(R.attr.fa8, this.itemView.getContext())), iLJJJ, str.length() + iLJJJ, 34);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C426930God.LIZ(R.attr.fa_, this.itemView.getContext())), iLJJJ2, strLIZ2.length() + iLJJJ2, 34);
            C786410Ut5.q2(spannableStringBuilder, new RelativeSizeSpan(0.86f), iLJJJ2, strLIZ2.length() + iLJJJ2, 33);
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                textView.setText(spannableStringBuilder);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fh2, false, 4, null);
    }
}
