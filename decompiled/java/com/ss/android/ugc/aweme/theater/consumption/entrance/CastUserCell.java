package com.ss.android.ugc.aweme.theater.consumption.entrance;

import X.C01GW;
import X.C034J;
import X.C13LP;
import X.C1847590yBB;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS143S0100000_8;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Avatar;
import com.ss.android.ugc.aweme.feed.model.ImageThumb;
import com.ss.android.ugc.aweme.feed.model.UserBaseInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class CastUserCell extends PowerCell<C034J> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 415));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 417));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 416));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 418));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ne;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1847590yBB c1847590yBB = (C1847590yBB) this.LLILLJJLI.getValue();
        if (c1847590yBB != null) {
            c1847590yBB.setOutlineWidth(C418440Gaw.LIZIZ(3));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String nickname;
        UserBaseInfo userBaseInfo;
        UserBaseInfo userBaseInfo2;
        Avatar avatar;
        ImageThumb imageThumb;
        List<String> urlList;
        Object objLJJJLL;
        C427660Gpo c427660Gpo;
        super.onBindItemView(interfaceC1891350zJl);
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 136), this.itemView);
        C034J item = getItem();
        if (item != null && (userBaseInfo2 = item.LL) != null && (avatar = userBaseInfo2.getAvatar()) != null && (imageThumb = avatar.getImageThumb()) != null && (urlList = imageThumb.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null && (c427660Gpo = (C427660Gpo) this.LL.getValue()) != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, objLJJJLL, false, null, null, false, false, null, null, false, null, 1022);
        }
        TextView textView = (TextView) this.LLILZ.getValue();
        if (textView != null) {
            C034J item2 = getItem();
            if (item2 != null && (userBaseInfo = item2.LL) != null) {
                nickname = userBaseInfo.getNickname();
            } else {
                nickname = null;
            }
            textView.setText(nickname);
        }
    }
}
