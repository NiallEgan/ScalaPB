// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.source_context

/** `SourceContext` represents information about the source of a
  * protobuf element, like the file in which it is defined.
  *
  * @param fileName
  *   The path-qualified name of the .proto file that contained the associated
  *   protobuf element.  For example: `"google/protobuf/source_context.proto"`.
  */
@SerialVersionUID(0L)
final class SourceContext(
    val fileName: _root_.scala.Predef.String = "",
    val unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[SourceContext] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = fileName
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = fileName
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withFileName(__v: _root_.scala.Predef.String): SourceContext = copy(fileName = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = fileName
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(fileName)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    override def toString(): _root_.scala.Predef.String = s"SourceContext(${fileName}, ${unknownFields})"
    def copy(
      fileName: _root_.scala.Predef.String = fileName,
      unknownFields: _root_.scalapb.UnknownFieldSet = unknownFields
    ): SourceContext = new SourceContext(
      fileName,
      unknownFields
    )
    override def equals(__that: _root_.scala.Any): _root_.scala.Boolean = __that match {
      case __that: SourceContext =>
        this.fileName == __that.fileName &&
        this.unknownFields == __that.unknownFields
      case _ => false
    }
    override def hashCode(): _root_.scala.Int = {
      var __hash: _root_.scala.Int = (19 * 41) + com.google.protobuf.source_context.SourceContext.scalaDescriptor.hashCode()
      __hash = (37 * __hash) + fileName.hashCode()
      __hash = (37 * __hash) + unknownFields.hashCode()
      __hash
    }
    def companion = com.google.protobuf.source_context.SourceContext
}

object SourceContext extends scalapb.GeneratedMessageCompanion[com.google.protobuf.source_context.SourceContext] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.source_context.SourceContext] = this
  def merge(`_message__`: com.google.protobuf.source_context.SourceContext, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.source_context.SourceContext = {
    var __fileName = `_message__`.fileName
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __fileName = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.source_context.SourceContext(
        fileName = __fileName,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.source_context.SourceContext] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.source_context.SourceContext(
        fileName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SourceContextProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SourceContextProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.source_context.SourceContext(
    fileName = ""
  )
  implicit class SourceContextLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.source_context.SourceContext]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.source_context.SourceContext](_l) {
    def fileName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.fileName)((c_, f_) => c_.copy(fileName = f_))
  }
  final val FILE_NAME_FIELD_NUMBER = 1
  def of(
    fileName: _root_.scala.Predef.String
  ): _root_.com.google.protobuf.source_context.SourceContext = new _root_.com.google.protobuf.source_context.SourceContext(
    fileName
  )
  def apply(
    fileName: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
  ): _root_.com.google.protobuf.source_context.SourceContext = new _root_.com.google.protobuf.source_context.SourceContext(
    fileName,
    unknownFields
  )
  def unapply(__value: _root_.com.google.protobuf.source_context.SourceContext): Option[(
    _root_.scala.Predef.String
  )] = Some((
    __value.fileName
  ))
}
