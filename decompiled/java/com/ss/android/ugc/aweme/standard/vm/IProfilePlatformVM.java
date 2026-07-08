package com.ss.android.ugc.aweme.standard.vm;

import X.C0ZP4;
import X.C1251350ifV;
import X.C291001Au;
import X.C443120HZe;
import android.content.Intent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class IProfilePlatformVM extends AssemViewModel<C1251350ifV> {
    public abstract void AQ2();

    public abstract void BQ2();

    public abstract void CQ2(String str);

    public abstract void DQ2(boolean z);

    public abstract void EQ2(Function1<? super C291001Au<Unit>, Unit> function1);

    public abstract C0ZP4 FQ2(Function1<? super C291001Au<Unit>, Unit> function1);

    public abstract void GQ2(Function1<? super Boolean, Unit> function1);

    public abstract void HQ2(AwS598S0100000_19 awS598S0100000_19);

    public abstract C0ZP4 IQ2(Function1<? super C291001Au<? extends C443120HZe<Integer, Integer, ? extends Intent>>, Unit> function1);

    public abstract C0ZP4 JQ2(Function1<? super C291001Au<Boolean>, Unit> function1);

    public abstract C0ZP4 KQ2(Function1<? super Boolean, Unit> function1);

    public abstract Aweme getAweme();

    public abstract boolean isMyProfile();

    public abstract User vQ2();

    public abstract Boolean wQ2();

    public abstract void xQ2();

    public abstract C1251350ifV yQ2();

    public abstract void zQ2(C291001Au<? extends Pair<? extends Exception, Integer>> c291001Au);
}
