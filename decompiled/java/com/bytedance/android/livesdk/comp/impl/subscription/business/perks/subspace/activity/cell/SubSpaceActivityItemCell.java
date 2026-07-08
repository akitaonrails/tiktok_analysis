package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.cell;

import X.C0JBN;
import X.C0KVU;
import X.C1099610eil;
import X.C1119920fFW;
import X.C1324610kZf;
import X.C16F5;
import X.C1819620xS4;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2215111Bmn;
import X.C507890Jvv;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceActivityItemCell extends PowerCell<C507890Jvv> {
    public C1099610eil LL;
    public C16F5 LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C1099610eil) this.itemView.findViewById(R.id.lms);
        this.LLILLJJLI = (C16F5) this.itemView.findViewById(R.id.pfs);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ImageModel avatarMedium;
        User user;
        final C507890Jvv c507890Jvv = (C507890Jvv) interfaceC1891350zJl;
        super.onBindItemView(c507890Jvv);
        if (c507890Jvv.LL != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jvu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C507920Jvy c507920Jvy = c507890Jvv.LLILLJJLI;
                    if (c507920Jvy != null) {
                        c507920Jvy.invoke();
                    }
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                    Context context = this.itemView.getContext();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c507890Jvv.LL.schema);
                    sbLIZ.append("&enter_from=new_activities");
                    iActionHandlerService.handle(context, C2188811AlT.LIZIZ(sbLIZ));
                }
            }, this.itemView);
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            SpaceActivityInfo spaceActivityInfo = c507890Jvv.LL;
            if (spaceActivityInfo != null && (user = spaceActivityInfo.activityFromUserInfo) != null) {
                avatarMedium = user.getAvatarMedium();
            } else {
                avatarMedium = null;
            }
            C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(avatarMedium);
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLJIIIZ.LJJI(this.LL);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String strLIZ = C0KVU.LIZ(c507890Jvv.LL.activityFromUserInfo);
            SpaceActivityInfo spaceActivityInfo2 = c507890Jvv.LL;
            String str = spaceActivityInfo2.activityText;
            if (str == null) {
                str = "";
            }
            String strLIZ2 = C2215111Bmn.LIZ(spaceActivityInfo2.activityTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(' ');
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(strLIZ2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            spannableStringBuilder.append((CharSequence) strLIZIZ);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezq, this.itemView.getContext())), 0, strLIZ.length(), 34);
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, 0, strLIZ.length(), 17, 500);
            int iLJJJ = a0.LJJJ(strLIZIZ, str, 0, false, 6);
            int iLJJJ2 = a0.LJJJ(strLIZIZ, strLIZ2, 0, false, 6);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezq, this.itemView.getContext())), iLJJJ, str.length() + iLJJJ, 34);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezt, this.itemView.getContext())), iLJJJ2, strLIZ2.length() + iLJJJ2, 34);
            C786410Ut5.q2(spannableStringBuilder, new RelativeSizeSpan(0.86f), iLJJJ2, strLIZ2.length() + iLJJJ2, 33);
            C16F5 c16f5 = this.LLILLJJLI;
            if (c16f5 != null) {
                c16f5.setText(spannableStringBuilder);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.ho7, false, 4, null);
    }
}
