package com.ss.android.ugc.aweme.comment.multiapp;

import X.C2344009Gk;
import X.EnumC1220600hru;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multiapp.ICommentExService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class CommentExServiceImpl implements ICommentExService {
    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LIZ(View view) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final void LIZIZ(C2344009Gk c2344009Gk, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LIZJ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LIZLLL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LJII() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean enableShare() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final int LJI() {
        return EnumC1220600hru.DEFAULT.getValue();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ICommentExService
    public final boolean LJFF() {
        return Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE);
    }
}
