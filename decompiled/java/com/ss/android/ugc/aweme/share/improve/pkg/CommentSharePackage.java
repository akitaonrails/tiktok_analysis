package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C1351870lHd;
import X.C1370940lmO;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS80S0500000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentSharePackage extends LinkDefaultSharePackage {
    public static final C1351870lHd Companion = new C1351870lHd();
    public Function1<? super Function0<Unit>, Unit> aclCheck;
    public Aweme aweme;
    public Comment comment;

    public CommentSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        if (interfaceC1369790lkX != null && interfaceC1369790lkX.LJJIII()) {
            Function1<? super Function0<Unit>, Unit> function1 = this.aclCheck;
            if (function1 != null) {
                function1.invoke(new AwS80S0500000_21(this, (CommentSharePackage) context, (Context) interfaceC1369790lkX, (InterfaceC1369790lkX) view, (View) function0, (Function0<Unit>) 0));
                return;
            } else {
                super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
                return;
            }
        }
        super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
    }
}
