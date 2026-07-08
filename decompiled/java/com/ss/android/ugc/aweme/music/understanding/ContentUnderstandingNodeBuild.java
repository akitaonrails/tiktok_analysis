package com.ss.android.ugc.aweme.music.understanding;

import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class ContentUnderstandingNodeBuild implements IContentUnderstandingNodeBuild {
    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingNodeBuild
    public final List<PipelineNodeConfig> LIZ() {
        ContentPipelineTags contentPipelineTags = ContentPipelineTags.INSTANCE;
        return C1697810uHb.LJIIJJI(new PipelineNodeConfig(contentPipelineTags.m274getNODE_LOCAL_EMB_SCANq0GeycQ(), AFwS226S0000000_35.get$arr$(237), null, null, null, 28, null), new PipelineNodeConfig(contentPipelineTags.m275getNODE_LOCAL_EMB_UNDERSTANDq0GeycQ(), AFwS226S0000000_35.get$arr$(238), Collections.singletonList(NodeTag.m282boximpl(contentPipelineTags.m274getNODE_LOCAL_EMB_SCANq0GeycQ())), null, null, 24, null));
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingNodeBuild
    public final List<PipelineNodeConfig> LIZIZ() {
        ContentPipelineTags contentPipelineTags = ContentPipelineTags.INSTANCE;
        return C1697810uHb.LJIIJJI(new PipelineNodeConfig(contentPipelineTags.m273getNODE_COMPRESSq0GeycQ(), AFwS226S0000000_35.get$arr$(234), null, null, null, 28, null), new PipelineNodeConfig(contentPipelineTags.m278getNODE_ZIPq0GeycQ(), AFwS226S0000000_35.get$arr$(235), Collections.singletonList(NodeTag.m282boximpl(contentPipelineTags.m273getNODE_COMPRESSq0GeycQ())), null, null, 24, null), new PipelineNodeConfig(contentPipelineTags.m276getNODE_REQUESTq0GeycQ(), AFwS226S0000000_35.get$arr$(236), Collections.singletonList(NodeTag.m282boximpl(contentPipelineTags.m278getNODE_ZIPq0GeycQ())), null, null, 24, null));
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingNodeBuild
    public final List<PipelineNodeConfig> LIZJ() {
        ContentPipelineTags contentPipelineTags = ContentPipelineTags.INSTANCE;
        return C1697810uHb.LJIIJJI(new PipelineNodeConfig(contentPipelineTags.m277getNODE_WAIT_EXTRACTq0GeycQ(), AFwS226S0000000_35.get$arr$(239), null, null, null, 28, null), new PipelineNodeConfig(contentPipelineTags.m276getNODE_REQUESTq0GeycQ(), AFwS226S0000000_35.get$arr$(240), Collections.singletonList(NodeTag.m282boximpl(contentPipelineTags.m277getNODE_WAIT_EXTRACTq0GeycQ())), null, null, 24, null));
    }
}
