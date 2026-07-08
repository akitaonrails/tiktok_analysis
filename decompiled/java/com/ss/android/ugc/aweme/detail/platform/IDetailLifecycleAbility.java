package com.ss.android.ugc.aweme.detail.platform;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public interface IDetailLifecycleAbility extends IDetailBaseAbility {
    boolean Eb2(AwS568S0100000_24 awS568S0100000_24);

    void onAttach(Activity activity);

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onViewCreated(View view, Bundle bundle);
}
