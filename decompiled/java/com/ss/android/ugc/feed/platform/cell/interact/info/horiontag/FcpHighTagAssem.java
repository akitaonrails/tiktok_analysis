package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.C0BXC;
import X.C0RRQ;
import X.C673150Qan;
import X.C687700QyG;
import X.C693970RJz;
import X.C748302w5;
import X.C748402w6;
import X.InterfaceC494301wD;
import X.InterfaceC697220RWm;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagStruct;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerScope;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpHighTagAssem extends FcpContainerAssem implements VideoTagCategoryProtocol {
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
        Aweme aweme;
        StandardComponentInfo standardComponentInfo;
        StandardTagContainerStruct standardTagContainerStruct;
        List<StandardTagStruct> list;
        if (!C748402w6.LIZ() || !C0BXC.LIZ() || ((aweme = videoItemParams.getAweme()) != null && (standardComponentInfo = aweme.getStandardComponentInfo()) != null && (standardTagContainerStruct = standardComponentInfo.highTag) != null && (list = standardTagContainerStruct.tags) != null && (!list.isEmpty()))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
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

    public FcpHighTagAssem(C748302w5 c748302w5, InterfaceC697220RWm interfaceC697220RWm, C693970RJz c693970RJz) {
        super(c748302w5, "high_tag_standardized_container", interfaceC697220RWm, new C0RRQ(), c693970RJz);
        this.LLLI = c748302w5;
        this.LLLII = interfaceC697220RWm;
        this.LLLIIII = c693970RJz;
    }
}
