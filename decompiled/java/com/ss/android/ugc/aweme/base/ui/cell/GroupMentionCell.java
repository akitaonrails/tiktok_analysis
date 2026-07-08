package com.ss.android.ugc.aweme.base.ui.cell;

import X.C01GW;
import X.C03IT;
import X.C0ZE7;
import X.C13LE;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C20742216Eq;
import X.C295780Bia;
import X.C295880Bik;
import X.C316560Cb0;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C523420Kfs;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1606090rtf;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS85S0500000_31;
import wh6.AbS497S0200000_4;

/* JADX INFO: loaded from: classes32.dex */
public final class GroupMentionCell extends PowerCell<C316560Cb0> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS85S0500000_31(this, C13LE.LIZ(MentionContainerViewModel.class), AFwS221S0000000_31.get$arr$(96), AFwS276S0000000_31.get$arr$(291), (Function0) null, 1));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 240));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 242));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 243));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 241));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 244));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 245));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C427690Gpr.LIZLLL(this.itemView, 0);
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLJJLI.getValue();
        C1608750rxx config = avatarComponentView.getConfig();
        new AwS610S0100000_31(this, 126).invoke(config.LIZ);
        config.LIZJ(new C1607280rva(new C1607310rvd(EnumC1606090rtf.COMMENT, (C0ZE7) this.LLIZ.getValue(), false, false, ((MentionContainerViewModel) this.LL.getValue()).LLILLJJLI, 110)));
        config.LIZ(AFwS276S0000000_31.get$arr$(51));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C316560Cb0 c316560Cb0 = (C316560Cb0) interfaceC1891350zJl;
        ((TextView) this.LLILLL.getValue()).setText(c316560Cb0.LLILLJJLI);
        TextView textView = (TextView) this.LLILZ.getValue();
        StringBuilder sb = new StringBuilder(" · ");
        sb.append(this.itemView.getContext().getString(2131831444));
        textView.setText(sb);
        TextView textView2 = (TextView) this.LLILZIL.getValue();
        Context context = this.itemView.getContext();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(c316560Cb0.LLILLL));
        if (c316560Cb0.LLILZ != 0) {
            sb2.append(" · ");
            sb2.append(context.getString(2131827514, context.getString(c316560Cb0.LLILZ)));
        }
        textView2.setText(sb2.toString());
        ((C20742216Eq) this.LLILZLL.getValue()).setGuidelineEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        if (c316560Cb0.LLILZIL.length() > 0) {
            ((AvatarComponentView) this.LLILLJJLI.getValue()).LJIIJ(new C03IT(Collections.singletonList(c316560Cb0.LLILZIL)));
        }
        C786410Ut5.I7(new AbS497S0200000_4(this, c316560Cb0, 1), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (C295880Bik.LIZLLL && !C295780Bia.LIZIZ) {
            CommentService.LIZ.getClass();
            return C786410Ut5.Td(C786410Ut5.ne(C523420Kfs.LIZ().getCommentThemeContext(viewGroup.getContext())), R.layout.dll, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dll, viewGroup, false);
    }
}
