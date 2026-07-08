package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.C0RQ3;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC494301wD;
import X.InterfaceC697220RWm;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerScope;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoMetaTagProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpMetaTagAssem extends FcpContainerAssem implements VideoMetaTagProtocol {
    public final Function0<ClientStandardModel> LLLI;
    public final InterfaceC697220RWm LLLII;
    public final Function0<View> LLLIIII;

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{FcpContainerScope.class});
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(FcpContainerScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(FcpContainerScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1786045749) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C0RQ3.LIZ(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return C0RQ3.LIZ((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        C673150Qan.LIZIZ(this, obj, cls);
    }

    public FcpMetaTagAssem(AwS545S0100000_1 awS545S0100000_1, InterfaceC697220RWm interfaceC697220RWm, AwS555S0100000_11 awS555S0100000_11) {
        super(awS545S0100000_1, "meta_tag_standardized_container", interfaceC697220RWm, AFwS198S0000000_11.get$arr$(13), awS555S0100000_11);
        this.LLLI = awS545S0100000_1;
        this.LLLII = interfaceC697220RWm;
        this.LLLIIII = awS555S0100000_11;
    }
}
